package org.future.vehicle.pojo;

//����������  ���������  �����ͬ��ȫ�����
import java.util.*;
public class pratice02{
	public static void main(String[] args){
		int a1,a2;
		Scanner reader=new Scanner(System.in);
		System.out.print("�������һ����:");
		a1=reader.nextInt();
		System.out.print("������ڶ�����:");
		a2=reader.nextInt();
		if(a1<a2)
			System.out.println("��������������:"+a2);
		else	if(a1!=a2)
						System.out.println("��������������:"+a1);
					else
						System.out.println("�����������������:"+a1);
	}
}