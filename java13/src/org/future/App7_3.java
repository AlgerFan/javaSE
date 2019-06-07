package org.future;

//方法的重载
class Cylinder2{
	private double a;
	private int height;
	private double pi=3.14;
	private String color;
	public double setCylinder2(double r,int h){//重载方法
		a=r;
		height=h;
		return r+h;
	}
	public void setCylinder2(String str){	//重载方法
		color=str;
	}
	public void show(){
		System.out.println("圆柱的颜色为:"+color);
	}
	double area(){
		return pi*a*a;
	}
	double volume(){
		return area()*height;
	}
}
public class App7_3 {
	public static void main(String[] args) {
		double r_h;
		Cylinder2 volu=new Cylinder2();
		r_h=volu.setCylinder2(2.5, 5);	//设置圆柱的底面积和高
		volu.setCylinder2("红色");
		System.out.println("圆柱底半径和高之和="+r_h);
		System.out.println("圆柱体体积="+volu.volume());
		volu.show();
	}
}
