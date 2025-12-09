package com.company.Restante;

import com.company.Assets;
import com.company.Game;
import com.company.GameObject;
import com.company.ID;

import java.awt.*;
import java.awt.image.BufferedImage;


public class Pla extends GameObject {
    private BufferedImage pla_ss;


    public Pla(int x, int y, ID id) {
        super(x, y, id);
        velX = 1;
        velY = 10;
        pla_ss= Assets.plaEnemy;

    }

    public void update() {
        //Pozitia s-a pe harta sa se incrementeze cu pozitia sa + velocity-ul(sau viteza obiectului)
        //Atat pe verticala cat si pe orizontala
        //Principiul este la fel la toate obiectele(ramane de vazut daca si cum voi modifica la unele restante/unii inamici.)
        x += velX;
        y += velY;
        //Aici restrictionam pana unde se poate deplasa pe Ox si Oy si pentru
        //a nu se misca dubios si a nu avea alte bug-uri(cum am mai intampinat pana acum)
        //cand se ajunge la acea restrictie viteza sa fie inmultita cu -1 pentru a se duce in sens opus miscarii
        //asemanator este valabil si la celelalte obiecte
        if (y <= 30 || y >= Game.HEIGHT - 130) velY *= -1;
        if (x <= 30 || x >= Game.WIDTH - 130) velX *= -1;


    }

    public void render(Graphics g) {
        g.drawImage(pla_ss, x, y, null);




    }

    public Rectangle getBounds() {
        return (new Rectangle(x, y, 64, 64));
    }
}