//依次输入数或者字母给int，String，byte,float,double,char类型的变量赋值并输出
import java.util.*;
public class pratice01{
	public static void main(String[] args){
		int a1;
		String a2;
		byte a3;
		float a4;
		double a5;

		Scanner reader=new Scanner(System.in);
		System.out.print("请输入一个数或者字母:");
		a1=reader.nextInt();
		System.out.print("请输入第二个数或者字母:");
		a2=reader.nextLine();
		System.out.print("请输入第三个数或者字母:");
		a3=reader.nextByte();
		System.out.print("请输入第四个数或者字母:");
		a4=reader.nextFloat();
		System.out.print("请输入第五个数或者字母:");
		a5=reader.nextDouble();

		System.out.println("您输入的为:"+a1);
		System.out.println("您输入的为:"+a2);
		System.out.println("您输入的为:"+a3);
		System.out.println("您输入的为:"+a4);
		System.out.println("您输入的为:"+a5);

	}
}