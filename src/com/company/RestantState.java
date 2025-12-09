package com.company;

import java.awt.*;

public class RestantState extends State{

    private HP hud;
    public RestantState(RefLinks refLink,HP hud) {
        super(refLink);
        this.hud=hud;
    }

    @Override
    public void Update() {


    }

    @Override
    public void Draw(Graphics g) {
        g.drawImage(Assets.menuImage,0,0,null);
        g.setColor(Color.white);
        g.setFont(new Font("Visitor TT2 BRK",1,140));
        g.drawString("SCORE:"+hud.getScore(),200,200);
        g.setFont(new Font("Visitor TT2 BRK",1,50));
        g.drawString("Ai ramas restant, incearca si in toamna !",60,300);
        g.drawImage(Assets.playerDead,450,400,null);
        g.setFont(new Font("Visitor TT2 BRK",1,100));
        g.drawRect(170,525,610,90);
        g.drawString("BACK TO MENU",183,600);





    }
}
