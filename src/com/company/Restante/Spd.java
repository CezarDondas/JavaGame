package com.company.Restante;

import com.company.Assets;
import com.company.Game;
import com.company.GameObject;
import com.company.ID;

import java.awt.*;
import java.awt.image.BufferedImage;


public class Spd extends GameObject {
    private BufferedImage spd_ss;


    public Spd(int x, int y, ID id) {
        super(x, y, id);
        velX = 10;
        velY = 1;
        spd_ss= Assets.spdEnemy;

    }

    public void update() {
        x += velX;
        y += velY;
        if (y <= 30 || y >= Game.HEIGHT - 130) velY *= -1;
        if (x <= 30 || x >= Game.WIDTH - 130) velX *= -1;


    }

    public void render(Graphics g) {
        g.drawImage(spd_ss, x, y, null);

        //g.setColor(Color.lightGray);
        //g.fillRect(x,y,32,32);


    }

    public Rectangle getBounds() {
        return (new Rectangle(x, y, 64, 64));
    }
}