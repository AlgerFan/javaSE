package org.future.vehicle.pojo;

//输入一个三位数  依次输出该数的百位数 十位数 个位数
import java.util.*;
public class pratice03{
	public static void main(String[] args){
		int a,bai,shi,b,ge;
		Scanner reader=new Scanner(System.in);
		System.out.print("请输入一个三位数:");
		a=reader.nextInt();
		bai=a/100;
		b=a%100;
		shi=b/10;
		ge=b%10;
		System.out.println("bai="+bai+",shi="+shi+",ge="+ge);
	}
}