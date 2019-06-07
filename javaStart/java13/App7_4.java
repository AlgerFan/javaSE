class Cylinder{
	private double a;//声明私有数据成员
	private int height;
	private double pi=3.14;
	public Cylinder(double r,int h){	//定义有参数的构造方法
			a=r;
			height=h;
		}
	double area(){
		return pi*a*a;//在类内可以访问私有成员a和pi
	}
	double volume(){
		return area()*height;//在类内可以访问私有成员height
	}
}
public class App7_4 {
	public static void main(String[] args) {
		Cylinder volu=new Cylinder(3.5,8);//调用有参构造方法创建对象
		System.out.println("圆柱底面积="+volu.area());
		System.out.println("圆柱体体积="+volu.volume());
	}
}