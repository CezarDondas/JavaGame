package com.company.Restante;

import com.company.Assets;
import com.company.Game;
import com.company.GameObject;
import com.company.ID;

import java.awt.*;
import java.awt.image.BufferedImage;


public class Matlab extends GameObject {
    private final BufferedImage matlab_ss;



    public Matlab(int x, int y, ID id) {
        super(x, y, id);
        velX = 5;
        velY = 5;
        matlab_ss= Assets.matlabEnemy;

    }

    public void update() {
        x += velX;
        y += velY;
        if (y <= 30 || y >= Game.HEIGHT - 90) velY *= -1;
        if (x <= 30 || x >= Game.WIDTH - 90) velX *= -1;


    }

    public void render(Graphics g) {
        g.drawImage(matlab_ss, x, y, null);




    }

    public Rectangle getBounds() {
        return (new Rectangle(x, y, 32, 32));
    }
}