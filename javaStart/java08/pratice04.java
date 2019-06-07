//输入一个半径 输出圆的周长，面积
import java.util.*;
public class pratice04{
	public static void main(String[] args){
		double b=3.1415926,a,l,s;
		Scanner reader=new Scanner(System.in);
		System.out.print("请输入一个半径:");
		a=reader.nextDouble();
		l=b*a*2;
		s=b*a*a;
		System.out.println("圆的周长为:"+l);
		System.out.println("圆的面积为:"+s);
	}
}