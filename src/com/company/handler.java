package com.company;

//controleaza procesele, va parcurge fiecare obiect din joc, le va randa
//si dupa le va updata pe ecran


import java.awt.*;
import java.util.LinkedList;

public class handler {
    //Am creat o lista de obiecte pentru a le parcurge mai usor,
    //pentru a le adauga/scoate mai eficient
    LinkedList<GameObject>object= new LinkedList<>();
    //Se vor folosi in keyevent-uri pentru jucator
    private boolean up=false,down=false,left=false,right=false;


    public void update(){
        for(int i=0;i<object.size();i++){
            GameObject tempObject=object.get(i);
            tempObject.update();
        }

    }
    public void render(Graphics g){
        for(int i=0;i<object.size();i++){
            GameObject tempObject=object.get(i);
            tempObject.render(g);

        }

    }
    public void addObject(GameObject object){
        this.object.add(object);
    }
    public void removeObject(GameObject object){
        this.object.remove(object);
    }

    public boolean isUp() {
        return up;
    }

    public boolean isDown() {
        return down;
    }

    public boolean isLeft() {
        return left;
    }

    public boolean isRight() {
        return right;
    }

    public void setUp(boolean up) {
        this.up = up;
    }

    public void setDown(boolean down) {
        this.down = down;
    }

    public void setLeft(boolean left) {
        this.left = left;
    }

    public void setRight(boolean right) {
        this.right = right;
    }
}
