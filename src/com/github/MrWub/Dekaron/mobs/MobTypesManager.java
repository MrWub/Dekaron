package com.github.MrWub.Dekaron.mobs;

import java.util.ArrayList;
import java.util.List;

import com.github.MrWub.Dekaron.utils.wrapped.ParamForMobTypeCreate;

/**
 * 请不要直接构造此类，使用MobVersionManager的方法获取实例.
 *
 */
public class MobTypesManager {
	private List<MobType> types = new ArrayList<MobType>();

	public void addMobType(ParamForMobTypeCreate param) {
		MobType mt = MobType.createMobType(param);
		types.add(mt);
	}
}
