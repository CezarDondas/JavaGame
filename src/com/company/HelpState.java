package com.company;

import java.awt.*;

public class HelpState extends State{
    public HelpState(RefLinks refLink) {
        super(refLink);
    }

    @Override
    public void Update() {

    }

    @Override
    public void Draw(Graphics g) {
        g.drawImage(Assets.menuImage,0,0,null);
        g.setColor(Color.white);
        g.setFont(new Font("Visitor TT2 BRK",1,50));
        g.drawString("W - UP",50,250);
        g.drawString("A - LEFT",50,300);
        g.drawString("S - DOWN",50,350);
        g.drawString("D - RIGHT",50,400);
        g.drawString("P - PAUSE",50,450);
        g.setFont(new Font("Visitor TT2 BRK",1,140));
        g.drawString("HELP MENU",200,100);
        g.drawRect(290,620,400,100);
        g.drawString("BACK ",350,700);


    }
}
