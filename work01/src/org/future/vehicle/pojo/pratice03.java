package org.future.vehicle.pojo;

//����һ����λ��  ������������İ�λ�� ʮλ�� ��λ��
import java.util.*;
public class pratice03{
	public static void main(String[] args){
		int a,bai,shi,b,ge;
		Scanner reader=new Scanner(System.in);
		System.out.print("������һ����λ��:");
		a=reader.nextInt();
		bai=a/100;
		b=a%100;
		shi=b/10;
		ge=b%10;
		System.out.println("bai="+bai+",shi="+shi+",ge="+ge);
	}
}