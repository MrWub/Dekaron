package com.github.MrWub.Dekaron.utils.wrapped;

import java.util.ArrayList;
import java.util.List;

import org.bukkit.Location;
import org.bukkit.inventory.ItemStack;

import com.github.MrWub.Dekaron.mobs.MobType;

public class ParamForMobSpawn {
	public String name = "DekaronMob";
	public MobType mt = null;
	public Location loc = null;
	/**
	 * 创建怪物时用的参数封装类.
	 * @param name 名称 可以为null，则默认为DekaronMob
	 * @param mt 怪物类型
	 * @param loc 位置
	 */	
	public ParamForMobSpawn(String name, MobType mt, Location loc) {
		if (name!=null) this.name = name;
		this.mt = mt;
		this.loc = loc;
	}

}
