package org.future.vehicle.pojo;

/*һ�������ǡ�õ�����������֮�ͣ�������ͳ�Ϊ"����"��
����6=1��2��3.��� �ҳ�1000���ڵ���������
*/
public class pratice11{
	public static void main(String[] args){
		for(int i=1;i<=1000;i++){
			int sum=0;
			for(int j=1;j<i;j++){
				if(i%j==0)
					sum+=j;
			}
			if(sum==i){
				System.out.println(i);
		  }
		}
	}
}