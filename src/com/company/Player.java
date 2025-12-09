package com.company;

import java.awt.*;
import java.awt.image.BufferedImage;

public class Player extends GameObject{

    private handler hand;
    private BufferedImage player_ss;












    public Player(int x, int y, ID id,handler hand) {
        super(x, y, id);
        this.hand=hand;

        player_ss=Assets.playerIdle;



    }






    public void update() {
        //Se incrementeaza pozitia de pe ox si oy cu viteza de miscare(3,5,10.. etc)
        //cand miscam dreapta, stanga, sus, jos sa se incarce un spritesheet diferit(animatie)
        x += velX;
        y += velY;

        if (hand.isUp()) {

            player_ss = Assets.playerIdle;
            setVelY(-6);
        } else if (!hand.isDown()) {

                player_ss = Assets.playerIdle;
                setVelY(0);
        }

        if (hand.isDown()) {

            player_ss = Assets.playerIdle;
            setVelY(6);
        } else if (!hand.isUp()) {

                player_ss = Assets.playerIdle;
                setVelY(0);
        }

        if (hand.isLeft()) {

            player_ss = Assets.playerRight;
            setVelX(6);
        } else if (!hand.isRight()) setVelX(0);

        if (hand.isRight()) {

            player_ss = Assets.playerLeft;
            setVelX(-6);
        } else if (!hand.isLeft()) {

            player_ss = Assets.playerIdle;
            setVelX(0);
            }

        //Aici este implementat concenptul de bound pentru ecran(sa nu iasa in afara ecranului)
        x= (int) Game.getBoundScreen(x,32,Game.WIDTH-113);
        y= (int) Game.getBoundScreen(y,0,Game.HEIGHT-127);


        colission();


    }
    private void colission(){
        //parcurgem fiecare obiect din joc, obiectul gasit il punem intr-un obiect temporar
        //daca acel obiect temporar este chiar o restanta Poo si se intersecteaza cu eroul
        // sa i se scada x din viata curenta



        for(int i=0;i<hand.object.size();i++) {
            //DAMAGE!!!!!!!!!!!!!!!
            GameObject tempO = hand.object.get(i);
            if (tempO.getId() == ID.Poo || tempO.getId() == ID.Deea || tempO.getId() == ID.Ts) {
                if (getBounds().intersects(tempO.getBounds())) {
                    //if (HP.score >= 50 || HP.score <= 49)
                    HP.health -= 0.25;
                }
            }


            if (tempO.getId() == ID.Matlab || tempO.getId() == ID.Mn || tempO.getId() == ID.Pa) {
                if (getBounds().intersects(tempO.getBounds())) {
                    HP.health -= 0.5;

                }

            }
            if (tempO.getId() == ID.Pla || tempO.getId() == ID.Spd) {
                if (getBounds().intersects(tempO.getBounds())) {
                    HP.health -= 1.5;


                }
            }
            if (tempO.getId() == ID.Paoo || tempO.getId() == ID.Java) {
                if (getBounds().intersects(tempO.getBounds())) {
                    HP.health -= 2;


                }

            }
            if (tempO.getId() == ID.So || tempO.getId() == ID.SoFast) {
                if (getBounds().intersects(tempO.getBounds())) {
                    HP.health -= 2.5;


                }

            }
            if (tempO.getId() == ID.Kotlin || tempO.getId() == ID.KotlinFast) {
                if (getBounds().intersects(tempO.getBounds())) {
                    HP.health -= 3;


                }

            }
            if (tempO.getId() == ID.BigPla) {
                if (getBounds().intersects(tempO.getBounds())) {
                    HP.health -= 30;


                }

            }
            if (tempO.getId() == ID.BigKotlin) {
                if (getBounds().intersects(tempO.getBounds())) {
                    HP.health -= 50;


                }

            }
            //HEALTH_BONUS!!
            //Daca te intersectezi cu acest obiect iti va creste viata cu +5 din viata curenta si va disparea
            //Viata va aparea in momente cheie din joc, atunci cand consider eu ca ai viata din ce in ce mai putina
            if (tempO.getId() == ID.HealthBonus) {
                if (getBounds().intersects(tempO.getBounds())) {
                    if(HP.health<100) {
                        HP.health += 5;
                        hand.removeObject(tempO);
                    }


                }

            }









        }
    }










    public void render(Graphics g) {




        g.drawImage(player_ss,x,y,null);







    }



    public Rectangle getBounds() {

        return new Rectangle(x,y,64,64);
    }



}


