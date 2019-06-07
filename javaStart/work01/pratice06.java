package org.future.vehicle.pojo;

//输入一个字符，是字母则输入"YES!"否则输出"NO!"
import java.util.*; 
public class pratice06{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in );
		System.out.print("输入一个字符");
		char ab=sc.next().charAt(0);
		//sc.next()读入一行字符串.charAt(0)是指这行字符串的第一个字符,然后赋值到ab中
		if(ab>='A' && ab<='Z'||ab>='a' && ab<='z')
			System.out.println("yes");
		else
			System.out.println("no");
	}
}