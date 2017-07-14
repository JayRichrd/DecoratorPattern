package com.jy;

public class DecoratorPattern {

	public static void main(String[] args) {
		// 未装饰
		Sweet cake = new Cake();
		System.out.println("您购买清单:" + cake.getDescription() + " = " + cake.getPrice() + "元");

		// TODO 使用工厂模式来管理过多的具体装饰类
		// 装饰后
		Sweet fruitDecorator = new FruitDecorator(cake);
		System.out.println("您购买清单:" + fruitDecorator.getDescription() + " = " + fruitDecorator.getPrice() + "元");

		// 继续装饰
		Sweet candleDecorator = new CandleDecorator(fruitDecorator);
		System.out.println("您购买清单:" + candleDecorator.getDescription() + " = " + candleDecorator.getPrice() + "元");

	}

}
