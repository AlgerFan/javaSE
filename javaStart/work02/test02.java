package org.future;
/*
 * 2.从键盘输入一个年份，判断闰年（能被4整除但不能被100整除，	
 * 或能被400整除的年份即为闰年），是闰年输出××是闰年，反	之输出××不是闰年
 */
import java.util.*;
public class test02 {
	public static void main(String[] args) {
		int a;
		Scanner reader=new Scanner(System.in);
		System.out.println("请输入一个年份:");
		a=reader.nextInt();
		if(a%4==0 && a%100!=0 || a%400==0){
			System.out.println(a+"是闰年");
		}
		else
			System.out.println(a+"不是闰年");
	}
}
