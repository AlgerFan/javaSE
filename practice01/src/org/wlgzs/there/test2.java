package org.wlgzs.there;

/*
 * 1
 * 1 1
 * 1 2 1
 * 1 3 3 1
 * 1 4 6 4 1
 */
public class test2 {
	public static void main(String[] args) {
		int level = 5;
		
		for (int i = 0; i <= level; i++) {
			System.out.print(f(level,i)+" ");
		}
	}
	//杨辉三角形m层的第n个元素
	public static int f(int m,int n) {
		if (n==0) {
			return 1;
		}
		if (m==n) {
			return 1;
		}
		return f(m-1, n) + f(m-1, n-1);
	}
}
