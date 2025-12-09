package com.company;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class KeyInput extends KeyAdapter {
    private handler hand;
    private RefLinks refLink;
    public KeyInput(handler hand,RefLinks refLink){
        this.hand=hand;
        this.refLink=refLink;
    }
    public void keyPressed(KeyEvent e){
        int key=e.getKeyCode();
        if(State.GetState()==refLink.GetGame().playState || State.GetState()==refLink.GetGame().playStateLevel2) {
            if (key == KeyEvent.VK_P) {
                State.SetState(refLink.GetGame().pauseState);

            }
        }
        for(int i=0;i<hand.object.size();i++){
            GameObject tempObject=hand.object.get(i);
            if(tempObject.getId()==ID.Player)
            {
                if(key==KeyEvent.VK_W) hand.setUp(true);//tempObject.setVelY(-3);
                if(key==KeyEvent.VK_S) hand.setDown(true);//tempObject.setVelY(3);
                if(key==KeyEvent.VK_D) hand.setLeft(true);//tempObject.setVelX(3);
                if(key==KeyEvent.VK_A) hand.setRight(true);//tempObject.setVelX(-3);

            }

        }




    }
    public void keyReleased(KeyEvent e){
        int key=e.getKeyCode();
        for(int i=0;i<hand.object.size();i++){
            GameObject tempObject=hand.object.get(i);
            if(tempObject.getId()==ID.Player)
            {
                if(key==KeyEvent.VK_W) hand.setUp(false);//tempObject.setVelY(0);
                if(key==KeyEvent.VK_S) hand.setDown(false);//tempObject.setVelY(0);
                if(key==KeyEvent.VK_D) hand.setLeft(false);//tempObject.setVelX(0);
                if(key==KeyEvent.VK_A) hand.setRight(false);//tempObject.setVelX(0);

            }

        }

    }
}
