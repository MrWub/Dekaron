package com.github.MrWub.Dekaron.mobs.reference;

import java.util.ArrayList;
import java.util.List;

import org.bukkit.entity.LivingEntity;

import com.github.MrWub.Dekaron.mobs.V1_10_R1.Mob;
import com.github.MrWub.Dekaron.utils.wrapped.ParamForMobSpawn;

public abstract class AbstractMobsManager {
	private static List<Mob> mobs = new ArrayList<Mob>();
	private static int maxID = 0; 
	/**
	 * @param param 生成怪物的参数，需要构造
	 * @return 怪物实例
	 */
	public abstract Mob spawnMob(ParamForMobSpawn param);
	/**
	 * @return 当前存在的怪物数量
	 */
	public int getMobsAmount() {
		return mobs.size();
	}
	public Mob getMobByMID(int by) {
		for (Mob m : mobs) {
			if (m.getMID() == by) return m;
		}
		return null;
	}
	public Mob getMob(LivingEntity mob) {
		for (Mob m : mobs) {
			if (mob.equals(m.getHandle())) return m;
		}
		return null;
	}	
	public void addMob(Mob mob) {
		mobs.add(mob);
	}
	/**
	 * 移除一个怪物.
	 * @param mob 这个怪物的实例
	 * @param godMode true代表正常杀死，false代表直接移除.
	 */
	public void removeMob(Mob mob,boolean godMode) {
		if (godMode) mob.clear(); else mob.kill();
		mobs.remove(mob);
	}
	public int newID() {
		return ++maxID;
	}
}
