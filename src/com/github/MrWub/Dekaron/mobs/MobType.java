package com.github.MrWub.Dekaron.mobs;

import org.bukkit.entity.EntityType;

public class MobType {
	private EntityType entityType = null;
	public static MobType createMobType(EntityType type) {
		MobType mt = new MobType();
		mt.setEntityType(type);
		return mt;
	}
	public EntityType getEntityType() {
		return entityType;
	}
	private void setEntityType(EntityType entityType) {
		this.entityType = entityType;
	}
}
