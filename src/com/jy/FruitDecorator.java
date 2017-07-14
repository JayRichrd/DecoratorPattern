package com.jy;

/**
 * ConcreteDecoratorA类
 * 
 * @author jiangyu
 *
 */
public class FruitDecorator extends Decorator {

	public FruitDecorator(Sweet sweet) {
		super(sweet);
	}

	@Override
	public String getDescription() {
		// 在原有的基础上进行扩展、补充
		return super.getDescription() + " + fruit";
	}

	@Override
	public double getPrice() {
		// 在原有的基础上进行扩展、补充
		return super.getPrice() + 10.0;
	}

}
