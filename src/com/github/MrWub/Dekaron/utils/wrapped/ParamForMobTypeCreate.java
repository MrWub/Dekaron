package com.github.MrWub.Dekaron.utils.wrapped;

import java.util.ArrayList;
import java.util.List;

import org.bukkit.entity.EntityType;
import org.bukkit.inventory.ItemStack;

public class ParamForMobTypeCreate {
	public EntityType type = null;
	public List<ItemStack> extraDropItems = new ArrayList<ItemStack>();
	/**
	 * @param type 怪物Bukkit实体类型
	 * @param extraDropItems 附加掉落物品 默认没有
	 */
	public ParamForMobTypeCreate(EntityType type,
			List<ItemStack> extraDropItems) {
		this.type = type;
		this.extraDropItems = extraDropItems;
	}
	public ParamForMobTypeCreate(EntityType type) {
		this.type = type;
	}
}
