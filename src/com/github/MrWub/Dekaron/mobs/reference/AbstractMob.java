package com.github.MrWub.Dekaron.mobs.reference;

import org.bukkit.entity.LivingEntity;
import org.bukkit.inventory.ItemStack;

import com.github.MrWub.Dekaron.mobs.MobType;
import com.github.MrWub.Dekaron.mobs.MobVersionManager;
import com.github.MrWub.Dekaron.utils.wrapped.ParamForMobSpawn;


public abstract class AbstractMob {
	private LivingEntity handle = null;
	private MobType mobType = null;
	private int MID = -1;
	
	/**
	 * 构造一个怪物,应该使用MobManager中的spawnMob方法而不是直接构造.
	 * @param param 生成的参数，需要自行构造.
	 */
	public AbstractMob(ParamForMobSpawn param) {
		this.handle = (LivingEntity)param.loc.getWorld().spawnEntity(param.loc, param.mt.getEntityType());
		this.mobType = param.mt;
		try {
			this.MID = MobVersionManager.getMobsManager().newID();
		} catch (Exception e) {
			e.printStackTrace();
		}
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
