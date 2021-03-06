package com.github.MrWub.Dekaron.utils.wrapped;

import java.util.ArrayList;
import java.util.List;

import org.bukkit.entity.EntityType;
import org.bukkit.inventory.ItemStack;

public class ParamForMobTypeCreate {
	public EntityType type = null;
	public List<ItemStack> extraDropItems = new ArrayList<ItemStack>();
	public boolean disPlayTagName = false;
	public String name = "DekaronMob";
	/**
	 * @param type 怪物Bukkit实体类型
	 * @param extraDropItems 附加掉落物品 可以为null
	 * @param disPlayTagName 是否显示头顶名称.
	 */
	public ParamForMobTypeCreate(String name, EntityType type,
			List<ItemStack> extraDropItems,boolean disPlayTagName) {
		this.name = name;
		this.type = type;
		if (extraDropItems != null) this.extraDropItems = extraDropItems;
		this.disPlayTagName = disPlayTagName;
	}
}
