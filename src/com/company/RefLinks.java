package com.company;

public class RefLinks {
    private MapLvl1 mapLevel1;
    private MapLvl2 mapLevel2;
    private Game game;

    public RefLinks(Game game){
        this.game=game;
    }
    public int GetWidth(){return game.GetWidth();}
    public int GetHeight(){return game.GetHeight();}
    public Game GetGame(){return game;}
    public void SetGame(Game game){this.game=game;}
    public MapLvl1 GetMapLvl1(){return mapLevel1;}
    public void SetMapLvl1(MapLvl1 mapLevel1){this.mapLevel1=mapLevel1;}
    public MapLvl2 GetMapLvl2(){return mapLevel2;}
    public void SetMapLvl2(MapLvl2 mapLevel2){this.mapLevel2=mapLevel2;}
}
