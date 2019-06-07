package org.future.vehicle.pojo;

//给一个不多于5位的正整数，要求：一、求它是几位数，二、逆序打印出各位数字
import java.util.*;
public class pratice13{
	public static void main(String[] args){
		int a;
		Scanner reader=new Scanner(System.in);
		System.out.print("请输入一个小于5位的数:");
		a=reader.nextInt();
		String s=String.valueOf(a);  //将a转化成字符串赋值给s
			System.out.println("输入数字的长度为:"+s.length());
			for(int i=s.length()-1;i>=0;i--){
				System.out.print(s.substring(i,i+1));//将s的第i+1个字符截取下来
			}
	}
}