package com.github.MrWub.Dekaron.mobs;

import org.bukkit.Location;
import org.bukkit.entity.LivingEntity;

public class Mob {
	private LivingEntity handle = null;
	private MobType mobType = null;
	private int MID = -1;
	private String name = "";	
	
	
	public static Mob spawnMob(String name, MobType mt, Location loc){
		Mob mob = new Mob();
		mob.setHandle((LivingEntity) loc.getWorld().spawnEntity(loc, mt.getEntityType()));
		mob.setMID(MobsManager.newID());
		mob.setName(name);
		return mob;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	private void setHandle(LivingEntity handle) {
		this.handle = handle;
	}

	public LivingEntity getHandle() {
		return handle;
	}

	public MobType getMobType() {
		return mobType;
	}

	public int getMID() {
		return MID;
	}

	private void setMID(int id) {
		this.MID = id;
	}

	public void kill() {
		getHandle().remove();
	}

}
