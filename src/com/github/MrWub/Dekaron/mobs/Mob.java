package com.github.MrWub.Dekaron.mobs;

import java.util.ArrayList;
import java.util.List;

import org.bukkit.entity.LivingEntity;
import org.bukkit.inventory.ItemStack;

import com.github.MrWub.Dekaron.utils.wrapped.ParamForMobSpawn;

public class Mob {
	private LivingEntity handle = null;
	private MobType mobType = null;
	private int MID = -1;
	private String name = "";	
	
	/**
	 * 生成一个怪物,应该使用MobManager中的spawnMob方法而不是直接使用该方法.
	 * @param param 生成的参数，需要用构造.
	 * @return 怪物实例
	 * @deprecated
	 */
	public static Mob spawnMob(ParamForMobSpawn param){
		Mob mob = new Mob();
		mob.setHandle(
				(LivingEntity)param.loc.getWorld().spawnEntity(param.loc, param.mt.getEntityType()));
		mob.setMID(MobsManager.newID());
		mob.setName(param.name);
		
		mob.getHandle().setCustomName(param.name);
		mob.getHandle().setCustomNameVisible(param.mt.isDisPlayTagName());
		return mob;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	/**
	 * 设置LivingEntity实例，只允许在生成时调用
	 * 需要获取实例并修改请使用getHandle()方法
	 * @param handle
	 */
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

	/**
	 * 强行清理这个怪物(非正常杀死) 不会掉落等.
	 * 请在MobsManager中使用remove方法而不是直接调用该方法
	 */
	public void clear() {
		getHandle().remove();
	}

	/**
	 * 正常杀死这个怪物并移除，会掉落物品等.
	 * 请在MobsManager中使用remove方法而不是直接调用该方法
	 */
	public void kill() {
		for (ItemStack item : mobType.getExtraDropItems()) {
			getHandle().getWorld().dropItem(getHandle().getLocation(), item);
		}
		getHandle().remove();
	}

}
