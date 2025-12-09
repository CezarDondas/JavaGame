package com.company.Restante;

import com.company.Assets;
import com.company.Game;
import com.company.GameObject;
import com.company.ID;

import java.awt.*;
import java.awt.image.BufferedImage;


public class Deea extends GameObject {
    private BufferedImage deea_ss;




    public Deea(int x, int y, ID id) {
        super(x, y, id);
        velX = 2;

        deea_ss= Assets.deeaEnemy;

    }

    public void update() {
        x += velX;
        if (x <= 50 || x >= Game.WIDTH - 200) velX *= -1;










    }

    public void render(Graphics g) {
        g.drawImage(deea_ss, x, y, null);




    }


    public Rectangle getBounds() {
        return (new Rectangle(x, y, 32, 32));
    }
}