package org.wlgzs.test;

/*
 问题描述
　　回形取数就是沿矩阵的边取数，若当前方向上无数可取或已经取过，则左转90度。一开始位于矩阵左上角，方向向下。
输入格式
　　输入第一行是两个不超过200的正整数m, n，表示矩阵的行和列。接下来m行每行n个整数，表示这个矩阵。
输出格式
　　输出只有一行，共mn个数，为输入矩阵回形取数得到的结果。数之间用一个空格分隔，行末不要有多余的空格。
样例输入
3 3
1 2 3
4 5 6
7 8 9
样例输出
1 4 7 8 9 6 3 2 5
样例输入
3 2
1 2
3 4
5 6
样例输出
1 3 5 6 4 2
 */

import java.util.Scanner;

public class test5 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int m = scanner.nextInt(), n = scanner.nextInt();
		int arr[][] = new int[m][n];
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				arr[i][j] = scanner.nextInt();
			}
		}
		int i = 0, j = 0;
		for (i = 0; i < (n + 1) / 2 && i < (m + 1) / 2; i++) {
			for (j = i; j < m - i; j++)
				System.out.print(arr[j][i] + " ");
			for (j = i + 1; j < n - i; j++)
				System.out.print(arr[m - i - 1][j] + " ");
			if (n - i - 1 > i)
				for (j = m - i - 2; j >= i; j--)
					System.out.print(arr[j][n - i - 1] + " ");
			if (m - i - 1 > i)
				for (j = n - i - 2; j > i; j--)
					System.out.print(arr[i][j] + " ");
		}
		scanner.close();
	}
}
