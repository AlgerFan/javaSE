package org.wlgzs;

// 输出一个数列：1 1 2 3 5 8 13 21....(从第3个数字开始，每个数等于前两个数之和)
public class test04{
	public static void main(String[] args) {
		for (int i = 1; i <= 10; i++) {
			System.out.print(getFbi(i) + " ");
		}
	}

	private static int getFbi(int n) {
		if (n == 1) {
			return 1;
		} else if (n == 2) {
			return 2;
		} else {
			return getFbi(n - 2) + getFbi(n - 1);
		}
	}
}
