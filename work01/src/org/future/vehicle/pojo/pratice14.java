package org.future.vehicle.pojo;

//һ��5λ�����ж����ǲ��ǻ���������12321�ǻ���������λ����λ��ͬ��ʮλ��ǧλ��ͬ��
import java.util.*;
public class pratice14{
	public static void main(String[] args){
		Scanner reader=new Scanner(System.in);
		System.out.println("������һ����λ��:");
		int a=reader.nextInt();
		if(a/10000==a%10 && a%10000/1000==a/10%10){
			System.out.println("�����ǻ�����:");
		}
		else{
			System.out.println("�������ǻ�����:");
		}
	}
}