//定义公共方法来访问私有成员
class Cylinder{
	private double a;//声明私有数据成员
	private int height;
	private double pi=3.14;
	public void setCylinder(double r,int h){	//声明具有两个参数的公共方法
		if(r>0&&h>0){
			a=r;
			height=h;
		}
		else
			System.out.println("您的数据有错误!!");
	}
	double area(){
		return pi*a*a;//在类内可以访问私有成员a和pi
	}
	double volume(){
		return area()*height;//在类内可以访问私有成员height
	}
}

public class App7_2 {
	public static void main(String[] args) {
		Cylinder volu=new Cylinder();
		volu.setCylinder(2.5, -5);//通过公共方法setCylinder()访问私有数据
		System.out.println("圆柱底面积="+volu.area());
		System.out.println("圆柱体体积="+volu.volume());
	}
}