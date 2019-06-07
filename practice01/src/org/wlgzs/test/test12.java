package org.wlgzs.test;

/*
 * 问题描述
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

import java.util.Scanner;

public class test12 {
	public static void main(String[] args) {
		boolean b = true;
		char x1 = 0;//x1记录字符串长度为奇数且第一次未匹配，x2记录第二次未匹配
		int sum = 0;//交换次数
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		char[] charArray = new char[n];
		charArray = scanner.next().toCharArray();//输出的字符串转化成字符数组
		scanner.close();
		//i表示从左往右未匹配字符的下标
		//j表示从右往左未匹配字符的下标
		for (int i = 0; i < charArray.length/2; i++) {
			//如果不能匹配（字符串长度为奇数）
			//从右向左找与左下标为i的字符相匹配的
			for (int j = i; j < charArray.length-1-i; j++) {
				//如果匹配
				if (charArray[i] == charArray[charArray.length-1-j]) {
					b=true;
					//如果左右不对称则交换
					if (i!=j) {
						char a = charArray[charArray.length-1-j];
						for (int k = j; k > i; k--) {
							sum++;
							charArray[charArray.length-1-k] = charArray[charArray.length-k];
							
						}
						charArray[charArray.length-1-i] = a;
					}
					break;//匹配完成就跳出j的循环
				} else {
					b=false;
					//若最后一次为匹配到，则保存charArray[i]
					if (j==charArray.length-i-2 && charArray[i]!=charArray[charArray.length-1-j]) {
						if (x1 == charArray[i] || x1 == 0) {
							x1 = charArray[i];
						}
					}
				}
			}
			if (b==false) {
				if (charArray.length%2==1 && charArray[i] ==x1) {
					sum++;
					char g =charArray[i+1];
					charArray[i+1] = charArray[i];
					charArray[i] = g;
					b=true;
					i--;//重新匹配charArray[i]
				} else {
					break;
				}
			}
		}
		if (b) {
			System.out.println(sum);
		} else {
			System.out.println("Impossible");
		}
	}
}
