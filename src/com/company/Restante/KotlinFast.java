package com.company.Restante;

import com.company.Assets;
import com.company.Game;
import com.company.GameObject;
import com.company.ID;

import java.awt.*;
import java.awt.image.BufferedImage;

public class KotlinFast extends GameObject {
    private BufferedImage kotlin_ss;
    public KotlinFast(int x, int y, ID id) {
        super(x, y, id);
        velX=2;
        velY=20;
        kotlin_ss= Assets.kotlinEnemy;
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
        g.drawImage(kotlin_ss,x,y,null);

    }

    @Override
    public Rectangle getBounds() {
        return (new Rectangle(x, y, 64, 64));
    }
}