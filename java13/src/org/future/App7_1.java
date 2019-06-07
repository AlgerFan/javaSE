package org.future;

class Cylinder{
	//private
	double a;//将数据成员radius声明为私有的
	//private
	int height;//将数据成员height声明为私有的
	//private
	double pi=3.14;//将数据成员pi声明为私有的，并赋初值
	double area(){
		return pi*a*a;//在Cylinder类内部，故可访问私有成员
	}
	double volume(){
		return area()*height;//在类内可以访问私有成员height
	}
}
public class App7_1 {
	public static void main(String[] args) {
		Cylinder volu;
		volu=new Cylinder();
		volu.a=2.8;
		volu.height=-5;
		System.out.println("底面半径="+volu.a);
		System.out.println("圆柱的高="+volu.height);
		System.out.print("圆柱");
		System.out.println("底面积="+volu.area());
		System.out.println("圆柱体体积="+volu.volume());
	}
}
