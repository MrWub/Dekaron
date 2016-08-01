package com.github.MrWub.Dekaron.mobs;

import com.github.MrWub.Dekaron.mobs.reference.AbstractMobsManager;


public class MobVersionManager{
	private static boolean knowBukkitVersion = false;
	private static AbstractMobsManager mm = null;
	private static MobTypesManager mtm = null;
	
	static {
		mtm = new MobTypesManager();
	}
	
	public static AbstractMobsManager getMobsManager() throws Exception{
		if (!knowBukkitVersion) throw new Exception("Unknow Bukkit version!");
		return mm;
	}
	
	public static MobTypesManager getMobTypesManager() {
		return mtm;
	}
}
