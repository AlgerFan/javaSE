package org.future.vehicle.pojo;

//����������������ĸ��int��String��byte,float,double,char���͵ı�����ֵ�����
import java.util.*;
public class pratice01{
	public static void main(String[] args){

		Scanner reader=new Scanner(System.in);
		System.out.print("������int�����:");
		int a1=reader.nextInt();
		System.out.print("������String����:");
		String a2=reader.next();
		System.out.print("������byte�����:");
		byte a3=reader.nextByte();
		System.out.print("������float�����:");
		float a4=reader.nextFloat();
		System.out.print("������double�����:");
		double a5=reader.nextDouble();
		System.out.print("������chr�����:");
		char a6=reader.next().charAt(0);
		System.out.println("�������Ϊ:"+a1);
		System.out.println("�������Ϊ:"+a2);
		System.out.println("�������Ϊ:"+a3);
		System.out.println("�������Ϊ:"+a4);
		System.out.println("�������Ϊ:"+a5);
		System.out.println("�������Ϊ:"+a6);
	}
}