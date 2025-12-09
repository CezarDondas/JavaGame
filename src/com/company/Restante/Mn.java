package com.company.Restante;

import com.company.Assets;
import com.company.Game;
import com.company.GameObject;
import com.company.ID;

import java.awt.*;
import java.awt.image.BufferedImage;


public class Mn extends GameObject {
    private final BufferedImage matlab_ss;



    public Mn(int x, int y, ID id) {
        super(x, y, id);
        velX = 2;
        matlab_ss= Assets.matlabEnemy;

    }

    public void update() {
        x += velX;
        if (x <= 30 || x >= Game.WIDTH - 90) velX *= -1;


    }

    public void render(Graphics g) {
        g.drawImage(matlab_ss, x, y, null);




    }

    public Rectangle getBounds() {
        return (new Rectangle(x, y, 32, 32));
    }
}