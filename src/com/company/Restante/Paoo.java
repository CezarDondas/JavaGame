package com.company.Restante;

import com.company.Assets;
import com.company.Game;
import com.company.GameObject;
import com.company.ID;

import java.awt.*;
import java.awt.image.BufferedImage;

public class Paoo extends GameObject {
    private BufferedImage paoo_ss;
    public Paoo(int x, int y, ID id) {
        super(x, y, id);
        velX=3;
        velY=5;
        paoo_ss= Assets.paooEnemy;
    }

    @Override
    public void update() {
        x+=velX;
        y+=velY;
        if (y <= 30 || y >= Game.HEIGHT - 130) velY *= -1;
        if (x <= 30 || x >= Game.WIDTH - 130) velX *= -1;

    }

    @Override
    public void render(Graphics g) {
        g.drawImage(paoo_ss,x,y,null);

    }

    @Override
    public Rectangle getBounds() {
        return (new Rectangle(x, y, 64, 64));
    }
}
