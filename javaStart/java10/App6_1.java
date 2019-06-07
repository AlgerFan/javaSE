//圆柱形类Cylinder
class Cylinder{  //定义Cylinder
	double a;//定义成员变量a
	int height;//定义成员变量height
	double pi=3.14;
	void area() {//定义无返回值的方法area(),用来计算圆柱底面积
		System.out.println("底面积="+pi*a*a);
	}
	double volume() {//定义返回值为double型的方法volume(),计算体积
		return (pi*a*a)*height;
	}
}
public class App6_1{		//定义公共类
	public static void main(String[] args){	//程序执行的起始点
		Cylinder volu;
		volu=new Cylinder();		//创建新的对象
		volu.a=2.8;		//赋值圆柱volu的底面积
		volu.height=5;	//赋值圆柱的高
		System.out.println("底圆半径="+volu.a);		//输出底圆半径
		System.out.println("圆柱的高="+volu.height);	//输出圆柱的高
		System.out.print("圆柱");
		volu.area();		//输出圆柱底面积
		System.out.println("圆柱体体积="+volu.volume());	//输出圆柱的体积
	}
}