package org.wlgzs.two;

//在n个球中，任意取出m个（不放回），求有多少种不同的方法

public class test1 {
	public static void main(String[] args) {
		int k = f(5,3);
		System.out.println(k);
	}
	public static int f(int n, int m) {
		if (n<m) {
			return 0;
		}
		if (n==m) {
			return 1;
		}
		if (m==0) {
			return 1;
		}
		return f(n-1, m-1) + f(n-1, m);//n里面有个特殊的球，  取法划分：包不包含x
	}
}
