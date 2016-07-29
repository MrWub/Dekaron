package com.github.MrWub.Dekaron.mobs;

import java.util.ArrayList;
import java.util.List;

import org.bukkit.Location;
import org.bukkit.entity.LivingEntity;

public class MobsManager {
	private static List<Mob> mobs = new ArrayList<Mob>();
	private static int maxID = 0; 
	public static Mob spawnMob(String name, Location loc, MobType mt) {
		Mob mob = Mob.spawnMob(name, mt, loc);
		mobs.add(mob);
		return mob;
	}
	public static int getMobsAmount() {
		return mobs.size();
	}
	public static Mob getMobByMID(int by) {
		for (Mob i : mobs) if (i.getMID() == by) return i;
		return null;
	}
	public static Mob getMobByUID(LivingEntity mob) {
		for (Mob i : mobs) 
			if (i.getHandle().getUniqueId().equals(mob.getUniqueId())) return i;
		return null;
	}
	public static void removeMob(Mob mob) {
		mob.kill();
		mobs.remove(mob);
	}
	public static int newID() {
		return ++maxID;
	}
}
