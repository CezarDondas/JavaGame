package com.company;


public class Parchet1Tile extends Tile {
    public Parchet1Tile(int id) {

        super(Assets.parchetNegru, id);
    }
    @Override
    public boolean IsSolid(){ return true;}
}
