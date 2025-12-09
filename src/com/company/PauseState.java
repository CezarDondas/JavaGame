package com.company;

import java.awt.*;

public class PauseState extends State{

    public PauseState(RefLinks refLink) {
        super(refLink);
    }

    @Override
    public void Update() {

    }

    @Override
    public void Draw(Graphics g) {
        g.drawImage(Assets.menuImage,0,0,null);
        g.setColor(Color.white);
        g.drawRect(210,250,550,100);
        g.setFont(new Font("Visitor TT2 BRK",1,140));
        g.drawString("-PAUSED-",210,200);
        g.setFont(new Font("Visitor TT2 BRK",Font.BOLD,140));
        g.drawString("Continue ",240,340);
        g.drawRect(290,400,400,100);
        g.drawString("Help ",295+50,480);
        g.drawRect(290,550,400,100);
        g.drawString("Quit ",310+50+10,630);

    }
}
