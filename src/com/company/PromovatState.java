package com.company;

import java.awt.*;

public class PromovatState extends State{
    public PromovatState(RefLinks refLink) {
        super(refLink);
    }

    @Override
    public void Update() {

    }

    @Override
    public void Draw(Graphics g) {
        g.drawImage(Assets.menuImage,0,0,null);
        g.setColor(Color.white);
        g.setFont(new Font("Visitor TT2 BRK",1,45));
        g.drawString("Felicitari! Ai trecut cu bine peste acest an",65,100);
        g.drawString("si te poti bucura din plin de vacanta de vara",55,200);
        g.drawImage(Assets.playerIdle,450,300,null);
        g.setFont(new Font("Visitor TT2 BRK",1,100));
        g.drawRect(170,525,610,90);
        g.drawString("BACK TO MENU",183,600);

    }
}
