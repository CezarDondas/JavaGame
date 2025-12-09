package com.company;



import java.awt.*;
import java.awt.image.BufferedImage;

public class Tile {
    private static final int no_tiles =32;
    public static Tile[] tiles= new Tile[no_tiles];


    public static Tile parchetTile=new ParchetTile(0);
    public static Tile parchet1Tile=new Parchet1Tile(1);
    public static Tile pereteInchisTile=new PereteinchisTile(2);
    public static Tile pereteDeschisTile=new PeretedeschisTile(3);



    public static final int tile_width=32;
    public static final int tile_height=32;

    protected BufferedImage img;
    protected final int id;

    public Tile(BufferedImage img,int id) {
        this.img=img;
        this.id = id;
        tiles[id]=this;
    }
    public void Update(){

    }
    public void Draw(Graphics g,int x,int y){
        g.drawImage(img,x,y,tile_width,tile_height,null);
    }
    public boolean IsSolid(){ return false;}
    public int GetId() {return id; }
}
