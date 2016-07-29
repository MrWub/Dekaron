package com.github.MrWub.Dekaron.mobs;

import java.util.ArrayList;
import java.util.List;

public class MobTypesManager {
	private static List<MobType> types = new ArrayList<MobType>();
	public static void addMobType(MobType mt) {
		types.add(mt);
	}
}
