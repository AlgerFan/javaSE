package org.future.vehicle.pojo;

/*
利用条件运算符的嵌套来完成此题：学习成绩>=90分的同学用A表示，60-89分之间的用B表示，
60分以下的用C表示（用（a>b）? a:b）
*/
import java.util.*;
public class pratice12{
	public static void main(String[] args){
		int a;
		Scanner reader=new Scanner(System.in);
		System.out.print("请输入成绩:");
		a=reader.nextInt();
		if(a>90){
			System.out.print("属于A等");
		}else{
			System.out.print(a>60 ? "属于B等":"属于C等");
		}
	}
}