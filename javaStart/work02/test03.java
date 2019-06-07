package org.future;
import java.util.Arrays;
//3.从键盘得到8个数，用数组接收，从大到小进行排序，相等无所谓	先后
import java.util.Scanner;
public class test03 {
	public static void main(String[] args) {
		int[] a=new int[8];
		Scanner input=new Scanner(System.in);
		System.out.println("请输入八个数字，每输入一个数字按一次回车:");
		for(int i=0;i<a.length;i++){
			a[i]=input.nextInt();
		}
		input.close();
		System.out.println(Arrays.toString(a));
		//调用Arrays.toString将数组a的值转换为字符串并 显示出来
		int am=0;//定义一个交换数据
		for(int i=0;i<a.length-1;i++){
			for(int j=i+1;j<a.length;j++){
				if(a[i]<a[j]){
					am=a[i];
					a[i]=a[j];
					a[j]=am;
				}
			}
		}
		System.out.print("排序后的顺序为:");
		for(int i=0;i<a.length;i++){
			System.out.print(a[i]+" ");
		}
	}
}
