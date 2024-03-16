package com.army2.fight.boss;

import java.io.IOException;
import com.army2.fight.Boss;
import com.army2.fight.FightManager;


public class Balloon_Eye extends Boss {

    public Balloon_Eye(FightManager fightMNG, byte idGun, String name, byte location, int HPMax, short X, short Y) throws IOException {
        super(fightMNG, idGun, name, location, HPMax, X, Y);
        super.theLuc = 0;
        super.width = 13;
        super.height = 14;
        this.fly = true;
        this.XPExist = 8;
    }

    @Override
    public void turnAction() {}

}
