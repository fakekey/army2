package com.army2.fight.bullet;

import com.army2.fight.Bullet;
import com.army2.fight.BulletManager;
import com.army2.fight.Player;


public class ItemLaser extends Bullet {

    public ItemLaser(BulletManager bullMNG, byte bullId, int satThuong, Player pl, int X, int Y, int vx, int vy, int msg, int g100) {
        super(bullMNG, bullId, satThuong, pl, X, Y, vx, vy, msg, g100);
        super.isCanCollision = false;
    }

    @Override
    public void nextXY() {
        super.nextXY();
        if (super.collect) {
            this.bullMNG.addBullet(new ItemLaserDelay(bullMNG, (byte) 15, this.satThuong, super.pl, this.X, this.Y));
        }
    }

}
