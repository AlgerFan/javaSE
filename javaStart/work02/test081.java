package org.future;
/*
 * 一个数字类有一个成员变量v，有一个初值100，设计一个对猜得数判断的方法；定义主类，对A类的成员变量v进行猜测，用该对象进行三次猜测，
 * 一大，一小，一相等。如果大了则提示你猜大了，小了则提示你猜小了。等于则提示猜测成功。
 */
import java.util.Scanner; 
import java.util.Random;  //创建一个新的随机数处理器
public class test081 {
	public static void main(String[] args){	
		int oldnum,num,i=0;
		Random r = new Random();  //创建一个随机函数
		oldnum = r.nextInt(100);  //给定一个随机数范围100
		while(true){  
			i++;  
			Scanner sc = new Scanner(System.in);//输入一个整数
			System.out.println("请输入一个数:");
			num=sc.nextInt();  //把输入的值给num
			if(oldnum > num){  
				System.out.println("你猜的数字小了");
			}
			else if(oldnum < num){
				System.out.println("你猜的数字大了");
			}
			else{
				System.out.println("你猜对了，一共猜了"+ i +"次");	
				break;  
			}
		}
	}
}
