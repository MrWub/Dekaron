package com.github.MrWub.Dekaron.mobs.V1_10_R1;

import com.github.MrWub.Dekaron.mobs.reference.AbstractMob;
import com.github.MrWub.Dekaron.utils.wrapped.ParamForMobSpawn;

public class Mob extends AbstractMob{
	public Mob(ParamForMobSpawn param) {
		super(param);
		getHandle().setCustomName(getName());
		getHandle().setCustomNameVisible(param.mt.isDisPlayTagName());
	}
}
