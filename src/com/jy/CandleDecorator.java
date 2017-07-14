package com.jy;

/**
 * ConcreteDecoratorB类
 * 
 * @author jiangyu
 *
 */
public class CandleDecorator extends Decorator {

	public CandleDecorator(Sweet sweet) {
		super(sweet);
	}

	@Override
	public String getDescription() {
		// 在原有的基础上进行扩展、补充
		return super.getDescription() + " + candle";
	}

	@Override
	public double getPrice() {
		// 在原有的基础上进行扩展、补充
		return super.getPrice() + 5.0;
	}

}
