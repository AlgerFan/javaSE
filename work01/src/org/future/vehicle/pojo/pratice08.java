package org.future.vehicle.pojo;

//输出1+2+3+...+100;的值（for循环语句）
public class pratice08{
	public static void main(String[] args){
		int s=0,i;
		for(i=1;i<=100;i++)
			s=s+i;
		System.out.print("1+2+3+...+100=:"+s);
	}
}