package com.github.MrWub.Dekaron;

import org.bukkit.plugin.java.JavaPlugin;

public class Dekaron extends JavaPlugin{
    public void onEnable() {
    	getCommand("dkr").setExecutor(new DekaronCommand());
    }

	public void onDisable() {
	}
}
