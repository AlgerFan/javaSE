package org.wlgzs.test;


/*
 * 问题描述
　　求出区间[a,b]中所有整数的质因数分解。
输入格式
　　输入两个整数a，b。
输出格式
　　每行输出一个数的分解，形如k=a1*a2*a3...(a1<=a2<=a3...，k也是从小到大的)(具体可看样例)
样例输入
3 10
样例输出
3=3
4=2*2
5=5
6=2*3
7=7
8=2*2*2
9=3*3
10=2*5
提示
　　先筛出所有素数，然后再分解。
数据规模和约定
　　2<=a<=b<=10000
 */

import java.util.Scanner;

public class test14 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String str = scanner.nextLine();
		String[] strs = str.split(" ");
		scanner.close();
		
		int n = Integer.parseInt(strs[0]);
		int m = Integer.parseInt(strs[1]);
		for (int i = n; i <= m; i++) {
			//调用分解质因数的函数
			one(i);
		}
	}
	public static void one(int x) {
		int a = 2;
		int n = x;
		int first = 1;
		while (a <= n) {
			if (!(x % a == 0)) {
				a++;
			} else {
				x /= a;
				if (first == 1) {
					System.out.print(n+"="+a);
					first++;
				} else {
					System.out.print("*"+a);
				}
			}
		}
		System.out.println();
	}
}
