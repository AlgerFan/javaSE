//在类内部调用方法
class Cylinder	{	//定义Cylinder
	double a;
	int height;
	double pi=3.14;
	double area()	{	//定义返回值为double型的方法area(),计算底面积
		return pi*a*a;
	}
	double volume()	{	//定义返回值为double型的方法volume(),计算体积
		return area()*height;	//在类中调用area()方法
	}
}
public class App6_3{
	public static void main(String[] args){
		Cylinder volu;
		volu=new Cylinder();
		volu.a=2.8;
		volu.height=5;
		System.out.println("底面半径="+volu.a);
		System.out.println("圆柱的高="+volu.height);
		System.out.print("圆柱");
		System.out.println("底面积="+volu.area());
		System.out.println("圆柱体体积="+volu.volume());
	}
}
