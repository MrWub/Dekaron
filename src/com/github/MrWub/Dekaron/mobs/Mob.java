package com.github.MrWub.Dekaron.mobs;

import java.io.EOFException;

import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.LivingEntity;

public class Mob {
	private LivingEntity handle = null;
	private MobType mobType = null;
	private int flag = 0;
	private String name = "DekaronMob";
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public static Mob spawnMob(MobType mt, Location loc){
		Mob mob = new Mob();
		mob.handle = (LivingEntity) loc.getWorld().spawnEntity(loc, mt.getEntityType());
		return mob;
	}
	
	public LivingEntity getHandle() {
		return handle;
	}

	public MobType getMobType() {
		return mobType;
	}

	public void setMobType(MobType mobType) {
		this.mobType = mobType;
	}

	public int getFlag() {
		return flag;
	}

	public void setFlag(int flag) {
		this.flag = flag;
	}
	
	
}
