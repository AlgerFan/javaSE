package org.future.vehicle.pojo;

//输入一个数字  12345分别代表优秀良好一般 及格 不及格
import java.util.*;
public class pratice05{
	public static void main(String[] args){
		int a;
		Scanner reader=new Scanner(System.in);
		System.out.print("请输入一个数字:");
		a=reader.nextInt();
		switch(a){
			case 1:
				System.out.println("该学生的成绩为优秀");
				break;
			case 2:
				System.out.println("该学生的成绩为良好");
				break;
			case 3:
				System.out.println("该学生的成绩为一般");
				break;
			case 4:
				System.out.println("该学生的成绩为及格");
				break;
			default:
				System.out.println("该学生的成绩为不及格");
				break;
		}
	}
}