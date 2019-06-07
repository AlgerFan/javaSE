package org.future.vehicle.pojo;

/*
要求用户输入两个数a、b，如果a能被b整除或a加b大于1000，则输出a，
否则输出b; 如果a能被b整除同时a加b大于1000，则输出a和b; （ ||  &&）
*/
import java.util.*;
public class pratice07{
	public static void main(String[] args){
		int a,b;
		Scanner reader=new Scanner(System.in);
		System.out.print("请输入第一个数:");
		a=reader.nextInt();
		System.out.print("请输入第二个数:");
		b=reader.nextInt();
		if(a%b==0 || a+b>1000){
			System.out.println("a="+a);
		}
		else if(a%b==0 && a+b>1000){
			System.out.println("a="+a+",b="+b);
		}
	}
}