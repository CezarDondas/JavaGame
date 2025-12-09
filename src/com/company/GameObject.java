package com.company;

import java.awt.*;


//Clasa va referi toate obiectele din joc(student,restante)
//Reprezinta o clasa abstracta ce va fi mostenita in clasele obiectelor si
//acestea vor folosi toate metodele de aici
public abstract class GameObject {
    protected int x,y;
    protected ID id;
    protected float velX,velY;


    //variabile ce vor controla viteza in "sus" si in "jos"
    //adica pe axa Ox si Oy (velocity)
    public GameObject(int x,int y,ID id){
        this.x=x;
        this.y=y;
        this.id=id;

        //constructor cu parametri ce vor seta pozitia obiectului in joc si id-ul acestuia
    }
    public abstract void update(); //le vom folosi in clasele obiectelor
    public abstract void render(Graphics g);
    public abstract Rectangle getBounds();


    public void setX(int x){
        this.x=x;
    }
    public void setY(int y){
        this.y=y;
    }
    public int getX(){
        return x;
    }
    public int getY(){
        return y;
    }
    public void setId(ID id){
        this.id=id;
    }
    public ID getId(){
        return id;
    }
    public void setVelX(float velX){
        this.velX=velX;
    }
    public float getVelX(){
        return velX;
    }
    public void setVelY(float velY){
        this.velY=velY;
    }
    public float getVelY(){
        return velY;
    }

}
