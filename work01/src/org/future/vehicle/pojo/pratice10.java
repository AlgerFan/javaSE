package org.future.vehicle.pojo;

//��1��2��3��4�����֣�����ɶ��ٸ�������ͬ�����ظ����ֵ���λ�������Ƕ��٣�
public class pratice10{
	public static void main(String[] args){
		int a,b,c;
		for(a=1;a<=4;a++){
			for(b=1;b<=4;b++){
				if(a!=b)
					for(c=1;c<=4;c++){
						if(c!=b && c!=a)
						System.out.println(a*100+b*10+c);
				}
			}
		}
	}
}