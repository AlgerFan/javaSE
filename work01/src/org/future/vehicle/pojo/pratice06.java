package org.future.vehicle.pojo;

//����һ���ַ�������ĸ������"YES!"�������"NO!"
import java.util.*; 
public class pratice06{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in );
		System.out.print("����һ���ַ�");
		char ab=sc.next().charAt(0);
		//sc.next()����һ���ַ���.charAt(0)��ָ�����ַ����ĵ�һ���ַ�,Ȼ��ֵ��ab��
		if(ab>='A' && ab<='Z'||ab>='a' && ab<='z')
			System.out.println("yes");
		else
			System.out.println("no");
	}
}