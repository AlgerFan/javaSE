package org.wlgzs;

import java.util.Scanner;

public class test03 {
	public static void main(String[] args) {
		String str = "";
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入一个数");
		str = sc.nextLine();
		per(str.toCharArray(), 0);
	}
	public static void per(char[] str, int i) {
		if (i >= str.length)
			return;
		if (i == str.length - 1) {
			System.out.println(String.valueOf(str));
		} else {
			for (int j = i; j < str.length; j++) {
				char temp = str[j];
				str[j] = str[i];
				str[i] = temp;
				
				per(str, i + 1);
				
				temp = str[j];
				str[j] = str[i];
				str[i] = temp;
			}
		}
	}
}
