//圆柱体类Cylinder的成员在内存中的分配关系
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
public class App6_2{		//定义公共类
	public static void main(String[] args){	//程序执行的起始点
		Cylinder volu1,volu2;
		volu1=new Cylinder();		//创建新的对象volu1
		volu2=new Cylinder();		//创建新的对象volu2
		volu1.a=volu2.a=2.5;		//赋值圆柱volu的底面积
		volu2.pi=3;		//修改volu2的pi值
		System.out.println("圆柱1底圆半径="+volu1.a);		//输出底圆1半径
		System.out.println("圆柱2底圆半径="+volu2.a);		//输出底圆2半径
		System.out.println("圆柱1的pi值="+volu1.pi);		
		System.out.println("圆柱2的pi值="+volu2.pi);
		System.out.print("圆柱1");
		volu1.area();
		System.out.print("圆柱2");
		volu2.area();
	}
}