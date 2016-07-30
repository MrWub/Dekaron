package com.github.MrWub.Dekaron.mobs;

import java.util.ArrayList;
import java.util.List;

import com.github.MrWub.Dekaron.utils.wrapped.ParamForMobTypeCreate;

public class MobTypesManager {
	private static List<MobType> types = new ArrayList<MobType>();
	public static void addMobType(ParamForMobTypeCreate param) {
		MobType mt = MobType.createMobType(param);
		types.add(mt);
	}
}
