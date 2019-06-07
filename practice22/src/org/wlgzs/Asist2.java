package org.wlgzs;

import java.util.Scanner;

/**
 * 题目名称:完美的代价
关键字:贪心算法
　　回文串，是一种特殊的字符串，它从左往右读和从右往左读是一样的。小龙龙认为回文串才是完美的。现在给你一个串，它不一定是回文的，请你计算最少的交换次数使得该串变成一个完美的回文串。
　　交换的定义是：交换两个相邻的字符
　　例如mamad
　　第一次交换 ad : mamda
　　第二次交换 md : madma
　　第三次交换 ma : madam (回文！完美！)
输入格式
　　第一行是一个整数N，表示接下来的字符串的长度(N <= 8000)
　　第二行是一个字符串，长度为N.只包含小写字母
输出格式
　　如果可能，输出最少的交换次数。
　　否则输出Impossible
样例输入
5
mamad
样例输出
3
 */
public class Asist2 {
	private static int change = 0; // 改变的次数

	private static int old = 0; // 记录出现奇数次字符
	private static char charold = 0; // 记录奇数字符

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入字符串长度后回车  再输入字符串");
		int N = Integer.parseInt(sc.nextLine());
		String s = sc.nextLine();
		char str[] = s.toCharArray();
		boolean flag = check(str); // 是否可以组成回文

		if (!flag) {
			System.out.println("Impossible");
		} else {
			for (int i = 0; i < N / 2; i++) {
				if (str[i] != charold) {  // 从右开始找对称
					int j = 0;
					for (j = N - 1 - i; j > i; j--) {
						if (str[i] == str[j])
							break; // 找到
					}
					change += N - 1 - i - j; // 移动次数
					for (int k = j; k < N - 1 - i; k++) {
						str[k] = str[k + 1];
					}
					str[N - 1 - i] = str[i]; // 对称点
				} else {  // 从左边开始
					int j = 0;
					for (j = i; j < N - 1 - i; j++) {
						if (str[j] == str[N - 1 - i])
							break; // 找到
					}
					change += j - i; // 移动次数
					for (int k = j; k > i; k--) {
						str[k] = str[k - 1];
					}
					str[i] = str[N - 1 - i]; // 对称点
				}
			}
			System.out.println(change);
		}
	}

	private static boolean check(char[] str) {
		int arr[] = new int[26];
		for (int i = 0; i < str.length; i++) {
			arr[str[i] - 'a']++;
		}

		for (int i = 0; i < 26; i++) {
			if (arr[i] % 2 == 1) {
				old++;
				charold = (char) (i + 'a');
			}
		}

		if (old > 1)
			return false;
		return true;
	}
}
