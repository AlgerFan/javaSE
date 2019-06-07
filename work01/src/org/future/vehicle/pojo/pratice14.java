package org.future.vehicle.pojo;

//一个5位数，判断它是不是回文数。即12321是回文数，个位与万位相同，十位与千位相同；
import java.util.*;
public class pratice14{
	public static void main(String[] args){
		Scanner reader=new Scanner(System.in);
		System.out.println("请输入一个五位数:");
		int a=reader.nextInt();
		if(a/10000==a%10 && a%10000/1000==a/10%10){
			System.out.println("该数是回文数:");
		}
		else{
			System.out.println("该数不是回文数:");
		}
	}
}