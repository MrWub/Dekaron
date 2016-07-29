package com.github.MrWub.Dekaron.mobs;

import java.util.ArrayList;
import java.util.List;

import org.bukkit.Location;

public class MobsManager {
	private static List<Mob> mobs = new ArrayList<Mob>();
	public static Mob spawnMob(Location loc, MobType mt) {
		Mob mob = Mob.spawnMob(mt, loc);
		mobs.add(mob);
		return mob;
	}
}
