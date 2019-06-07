package org.wlgzs.there;

//m个A n个B  组成多少排列

public class test3 {
	public static void main(String[] args) {
		System.out.println(g(3,1));
	}
	public static int g(int m, int n) {
		if (m==0 || n==0) {
			return 1;
		}
		return g(m-1, n) + g(m, n-1);
	}
}
