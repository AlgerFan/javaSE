package org.future.vehicle.pojo;

/*
���������������Ƕ������ɴ��⣺ѧϰ�ɼ�>=90�ֵ�ͬѧ��A��ʾ��60-89��֮�����B��ʾ��
60�����µ���C��ʾ���ã�a>b��? a:b��
*/
import java.util.*;
public class pratice12{
	public static void main(String[] args){
		int a;
		Scanner reader=new Scanner(System.in);
		System.out.print("������ɼ�:");
		a=reader.nextInt();
		if(a>90){
			System.out.print("����A��");
		}else{
			System.out.print(a>60 ? "����B��":"����C��");
		}
	}
}