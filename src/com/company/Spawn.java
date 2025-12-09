package com.company;

import com.company.Restante.*;

import java.util.Random;
//Aceasta clasa este folosita pentru a programa spawning time-ul pentru restante
public class Spawn {
    private handler hand;
    private HP hud;
    private RefLinks refLink;
    private int scoreBuffer=0;
    private Random r=new Random();
    //Acest camp reprezinta un scor buffer care creste in acelasi timp cu scorul propriu zis,
    //dar care se reseteaza pe 0 atunci cand ajunge la un anumit scor setat de mine
    //cand ajunge la 500 scor, se reseteaza score buffer-ul si incrementam(sau setam wave-ul+1)
    //Vor exista 2 nivele cum am precizat si in prima parte a acestui joc.
    //Intr-un nivel vor exista wave-uri in functie de cat de departe ajungi sa fie cu atat mai greu
    //de evitat aceste restante


    public Spawn(handler hand,HP hud,RefLinks refLink){
        this.hand=hand;
        this.hud=hud;
        this.refLink=refLink;
    }
    public void update(){
        scoreBuffer++;
        if(scoreBuffer>=500) {
            scoreBuffer = 0;
            //Pentru primul wave am lasat sa fie gol pentru a testa diverse lucruri de functionalitate
            hud.setWave(hud.getWave() + 1);
            ////////////LEVEL1
            if (hud.getWave() == 1) {

                hand.addObject(new Player(450, 50, ID.Player, hand));


            }


            //Cand se atinge wave-ul 2, adica score-ul x(sau 500 cum este in prezent)
            //sa se adauge inamicii de jos

            if (hud.getWave() == 2) {
                hand.addObject(new Ts(500, 100, ID.Ts));
                hand.addObject(new Matlab(400, 30, ID.Matlab));

            }
            if (hud.getWave() == 3) {

                hand.addObject(new Deea(500, 600, ID.Deea));

                hand.addObject(new Poo(300, 200, ID.Poo));

            }
            if (hud.getWave() == 4) {
                hand.addObject(new Spd(500, 500, ID.Spd));
                hand.addObject(new Pla(200, 200, ID.Pla));

            }
            //Pentru o diversitate a nivelului si pentru a deruta jucatorul
            //Am decis ca mai si scot inamici, nu doar sa adaug
            //Pe parcursul nivelului, se vor tot scoate si adauga inamici in diferite pozitii pe harta
            //(ma gandesc ca ar fi interesant sa ma folosesc de clasa Random() )
            if (hud.getWave() == 7) {
                //Parcurg obiectele pana la numarul lor
                //Obiectele le voi pune intr-un obiect temporar
                //Daca obiectul gasit este ID.Ts sau ID.Spd, sa le stearga si sa adauge altele 2
                for (int i = 0; i < hand.object.size(); i++) {
                    GameObject tempO = hand.object.get(i);
                    if (tempO.getId() == ID.Ts || tempO.getId() == ID.Spd) {
                        hand.removeObject(tempO);
                        hand.addObject(new Pla(500, 50, ID.Pla));
                        hand.addObject(new Poo(90, 90, ID.Poo));

                    }
                }


            }
            if (hud.getWave() == 8) {
                for (int i = 0; i < hand.object.size(); i++) {
                    GameObject tempO = hand.object.get(i);
                    if ((tempO.getId() == ID.Matlab) || (tempO.getId() == ID.Deea)) {
                        hand.removeObject(tempO);
                        hand.addObject(new Spd(40, 40, ID.Spd));
                        hand.addObject(new Spd(70, 70, ID.Spd));


                    }
                }


            }
            if (hud.getWave() == 9) {
                for (int i = 0; i < hand.object.size(); i++) {
                    GameObject tempO = hand.object.get(i);
                    if ((tempO.getId() == ID.Player)) {
                        hand.object.clear();
                        hand.addObject(new Player(tempO.getX(), tempO.getY(), ID.Player, hand));
                        hand.addObject(new HealthBonus(150,650,ID.HealthBonus));
                        hand.addObject(new HealthBonus(350,650,ID.HealthBonus));
                        hand.addObject(new HealthBonus(550,650,ID.HealthBonus));
                        hand.addObject(new HealthBonus(750,650,ID.HealthBonus));


                    }
                }


            }
            if (hud.getWave() == 10) {

                hand.addObject(new Pla(50,90, ID.Pla));
                hand.addObject(new Pla(500,40, ID.Pla));
                hand.addObject(new Spd(50,600, ID.Spd));
                hand.addObject(new Spd(400,300, ID.Spd));


            }



            if (hud.getWave() == 11) {
                hand.addObject(new Pla(40, 40, ID.Pla));
                hand.addObject(new Spd(70, 70, ID.Spd));
                hand.addObject(new Pla(90, 90, ID.Pla));
                hand.addObject(new Spd(120, 120, ID.Spd));

            }
            if (hud.getWave() == 12) {
                hand.addObject(new Deea(150, 150, ID.Deea));
                hand.addObject(new Poo(200, 200, ID.Poo));
                hand.addObject(new Ts(250, 250, ID.Ts));
                hand.addObject(new Matlab(300, 300, ID.Matlab));

            }
            if (hud.getWave() == 13) {
                for (int i = 0; i < hand.object.size(); i++) {
                    GameObject tempO = hand.object.get(i);
                    if ((tempO.getId() == ID.Player)) {
                        hand.object.clear();
                        hand.addObject(new Player(tempO.getX(), tempO.getY(), ID.Player, hand));


                    }
                }
                hand.addObject(new Pla(50,90, ID.Pla));
                hand.addObject(new Pla(500,40, ID.Pla));
                hand.addObject(new Pla(200,60, ID.Pla));
                hand.addObject(new Spd(50,600, ID.Spd));
                hand.addObject(new Spd(400,300, ID.Spd));
                hand.addObject(new Spd(80,500, ID.Spd));

                hand.addObject(new Matlab(100, 100, ID.Matlab));
                hand.addObject(new Matlab(200, 200, ID.Matlab));
                hand.addObject(new Matlab(300, 300, ID.Matlab));


            }
            if(hud.getWave()==14){
                for (int i = 0; i < hand.object.size(); i++) {
                    GameObject tempO = hand.object.get(i);
                    if ((tempO.getId() == ID.Player)) {
                        hand.object.clear();
                        hand.addObject(new Player(tempO.getX(), tempO.getY(), ID.Player, hand));


                    }
                }
                hand.addObject(new BigPla(500,300,ID.BigPla));
                hand.addObject(new Deea(150, 150, ID.Deea));
                hand.addObject(new Poo(200, 200, ID.Poo));
                hand.addObject(new Poo(200, 300, ID.Poo));
                hand.addObject(new Ts(250, 250, ID.Ts));
                hand.addObject(new Matlab(300, 300, ID.Matlab));
                hand.addObject(new Deea(50, 550, ID.Deea));
                hand.addObject(new Ts(500, 500, ID.Ts));


            }

            if (hud.getWave() == 15) {
                for (int i = 0; i < hand.object.size(); i++) {
                    GameObject tempO = hand.object.get(i);
                    if ((tempO.getId() == ID.Player)) {
                        hand.object.clear();
                        hand.addObject(new Player(tempO.getX(), tempO.getY(), ID.Player, hand));
                        hand.addObject(new HealthBonus(150,650,ID.HealthBonus));
                        hand.addObject(new HealthBonus(350,650,ID.HealthBonus));
                        hand.addObject(new HealthBonus(550,650,ID.HealthBonus));
                        hand.addObject(new HealthBonus(750,650,ID.HealthBonus));


                    }
                }


            }
            //////////////////////LEVEL2
            if (hud.getWave() == 16) {
                State.SetState(refLink.GetGame().playStateLevel2);
                hud.setLevel(2);
                //WAVE15(1) - LEVEL 2
                hand.addObject(new Pa(50, 30, ID.Pa));
                hand.addObject(new Pa(850, 90, ID.Pa));


            }
            if (hud.getWave() == 17) {
                //WAVE16(2) - LEVEL2
                hand.addObject(new Paoo(200, 100, ID.Paoo));
                hand.addObject(new Java(100, 200, ID.Java));


            }
            if (hud.getWave() == 18) {
                //WAVE17(3) - LEVEL 2
                hand.addObject(new Mn(500, 300, ID.Mn));

            }
            if (hud.getWave() == 19) {
                //WAVE18(4) - LEVEL 2
                hand.addObject(new So(70, 500, ID.So));
                hand.addObject(new HealthBonus(100,50,ID.HealthBonus));
            }
            if (hud.getWave() == 20) {
                //WAVE19(5) - LEVEL 2
                hand.addObject(new Kotlin(300, 50, ID.Kotlin));
            }
            if (hud.getWave() == 21) {
                //WAVE20(6) - LEVEL 2
                hand.addObject(new KotlinFast(850, 20, ID.KotlinFast));
                hand.addObject(new SoFast(50, 500, ID.SoFast));
            }
            if (hud.getWave() == 22) {
                //WAVE21(7) - LEVEL 2
                for (int i = 0; i < hand.object.size(); i++) {
                    GameObject tempO = hand.object.get(i);
                    if ((tempO.getId() == ID.Player)) {
                        hand.object.clear();
                        hand.addObject(new Player(tempO.getX(), tempO.getY(), ID.Player, hand));


                    }
                }
                hand.addObject(new HealthBonus(150,150,ID.HealthBonus));
                hand.addObject(new HealthBonus(450,150,ID.HealthBonus));
                hand.addObject(new HealthBonus(750,150,ID.HealthBonus));
                hand.addObject(new HealthBonus(500,300,ID.HealthBonus));
                hand.addObject(new KotlinFast(850, 20, ID.KotlinFast));
                hand.addObject(new KotlinFast(50, 300, ID.KotlinFast));
                hand.addObject(new Kotlin(300, 50, ID.Kotlin));
                hand.addObject(new SoFast(50, 500, ID.SoFast));
                hand.addObject(new SoFast(500, 50, ID.SoFast));
                hand.addObject(new So(70, 500, ID.So));
                hand.addObject(new Paoo(100, 100, ID.Paoo));
                hand.addObject(new HealthBonus(300,500,ID.HealthBonus));


            }
            if(hud.getWave()==23){
                for (int i = 0; i < hand.object.size(); i++) {
                    GameObject tempO = hand.object.get(i);
                    if ((tempO.getId() == ID.Player)) {
                        hand.object.clear();
                        hand.addObject(new Player(tempO.getX(), tempO.getY(), ID.Player, hand));

                    }
                }
                hand.addObject(new BigKotlin(500,300,ID.BigKotlin));
                hand.addObject(new Pa(850, 90, ID.Pa));
                hand.addObject(new Pa(50, 30, ID.Pa));
                hand.addObject(new Paoo(200, 100, ID.Paoo));
                hand.addObject(new Mn(300, 100, ID.Mn));
                hand.addObject(new Java(100, 200, ID.Java));
                hand.addObject(new Paoo(280, 253, ID.Paoo));
                hand.addObject(new Mn(90, 100, ID.Mn));
                hand.addObject(new Mn(185, 50, ID.Mn));
                hand.addObject(new Paoo(78, 78, ID.Paoo));


            }
        }
        //Cand ajunge viata la 0, esti declarat restant
        if(hud.getHealth()<=0){
            hand.object.clear();
            State.SetState(refLink.GetGame().restantState);




        }
        //Cand jucatorul ajunge la wave-ul 27, se termina jocul si esti declarat castigator
        if(hud.getWave()==27){
            hand.object.clear();
            State.SetState(refLink.GetGame().promovatState);
        }
    }

}

