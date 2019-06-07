package org.wlgzs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Asist {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("请输入字符串长度后回车  再输入字符串");
		int len = Integer.parseInt(reader.readLine());
		char[] s = reader.readLine().toCharArray();
		reader.close();
		if (palindrome(s, 0, len - 1)) {
			System.out.println(cnt);
		} else {
			System.out.println("Impossible");
		}
	}

	private static int cnt = 0;
	private static boolean haveMiddle = false;

	private static boolean palindrome(char[] s, int a, int b) {
		if (b <= a) {
			return true;
		}
		// 从最后的位置开始遍历字符串
		for (int i = b; i > a; i--) {
			if (s[a] == s[i]) {
				exchangeTo(s, i, b);
				cnt += getExchangeTimes(i, b);
				return palindrome(s, a + 1, b - 1);
			}
		}
		// 如果没有出现过中间字符
		if (!haveMiddle) {
			haveMiddle = true;
			cnt += getExchangeTimes(a, s.length / 2);
			return palindrome(s, a + 1, b);
		}
		return false;
	}

	private static int getExchangeTimes(int a, int b) {
		return b - a;
	}

	private static void exchangeTo(char[] s, int a, int b) {
		char temp = s[a];
		for (int i = a; i < b; i++) {
			s[i] = s[i + 1];
		}
		s[b] = temp;
	}
}