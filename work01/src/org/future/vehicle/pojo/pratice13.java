package org.future.vehicle.pojo;

//��һ��������5λ����������Ҫ��һ�������Ǽ�λ�������������ӡ����λ����
import java.util.*;
public class pratice13{
	public static void main(String[] args){
		int a;
		Scanner reader=new Scanner(System.in);
		System.out.print("������һ��С��5λ����:");
		a=reader.nextInt();
		String s=String.valueOf(a);  //��aת�����ַ�����ֵ��s
			System.out.println("�������ֵĳ���Ϊ:"+s.length());
			for(int i=s.length()-1;i>=0;i--){
				System.out.print(s.substring(i,i+1));//��s�ĵ�i+1���ַ���ȡ����
			}
	}
}