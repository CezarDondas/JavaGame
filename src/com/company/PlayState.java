package com.company;

import java.awt.*;

public class PlayState extends State{
    //private handler hand=new handler();
    private MapLvl1 mapLevel1;



    //private HP hud=new HP();
    //Momentan sunt in dilema aici,doar asa mi se genereaza harta pe ecran
    //Ar fi trebuit sa aduc aici toate elementele ce tin de PlayState(obiecte, jucator... etc)
    //dar am intampinat anumite bug-uri(le consider eu)
    //Pentru moment, pana imi dau seama ce nu functioneaza de apar bug-uri(ex: nu mi se scade viata cand un inamic
    //intra in coliziune cu jucatorul, nu ma pot misca).
    //Ce se vede mai jos comentat sunt tot felul de incercari
    //Am incercat initial varianta clasica, sa folosesc si mapa si jucatori si tot in Game(), dar nu mi se
    //randa mapa
    //Cu siguranta voi rezolva, dar nu mai aveam timp sa testez si sa incerc pana in aceasta etapa a 2-a pentru joc


    public PlayState(RefLinks refLink) {
        super(refLink);


        mapLevel1=new MapLvl1(refLink);
        refLink.SetMapLvl1(mapLevel1);





        /*Assets.Init();
        hand.addObject(new Ts(200,100,ID.Ts));
        hand.addObject(new Poo(300,200,ID.Poo));
        hand.addObject(new Matlab(400,30,ID.Matlab));
        hand.addObject(new Deea(500,600,ID.Deea));

        hand.addObject(new Pla(100,100,ID.Pla));
        hand.addObject(new Spd(500,500,ID.Spd));
         */




    }

    @Override
    public void Update() {
        mapLevel1.Update();
        //hud.update();
        //hand.update();





    }

    @Override
    public void Draw(Graphics g) {
        mapLevel1.Draw(g);
        //mapLevel2.Draw(g);
        //hud.render(g);
        //hand.render(g);






    }
}
