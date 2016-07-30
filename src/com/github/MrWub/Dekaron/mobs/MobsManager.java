package com.github.MrWub.Dekaron.mobs;

import java.util.ArrayList;
import java.util.List;

import org.bukkit.Location;
import org.bukkit.entity.LivingEntity;

import com.github.MrWub.Dekaron.utils.wrapped.ParamForMobSpawn;

public class MobsManager {
	private static List<Mob> mobs = new ArrayList<Mob>();
	private static int maxID = 0; 
	/**
	 * @param param 生成怪物的参数，需要构造
	 * @return 怪物实例
	 */
	public static Mob spawnMob(ParamForMobSpawn param) {
		Mob mob = Mob.spawnMob(param);
		mobs.add(mob);
		return mob;
	}
	/**
	 * @return 当前存在的怪物数量
	 */
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
	/**
	 * 杀死一个怪物.
	 * @param mob 这个怪物的实例
	 * @param godMode true代表正常杀死，false代表直接移除.
	 */
	public static void removeMob(Mob mob,boolean godMode) {
		if (godMode) 
			mob.kill();
		else 
			mob.clear();
		mobs.remove(mob);
	}
	public static int newID() {
		return ++maxID;
	}
}
