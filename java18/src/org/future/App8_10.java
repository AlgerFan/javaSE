package org.future;
//抽象类的说明
abstract class Shape{		//定义形状抽象类Shape
	protected String name;
	public Shape(String xm){	//抽象类的一般方法，本方法是构造方法
		name=xm;
		System.out.print("名称:"+name);
	}
	abstract public double getArea();  //声明抽象方法
	abstract public double getLength();//声明抽象方法
}
class Circle extends Shape{	//定义继承自Shape的圆形子类Circle
	private final double PI=3.14;
	private double radius;
	public Circle(String shapeName,double r){//构造方法
		super(shapeName);
		radius=r;
	}
	public double getArea(){
		return PI*radius*radius;
	}
	public double getLength(){	//实现抽象类中的getLength()方法
		return 2*PI*radius;
	}
}
public class App8_10 {
	public static void main(String[] args) {
		Shape circle=new Circle("圆",10.2);  //声明父类对象的circle,指向子类对象
		System.out.print(";面积="+circle.getArea());
		System.out.println(";周长="+circle.getLength());
	}
}
