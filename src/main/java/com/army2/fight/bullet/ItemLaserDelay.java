package com.army2.fight.bullet;

import com.army2.fight.Bullet;
import com.army2.fight.BulletManager;
import com.army2.fight.Player;


public class ItemLaserDelay extends Bullet {

    public ItemLaserDelay(BulletManager bullMNG, byte id, int satThuong, Player pl, int X, int Y) {
        super(bullMNG, id, satThuong, pl, X, Y, 0, 0, 0, 0);
    }

    @Override
    public void nextXY() {
        super.nextXY();
    }

}
