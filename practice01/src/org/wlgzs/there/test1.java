package org.wlgzs.there;

//求一个字符串的反串

public class test1 {
	public static void main(String[] args) {
		System.out.println(f("abcd"));
	}
	public static String f(String s) {
		if (s.length()<=1) {
			return s;
		}
		return f(s.substring(1)) + s.charAt(0);
	}
}
