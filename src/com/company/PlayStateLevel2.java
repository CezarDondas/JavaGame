package com.company;

import java.awt.*;

public class PlayStateLevel2 extends State{
    private MapLvl2 mapLvl2;
    public PlayStateLevel2(RefLinks refLink) {
        super(refLink);
        mapLvl2=new MapLvl2(refLink);
    }

    @Override
    public void Update() {
        mapLvl2.Update();

    }

    @Override
    public void Draw(Graphics g) {
        mapLvl2.Draw(g);

    }
}
