package org.future.vehicle.pojo;

//����һ������  12345�ֱ������������һ�� ���� ������
import java.util.*;
public class pratice05{
	public static void main(String[] args){
		int a;
		Scanner reader=new Scanner(System.in);
		System.out.print("������һ������:");
		a=reader.nextInt();
		switch(a){
			case 1:
				System.out.println("��ѧ���ĳɼ�Ϊ����");
				break;
			case 2:
				System.out.println("��ѧ���ĳɼ�Ϊ����");
				break;
			case 3:
				System.out.println("��ѧ���ĳɼ�Ϊһ��");
				break;
			case 4:
				System.out.println("��ѧ���ĳɼ�Ϊ����");
				break;
			default:
				System.out.println("��ѧ���ĳɼ�Ϊ������");
				break;
		}
	}
}