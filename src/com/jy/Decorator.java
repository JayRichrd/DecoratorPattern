package com.jy;

/**
 * 抽象Decorator类
 * 
 * @author jiangyu
 *
 */
public abstract class Decorator extends Sweet {
	// 持有的Component对象，用来接收具体的装饰类
	protected Sweet sweet;

	public Decorator(Sweet sweet) {
		super();
		this.sweet = sweet;
	}

	@Override
	public double getPrice() {
		return sweet.getPrice();
	}

	@Override
	public String getDescription() {
		return sweet.getDescription();
	}

}
