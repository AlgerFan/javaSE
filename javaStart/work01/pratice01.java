package org.future.vehicle.pojo;

//依次输入数或者字母给int，String，byte,float,double,char类型的变量赋值并输出
import java.util.*;
public class pratice01{
	public static void main(String[] args){

		Scanner reader=new Scanner(System.in);
		System.out.print("请输入int类变量:");
		int a1=reader.nextInt();
		System.out.print("请输入String变量:");
		String a2=reader.next();
		System.out.print("请输入byte类变量:");
		byte a3=reader.nextByte();
		System.out.print("请输入float类变量:");
		float a4=reader.nextFloat();
		System.out.print("请输入double类变量:");
		double a5=reader.nextDouble();
		System.out.print("请输入chr类变量:");
		char a6=reader.next().charAt(0);
		System.out.println("您输入的为:"+a1);
		System.out.println("您输入的为:"+a2);
		System.out.println("您输入的为:"+a3);
		System.out.println("您输入的为:"+a4);
		System.out.println("您输入的为:"+a5);
		System.out.println("您输入的为:"+a6);
	}
}