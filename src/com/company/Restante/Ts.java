package com.company.Restante;

import com.company.Assets;
import com.company.Game;
import com.company.GameObject;
import com.company.ID;

import java.awt.*;
import java.awt.image.BufferedImage;


public class Ts extends GameObject {
    private final BufferedImage ts_ss;


    public Ts(int x, int y, ID id) {
        super(x, y, id);
        //velX = 1;
        velY = 10;
        ts_ss= Assets.tsEnemy;

    }

    public void update() {
        //x += velX;
        y += velY;
        if (y <= 20 || y >= Game.HEIGHT - 100) velY *= -1;
        //if (x <= 50 || x >= Game.WIDTH - 200) velX *= -1;


    }

    public void render(Graphics g) {
        g.drawImage(ts_ss, x, y, null);




    }

    public Rectangle getBounds() {
        return (new Rectangle(x, y, 32, 32));
    }
}