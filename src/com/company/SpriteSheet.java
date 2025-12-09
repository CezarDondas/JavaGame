package com.company;

import java.awt.image.BufferedImage;
//Clasa ce ne ajuta sa generam un spritesheet

public class SpriteSheet {
    private BufferedImage spSheet;
    public SpriteSheet(BufferedImage spSheet){ this.spSheet=spSheet;}
    public BufferedImage crop(int i,int j,int w,int h){
        return spSheet.getSubimage(i,j,w,h);
    }

}
