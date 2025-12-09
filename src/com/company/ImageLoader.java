package com.company;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.IOException;


//Aceasta metoda ne va ajuta sa importam imagini/texturi/dale in joc
//Este apelta si in clasa SpriteSheet, unde vom crea sprite-uri pentru jucator,restante, harta.. etc
public class ImageLoader {

    public static BufferedImage loadImage(String path){
        BufferedImage img=null;
        try{
            return img= ImageIO.read(ImageLoader.class.getResource(path));
        }catch(IOException e) {
            e.printStackTrace();
        }


        return null;



    }
}