package com.company;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MouseInput implements MouseListener {

    private RefLinks refLink;
    private handler hand;
    private HP hud;
    public MouseInput(RefLinks refLink,handler hand,HP hud){
        this.refLink=refLink;
        this.hand=hand;
        this.hud=hud;

    }



    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {
        int mx=e.getX();
        int my=e.getY();
        //Atunci cand ne aflam in menustate si apasam click in acea zona
        //a ecranului, se va face switch-ul intre state-uri
        if(State.GetState()==refLink.GetGame().menuState) {
            //PLAY!
            if (mx >= 290 && mx <= 290 + 400) {
                if (my >= 250 && my <= 250 + 100) {
                    State.SetState(refLink.GetGame().playState);


                }
            }
            //HELP! - to be continue..
            if(mx>=290 && mx<=290+400) {
                if (my >= 400 && my <= 400 + 100) {
                    State.SetState(refLink.GetGame().helpState);

                }


            }

            //QUIT!
            if (mx >= 290 && mx <= 290 + 400) {
                if (my >= 550 && my <= 550 + 100) {
                    System.exit(1);
                }
            }
        }
        if(State.GetState()==refLink.GetGame().pauseState) {
            //CONTINUE!
            if (mx >= 200 && mx <= 200 + 550) {
                if (my >= 250 && my <= 250 + 100) {
                    State.SetState(refLink.GetGame().playState);


                }
            }
            //TEMPORAR PENTRU TESTAT RAMANE ASA(DUPA CE TERMIN WAVE-URILE DE IMPLEMENTAT RECTIFIC)!!!!!
            if(hud.getWave()==16 || hud.getWave()==17 || hud.getWave()==18 || hud.getWave()==19|| hud.getWave()==20 ||
            hud.getWave()==21 || hud.getWave()==22 || hud.getWave()==23 || hud.getWave()== 24 || hud.getWave()==25 || hud.getWave()==26) {
                if (mx >= 200 && mx <= 200 + 550) {
                    if (my >= 250 && my <= 250 + 100) {
                        State.SetState(refLink.GetGame().playStateLevel2);


                    }
                }
            }
            //HELP! - to be continue..
            if(mx>=290 && mx<=290+400) {
                if (my >= 400 && my <= 400 + 100) {
                    State.SetState(refLink.GetGame().helpState);

                }


            }




            //QUIT!
            if (mx >= 290 && mx <= 290 + 400) {
                if (my >= 550 && my <= 550 + 100) {
                    System.exit(1);
                }
            }
        }
        if(State.GetState()==refLink.GetGame().helpState) {
            //BACK!
            if (mx >= 290 && mx <= 290 + 400) {
                if (my >= 620 && my <= 620 + 100) {
                    State.SetState(refLink.GetGame().pauseState);
                }
            }
        }
        //BACK TO MENU! - dead
        if(State.GetState()==refLink.GetGame().restantState){
            if(mx>=170 && mx<=170+610){
                if(my>=525 && my<=525+90){
                    hud.setScore(0);
                    hud.setWave(0);
                    hud.setLevel(1);
                    hud.setHealth(100);
                    State.SetState(refLink.GetGame().menuState);

                }

            }

        }
        //BACK TO MENU! - victory
        if(State.GetState()==refLink.GetGame().promovatState){
            if(mx>=170 && mx<=170+610){
                if(my>=525 && my<=525+90){
                    hud.setScore(0);
                    hud.setWave(0);
                    hud.setLevel(1);
                    hud.setHealth(100);
                    State.SetState(refLink.GetGame().menuState);

                }

            }

        }






    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}
