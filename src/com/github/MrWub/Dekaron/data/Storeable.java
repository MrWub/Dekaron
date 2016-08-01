package com.github.MrWub.Dekaron.data;

/**
 * 
 * @author sckbee
 *	@version 1.0.0.0
 */
public interface Storeable {
	/**
	 * 
	 * @return 返回字节数组形式方便储存
	 */
	public byte[] toBytes();
}
