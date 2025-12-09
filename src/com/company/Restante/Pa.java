package com.company.Restante;

import com.company.Assets;
import com.company.Game;
import com.company.GameObject;
import com.company.ID;

import java.awt.*;
import java.awt.image.BufferedImage;

public class Pa extends GameObject {
    private BufferedImage pa_ss;
    public Pa(int x, int y, ID id) {
        super(x, y, id);
        velY=1;
        pa_ss= Assets.paEnemy;
    }

    @Override
    public void update() {
        y+=velY;
        if (y <= 30 || y >= Game.HEIGHT - 130) velY *= -1;

    }

    @Override
    public void render(Graphics g) {
        g.drawImage(pa_ss,x,y,null);

    }

    @Override
    public Rectangle getBounds() {
        return (new Rectangle(x, y, 64, 64));
    }
}