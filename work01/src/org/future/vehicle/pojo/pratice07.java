package org.future.vehicle.pojo;

/*
Ҫ���û�����������a��b�����a�ܱ�b������a��b����1000�������a��
�������b; ���a�ܱ�b����ͬʱa��b����1000�������a��b; �� ||  &&��
*/
import java.util.*;
public class pratice07{
	public static void main(String[] args){
		int a,b;
		Scanner reader=new Scanner(System.in);
		System.out.print("�������һ����:");
		a=reader.nextInt();
		System.out.print("������ڶ�����:");
		b=reader.nextInt();
		if(a%b==0 || a+b>1000){
			System.out.println("a="+a);
		}
		else if(a%b==0 && a+b>1000){
			System.out.println("a="+a+",b="+b);
		}
	}
}