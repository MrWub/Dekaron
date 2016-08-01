package com.github.MrWub.Dekaron;

/**
 * 
 * @author sckbee<br />
 * @version 1.0.0.0
 */
public interface Manager {
	/**
	 * 
	 * @param version BukkitAPI的版本
	 * @return 管理器实例,每个版本有且只有一个实例
	 */
	public Manager getInstance(BukkitVersionType version);
	/**
	 * 
	 * @return 默认版本的管理器实例
	 */
	public Manager getInstance();
	/**
	 * 
	 * @return 管理器支持的所有版本的数组
	 */
	public BukkitVersionType[] getSupportVersions();
}
