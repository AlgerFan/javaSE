package org.wlgzs.one;

public class test1 {
	public static void main(String[] args) {
		//f(8);
		//f2(0, 9);
		f3(0, 9);
	}
	public static void f(int n){
		if(n>0) f(n-1);
		System.out.println(n);
	}
	public static void f2(int begin,int end){
		if (begin>end) return;
		System.out.println(begin);
		f2(begin+1, end);
	}
	public static void f3(int begin,int end){
		if (begin>=end) return;
		System.out.println(end);
		f3(begin, end-1);
	}
}
