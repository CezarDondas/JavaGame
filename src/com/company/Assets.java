package com.company;



import java.awt.image.BufferedImage;

public class Assets {
    public static BufferedImage playerLeft;
    public static BufferedImage playerRight;
    public static BufferedImage playerIdle;
    public static BufferedImage playerDead;
    ////////////////////////////
    public static BufferedImage parchetAlb;
    public static BufferedImage parchetNegru;
    public static BufferedImage pereteInchis;
    public static BufferedImage pereteDeschis;
    public static BufferedImage healthBonus;
    ////////////////////////////
    public static BufferedImage pooEnemy;
    public static BufferedImage matlabEnemy;
    public static BufferedImage deeaEnemy;
    public static BufferedImage tsEnemy;
    public static BufferedImage plaEnemy;
    public static BufferedImage spdEnemy;
    public static BufferedImage bigPla;
    public static BufferedImage menuImage;
    /////////////////////////////
    public static BufferedImage paooEnemy;
    public static BufferedImage javaEnemy;
    public static BufferedImage paEnemy;
    public static BufferedImage kotlinEnemy;
    public static BufferedImage soEnemy;
    public static BufferedImage bigKotlin;


    //Aici vom incarca imaginile pentru fiecare obiect, inamic/restanta.. etc
    //Aici am apelat metodele din SpriteSheet si ImageLoader

    public static void Init(){
        SpriteSheet ss0=new SpriteSheet(ImageLoader.loadImage("/sprite_Cez.png"));
        SpriteSheet ss2=new SpriteSheet(ImageLoader.loadImage("/parchet.png"));
        SpriteSheet ss3=new SpriteSheet(ImageLoader.loadImage("/parchet1.png"));
        SpriteSheet r32=new SpriteSheet(ImageLoader.loadImage("/restantepe32.png"));
        SpriteSheet r64=new SpriteSheet(ImageLoader.loadImage("/restantepe64.png"));
        SpriteSheet menu=new SpriteSheet(ImageLoader.loadImage("/menu_image.png"));
        SpriteSheet pereteLvl2=new SpriteSheet(ImageLoader.loadImage("/peretelvl2.png"));
        SpriteSheet restantelvl2=new SpriteSheet(ImageLoader.loadImage("/restantelvl2.png"));
        SpriteSheet health_bonus=new SpriteSheet(ImageLoader.loadImage("/health_bonus.png"));
        SpriteSheet bigEnemies=new SpriteSheet(ImageLoader.loadImage("/bigEnemies.png"));



        //RESTANTELE CE VOR TREBUI EVITATE(INAMICII JOCULUI)
                //Lvl1 RESTANTE
        //Restante cu dimensiunea 32x32

        deeaEnemy=r32.crop(0,0,32,32);
        matlabEnemy=r32.crop(32*1,0,32,32);
        pooEnemy=r32.crop(32*2,0,32,32);
        tsEnemy=r32.crop(32*3,0,32,32);
        //Restante cu dimensiunea 64x64
        plaEnemy=r64.crop(0,0,64,64);
        spdEnemy=r64.crop(64*1,0,64,64);


        //ELEMENTE DECORATIVE DIN JOC
                //Lvl1
        parchetAlb=ss2.crop(0,0,48,48);
        parchetNegru=ss3.crop(0,0,32,32);

                //Lvl2
        pereteInchis=pereteLvl2.crop(0,0,32,32);
        pereteDeschis=pereteLvl2.crop(32*1,0,32,32);
        menuImage=menu.crop(0,0,1024,768);
        healthBonus=health_bonus.crop(0,0,26,40);
                //Lvl2 RESTANTE
        ///
        paooEnemy=restantelvl2.crop(0,0,64,64);
        javaEnemy=restantelvl2.crop(64*1,0,64,64);
        paEnemy=restantelvl2.crop(64*2,0,64,64);
        kotlinEnemy=restantelvl2.crop(64*3,0,64,64);
        soEnemy=restantelvl2.crop(64*4,0,64,64);
        bigKotlin=bigEnemies.crop(100*1,0,100,100);
        bigPla=bigEnemies.crop(0,0,100,100);





        //SPRITESHEETUL PENTRU STUDENT(EROUL DIN JOC)
        playerIdle=ss0.crop(0,0,64,64);
        playerRight=ss0.crop(64,0,64,64);
        playerLeft=ss0.crop(64*2,0,64,64);
        playerDead=ss0.crop(64*3,0,64,64);






    }
}
