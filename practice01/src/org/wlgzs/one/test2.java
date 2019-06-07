package org.wlgzs.one;

public class test2 {
	public static void main(String[] args) {
		int[] a = {2,5,8,6,4,6};
		int sum = f(a,0);
		int sum1 = a[a.length-1]+f1(a.length-2, a);
		System.out.println(sum);
		System.out.println(sum1);
	}
	public static int f(int[] a, int begin) {
		if (begin==a.length) return 0;
		//踢皮球
		int x = f(a,begin+1);
		return x + a[begin];
	}
	public static int f1(int end, int[] a) {
		if (end<0) return 0;
		//踢皮球
		int x = f1(end-1,a);
		return x + a[end];
	}
}
