package org.future;
//乘法口诀表
public class test04 {
	public static void main(String[] args) {
		for(int a=1;a<=9;a++){
			for(int b=1;b<=a;b++){
				System.out.print(a+"*"+b+"="+a*b+"\t");
			}
			System.out.println();
		}
	}
}