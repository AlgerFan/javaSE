package org.future.vehicle.pojo;

//输入两个数  输出最大的数  如果相同，全部输出
import java.util.*;
public class pratice02{
	public static void main(String[] args){
		int a1,a2;
		Scanner reader=new Scanner(System.in);
		System.out.print("请输入第一个数:");
		a1=reader.nextInt();
		System.out.print("请输入第二个数:");
		a2=reader.nextInt();
		if(a1<a2)
			System.out.println("您输入最大的数是:"+a2);
		else	if(a1!=a2)
						System.out.println("您输入最大的数是:"+a1);
					else
						System.out.println("您输入两个数相等是:"+a1);
	}
}