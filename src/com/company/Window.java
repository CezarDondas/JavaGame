package com.company;

import javax.swing.*;
import java.awt.*;


public class Window extends Canvas {
    public Window(int width,int height,String title,Game game){
        JFrame frame=new JFrame(title);

        frame.setPreferredSize(new Dimension(width,height));
        frame.setMaximumSize(new Dimension(width,height));
        frame.setMinimumSize(new Dimension(width,height));
        frame.setFocusable(false);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //inchidem fereastra prin x-ul rosu
        frame.setResizable(false); // nu putem modifica dimensiunea ferestrei
        frame.setLocationRelativeTo(null);


        frame.add(game);
        frame.setVisible(true);



        game.start();
    }


}
