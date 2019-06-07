//以一般变量为参数的方法调用
class Cylinder{
	double a;
	int height;
	double pi;
	void setCylinder(double r, int h,double p)	{	//具有三个参数的方法
		pi=p;
		a=r;
		height=h;
	}
	double area()	{	//定义返回值为double型的方法area(),计算底面积
		return pi*a*a;
	}
	double volume()	{	//定义返回值为double型的方法volume(),计算体积
		return area()*height;	//在类中调用area()方法
	}
}
public class App6_4{
	public static void main(String[] args){
		Cylinder volu=new Cylinder();
		volu.setCylinder(2.5,5,3.14);	//调用并传递参数到setCylinder()方法中
		System.out.println("底圆半径="+volu.a);
		System.out.println("圆柱的高="+volu.height);
		System.out.println("圆周率pi="+volu.pi);
		System.out.print("圆柱");
		System.out.println("底面积="+volu.area());
		System.out.println("圆体积="+volu.volume());
	}
}