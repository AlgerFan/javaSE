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

public class test51 {
	private static int n;
	private static int m;
	private static int[][] a;

	public static void main(String args[]) {
		int count;
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		m = sc.nextInt();
		count = n * m;
		a = new int[n][m];
		for (int i = 0; i < n; i++)
			for (int j = 0; j < m; j++)
				a[i][j] = sc.nextInt();
		sc.close();
		
		// **********以上是数的输入**********
		int t = 0;// t用于记录圈数
		int i = 0;// 数的横坐标
		int j = 0;// 数的纵坐标
		while (count > 0) {
			// 省略if(i==t&&j==t&&count>0)，判断坐标是否在左上角的节点，因为条件必然成立
			while (i < n - t && count > 0) {// 从左上角向下走
				if (i == 0 && j == 0) {// 第一个数的输出格式
					System.out.print(a[0][0] + " ");
					i++;
				} else
					System.out.print(a[i++][j] + " ");
				count--;
			}
			i--;
			j++;
			// 省略if(i==n-1-t&&j==t)，左下角的节点的判断
			while (j < m - t && count > 0) {// 向右走
				System.out.print(a[i][j++] + " ");
				count--;
			}
			j--;
			i--;
			// 省略if(i==n-1-t&&j==m-1-t&&count>0)，右下角节点的判断
			while (i >= t && count > 0) { // 向上走
				System.out.print(a[i--][j] + " ");
				count--;
			}
			i++;
			j--;
			// 省略if(i==t&&j==m-1-t)，右上角节点的判断
			while (j > t && count > 0) {// 向左走
				System.out.print(a[i][j--] + " ");
				count--;
			}
			j++;
			i++;
			t++;// 圈数加一
		}
		return;
	}
}
/*
 * Scanner cn=new Scanner(System.in);
 * 
 * int q=cn.nextInt(); int w=cn.nextInt(); k=new int[q+1][w+1]; for(int
 * i=1;i<=q;i++) for(int j=1;j<=w;j++) k[i][j]=cn.nextInt();
 * 
 * String str=""; int a=1,i=0,x=1,y=1; while(true) { if(i==q*w)break;
 * str=str+k[x][y]+" "; i++;x++;
 * 
 * while(x<=q-a) { str=str+k[x][y]+" "; i++;x++; } if(i==q*w)break;
 * str=str+k[x][y]+" "; y++;i++;
 * 
 * while(y<=w-a) { str=str+k[x][y]+" "; i++;y++; } if(i==q*w)break;
 * str=str+k[x][y]+" "; i++;x--; while(x>a) { str=str+k[x][y]+" "; i++;x--; }
 * if(i==q*w)break; str=str+k[x][y]+" "; i++;y--; while(y>a+1) {
 * str=str+k[x][y]+" "; i++;y--; } a++; }
 * 
 * for(int c=0;c<str.length()-1;c++) System.out.print(str.charAt(c));
 */
