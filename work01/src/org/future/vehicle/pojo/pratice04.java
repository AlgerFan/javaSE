package org.future.vehicle.pojo;

//����һ���뾶 ���Բ���ܳ������
import java.util.*;
public class pratice04{
	public static void main(String[] args){
		double b=3.1415926,a,l,s;
		Scanner reader=new Scanner(System.in);
		System.out.print("������һ���뾶:");
		a=reader.nextDouble();
		l=b*a*2;
		s=b*a*a;
		System.out.println("Բ���ܳ�Ϊ:"+l);
		System.out.println("Բ�����Ϊ:"+s);
	}
}