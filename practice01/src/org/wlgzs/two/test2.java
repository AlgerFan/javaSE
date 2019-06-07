package org.wlgzs.two;

//求n个元素的全排列

public class test2 {
	public static void main(String[] args) {
		char[] data = "ABC".toCharArray();
		f(data, 0);
	}
	public static void f(char[] data, int k) {
		if (k==data.length) {
			for (int i = 0; i < data.length; i++) {
				System.out.print(data[i] + " ");
			}
			System.out.println();
		}
		for (int i = k; i < data.length; i++) {
			{char t = data[k]; data[k] = data[i];data[i] = t;}
			f(data, k+1);
			{char t = data[k]; data[k] = data[i];data[i] = t;}
		}
	}
}
