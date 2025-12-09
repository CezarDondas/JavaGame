package com.company.Restante;

import com.company.Assets;
import com.company.Game;
import com.company.GameObject;
import com.company.ID;

import java.awt.*;
import java.awt.image.BufferedImage;

public class BigKotlin extends GameObject {
    private BufferedImage bigkotlin_ss;
    public BigKotlin(int x, int y, ID id) {
        super(x, y, id);
        velX = 2;
        bigkotlin_ss= Assets.bigKotlin;
    }

    @Override
    public void update() {
        x += velX;
        if (x <= 30 || x >= Game.WIDTH - 250) velX *= -1;

    }

    @Override
    public void render(Graphics g) {
        g.drawImage(bigkotlin_ss,x,y,null);

    }

    @Override
    public Rectangle getBounds() {
        return (new Rectangle(x,y,100,100));
    }
}
