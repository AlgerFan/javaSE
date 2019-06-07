package org.future;

class Cylinder11{
	private static double pi=3.14;
	private double a;
	private int height;
	public Cylinder11(double r,int h){
		a=r;
		height=h;
	}
	public void compare(Cylinder11 volu){//以对象作为方法的参数
		if (this==volu)
			System.out.println("这两个对象相等");
		else
			System.out.println("这两个对象不相等");
	}	
}
public class App7_11 {
	public static void main(String[] args) {
		Cylinder11 volu1=new Cylinder11(1.0,2);
		Cylinder11 volu2=new Cylinder11(1.0,2);
		Cylinder11 volu3=volu1;
		volu1.compare(volu2);	//调用compare(),比较volu1与volu2是否相等
		volu1.compare(volu3);	//调用compare(),比较volu1与volu2是否相等
	}
}