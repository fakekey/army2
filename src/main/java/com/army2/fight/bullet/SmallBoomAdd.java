package com.army2.fight.bullet;

import java.io.IOException;
import com.army2.fight.Bullet;
import com.army2.fight.BulletManager;
import com.army2.fight.Player;
import com.army2.fight.boss.SmallBoom;


public class SmallBoomAdd extends Bullet {

    public SmallBoomAdd(BulletManager bullMNG, byte bullId, int satThuong, Player pl, int X, int Y, int vx, int vy, int msg, int g100) {
        super(bullMNG, bullId, satThuong, pl, X, Y, vx, vy, msg, g100);
        super.isCanCollision = false;
        super.isXuyenPlayer = true;
    }

    @Override
    public void nextXY() {
        super.nextXY();
        if (super.collect && X > 0 && X < fm.mapMNG.Width && Y < fm.mapMNG.Height) {
            Player players;
            try {
                players = new SmallBoom(fm, (byte) 11, "Small Boom", (byte) fm.allCount, 1000 + (fm.getLevelTeam() * 8), X, Y);
                bullMNG.addboss.add(new BulletManager.AddBoss(players, 2));
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }
}
