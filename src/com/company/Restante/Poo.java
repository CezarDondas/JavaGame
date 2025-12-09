package com.company.Restante;

import com.company.Assets;
import com.company.Game;
import com.company.GameObject;
import com.company.ID;

import java.awt.*;
import java.awt.image.BufferedImage;

public class Poo extends GameObject {
    private BufferedImage poo_ss;




    public Poo(int x, int y, ID id) {
        super(x, y, id);
        velX=2;
        velY=1;
        poo_ss= Assets.pooEnemy;

    }

    public void update() {
        x+=velX;
        y+=velY;
        if(y<=70||y>= Game.HEIGHT-200) velY*=-1;
        if(x<=70||x>=Game.WIDTH-200) velX*=-1;






    }

    public void render(Graphics g) {
        g.drawImage(poo_ss,x,y,null);




    }

    public Rectangle getBounds() { return (new Rectangle(x,y,32,32)); }
}