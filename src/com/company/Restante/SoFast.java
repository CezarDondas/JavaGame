package com.company.Restante;

import com.company.Assets;
import com.company.Game;
import com.company.GameObject;
import com.company.ID;

import java.awt.*;
import java.awt.image.BufferedImage;

public class SoFast extends GameObject {
    private BufferedImage so_ss;
    public SoFast(int x, int y, ID id) {
        super(x, y, id);
        velX=18;
        velY=1;
        so_ss= Assets.soEnemy;
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
        g.drawImage(so_ss,x,y,null);

    }

    @Override
    public Rectangle getBounds() {
        return (new Rectangle(x, y, 64, 64));
    }
}