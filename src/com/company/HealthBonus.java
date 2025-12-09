package com.company;

import java.awt.*;
import java.awt.image.BufferedImage;

public class HealthBonus extends GameObject{
    private BufferedImage health_ss;
    public HealthBonus(int x, int y, ID id) {
        super(x, y, id);
        health_ss=Assets.healthBonus;
    }

    @Override
    public void update() {

    }

    @Override
    public void render(Graphics g) {
        g.drawImage(health_ss,x,y,null);

    }

    @Override
    public Rectangle getBounds() {
        return (new Rectangle(x,y,26,40));
    }
}
