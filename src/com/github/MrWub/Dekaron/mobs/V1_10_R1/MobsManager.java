package com.github.MrWub.Dekaron.mobs.V1_10_R1;

import com.github.MrWub.Dekaron.mobs.reference.AbstractMobsManager;
import com.github.MrWub.Dekaron.utils.wrapped.ParamForMobSpawn;

public class MobsManager extends AbstractMobsManager{
	@Override
	public Mob spawnMob(ParamForMobSpawn param) {
		Mob newMob = new Mob(param);
		super.addMob(newMob);
		return newMob;
	}
}
