package org.future;

class Cylinder9{
	private static int num=0;
	private static double pi=3.14;
	private double a;
	private int height;
	public Cylinder9(double r,int h){
		a=r;
		height=h;
		num++;		//当构造方法Cylinder()被调用时，num便加1
	}
	public static void count(){//声明count()为静态方法
		System.out.println("创建了"+num+"个对象");
	}
	double area(){
		return pi*a*a;
	}
	double volume(){
		return area()*height;
	}
}
public class App7_9 {
	public static void main(String[] args) {
		Cylinder9.count();//在对象产生之前用Cylinder类名调用count()方法
		Cylinder9 volu1=new Cylinder9(2.5,3);
		volu1.count();//用对象volu1调用count()方法
		System.out.println("圆柱1的体积="+volu1.volume());
		Cylinder9 volu2=new Cylinder9(1.0,2);
		Cylinder9.count();//用类名Cylinder直接调用count()方法
		System.out.println("圆柱2的体积="+volu2.volume());
	}
}
