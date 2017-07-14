package com.jy;

/**
 * Component抽象类
 * 
 * @author jiangyu
 *
 */
public abstract class Sweet {
	/**
	 * 返回物品描述
	 * 
	 * @return
	 */
	public abstract String getDescription();

	/**
	 * 返回物品的价格
	 * 
	 * @return
	 */
	public abstract double getPrice();
}
