package com.company;

import java.awt.*;

public class HP {
    public static double health=100;
    private int score=0;
    private int wave=0;
    private int Level=1;


    public void update(){
        score+=1;

        //Aceasta metoda impiedica health bar-ul sa iasa din ecran si sa se
        //opreasca la minimul de 0 din figura geometrica pe care am desenat-o in
        //metoda render de mai jos
        health=Game.getBoundScreen( health,0,100);

    }
    public void render(Graphics g){
        //Scorul
        g.setColor(new Color(255,42,42));
        g.setFont(new Font("Visitor TT1 BRK",Font.BOLD,19));
        g.drawString("SCORE: "+ score,3,30);

        //HEALTH BAR
        g.setColor(Color.black);
        g.fillRect(3,6,100,10);
        g.setColor(new Color(255,42,42));
        g.fillRect(3,6, (int) (health),10);
        g.setColor(Color.black);
        g.drawRect(3,6,100,10);
        //WAVES
        g.setColor(new Color(255,42,42));
        g.setFont(new Font("Visitor TT1 BRK",Font.BOLD,19));
        g.drawString("WAVE: "+ wave,3,50);
        //LEVEL
        g.setColor(new Color(255,42,42));
        g.setFont(new Font("Visitor TT1 BRK",Font.BOLD,19));
        g.drawString("LEVEL "+Level,450,20);






    }
    public void setScore(int score){
        this.score=score;
    }
    public int getScore(){
        return score;
    }
    public int getWave(){ return wave;}
    public void setWave(int wave){this.wave=wave;}
    public void setHealth(double health){
        this.health=health;

    }
    public double getHealth(){
        return health;
    }
    public void setLevel(int Level){ this.Level=Level;}

}
