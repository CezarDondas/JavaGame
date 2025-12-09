package com.company.Restante;

import com.company.Assets;
import com.company.Game;
import com.company.GameObject;
import com.company.ID;

import java.awt.*;
import java.awt.image.BufferedImage;

public class BigPla extends GameObject {
    private BufferedImage bigpla_ss;
    public BigPla(int x, int y, ID id) {
        super(x, y, id);
        velX = 2;
        bigpla_ss= Assets.bigPla;
    }

    @Override
    public void update() {
        x += velX;
        if (x <= 30 || x >= Game.WIDTH - 250) velX *= -1;

    }

    @Override
    public void render(Graphics g) {
        g.drawImage(bigpla_ss,x,y,null);

    }

    @Override
    public Rectangle getBounds() {
        return (new Rectangle(x,y,100,100));
    }
}
