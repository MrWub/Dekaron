package com.github.MrWub.Dekaron.mobs;

import java.util.List;

import org.bukkit.entity.EntityType;
import org.bukkit.inventory.ItemStack;

import com.github.MrWub.Dekaron.utils.wrapped.ParamForMobTypeCreate;

public class MobType {
	private EntityType entityType = null;
	private List<ItemStack> extraDropItems = null;
	/**
	 * 不应直接使用该方法，而是应用MobTypesManager中的addMobType方法
	 * @param param 生成参数，需要构造
	 * @return 怪物类型实例
	 */
	public static MobType createMobType(ParamForMobTypeCreate param) {
		MobType mt = new MobType();
		mt.setEntityType(param.type);
		mt.setExtraDropItems(param.extraDropItems);
		return mt;
	}
	public EntityType getEntityType() {
		return entityType;
	}
	private void setEntityType(EntityType entityType) {
		this.entityType = entityType;
	}
	public List<ItemStack> getExtraDropItems() {
		return extraDropItems;
	}
	public void setExtraDropItems(List<ItemStack> extraDropItems) {
		this.extraDropItems = extraDropItems;
	}
}
