package com.company;

import java.awt.*;
import java.awt.image.BufferStrategy;



public class Game extends Canvas implements Runnable{
    public static final int  WIDTH= 1024, HEIGHT= 768;



    private Thread thread;
    private boolean running=false;


    private handler hand=new handler();
    private HP hud=new HP();
    private RefLinks refLink=new RefLinks(this);
    private Spawn spawn=new Spawn(hand,hud,refLink);
    public  State playState=new PlayState(refLink);
    public State menuState=new MenuState(refLink);
    public State pauseState=new PauseState(refLink);
    public State helpState=new HelpState(refLink);
    public State restantState=new RestantState(refLink,hud);
    public State playStateLevel2=new PlayStateLevel2(refLink);
    public State promovatState=new PromovatState(refLink);





    public Game(){

        new Window(WIDTH,HEIGHT, "Terror of AC",this);

        //!!E un joc care genereaza multa frustrare, nici nu stii cum ti se scade jumatate din viata :)) !!
        //E un joc bazat pe haos, un fel de metafora, ca si viata unui student :))
        this.addKeyListener(new KeyInput(hand,refLink));
        this.addMouseListener(new MouseInput(refLink,hand,hud));
        Assets.Init();
        State.SetState(menuState);

    }

    public synchronized void start(){
        thread=new Thread(this);
        thread.start();
        running=true;


    }
    public synchronized void stop(){
        try{
            thread.join();
            running=false;


        }catch(Exception e){

            e.printStackTrace();
        }



    }
    public void run(){
        this.requestFocus();
        long lastTime=System.nanoTime();
        double amountOfTicks=60.0;
        double ns=1000000000/amountOfTicks;
        double delta=0;
        long timer=System.currentTimeMillis();
        int frames=0;
        while(running){
            long now=System.nanoTime();
            delta +=(now-lastTime)/ns;
            lastTime=now;
            while(delta>=1){
                update();
                delta--;
            }
            if(running)
                render();
        }
        frames++;
        if(System.currentTimeMillis()-timer>1000){
            timer+=1000;
            System.out.println("FPS: "+ frames);
            frames=0;
        }
        stop();

    }
    private void update(){


        if(State.GetState()==playState){
            State.GetState().Update();
            hand.update();
            hud.update();
            spawn.update();

        }else if(State.GetState()==playStateLevel2){
            State.GetState().Update();
            hand.update();
            hud.update();
            spawn.update();
        }else if(State.GetState()==menuState){
            State.GetState().Update();
        }else if(State.GetState()==pauseState){
            State.GetState().Update();
        }else if(State.GetState()==helpState){
            State.GetState().Update();
        }else if(State.GetState()==restantState)
        {
            State.GetState().Update();
        }else if(State.GetState()==promovatState){
            State.GetState().Update();
        }






    }
    private void render(){
        BufferStrategy bs=this.getBufferStrategy();
        if(bs==null){
            this.createBufferStrategy(3);
            return;
        }
        Graphics g=bs.getDrawGraphics();
        g.clearRect(0,0,WIDTH,HEIGHT);





        ///////////////DRAW!!!

        if(State.GetState()==playState){
            State.GetState().Draw(g);
            hand.render(g);
            hud.render(g);
        }else if(State.GetState()==playStateLevel2){
            State.GetState().Draw(g);
            hand.render(g);
            hud.render(g);
        }else if(State.GetState()==menuState){
            State.GetState().Draw(g);


        }else if(State.GetState()==pauseState){
            State.GetState().Draw(g);
        }else if(State.GetState()==helpState){
            State.GetState().Draw(g);
        }else if(State.GetState()==restantState)
        {
            State.GetState().Draw(g);
        }else if(State.GetState()==promovatState){
            State.GetState().Draw(g);
        }




















        //////////////////////END_DRAW!!!
        g.dispose();
        bs.show();

    }
    //Voi folosi metoda aceasta ca sa delimitez minimul si maximul in care un obiect se poate deplasa
    //sau pentru HEALTH BAR(sa nu paraseasca dreptunghiul care reprezinta viata jucatorului)
    public static double getBoundScreen(double var,double min,double max){
        if(var>=max)
            return max;
        else if(var<=min)
            return min;
        else
            return var;
    }
    //Gettere pentru lungime, respectiv latimea ferestrei jocului
    public int GetWidth(){return WIDTH;}
    public int GetHeight(){return HEIGHT;}











    public static void main(String []args){
        new Game();

    }
}
