package org.wlgzs.test;

/*
 问题描述
　　话说这个世界上有各种各样的兔子和乌龟，但是研究发现，所有的兔子和乌龟都有一个共同的特点——喜欢赛跑。于是世界上各个角落都不断在发生着乌龟和兔子的比赛，
小华对此很感兴趣，于是决定研究不同兔子和乌龟的赛跑。他发现，兔子虽然跑比乌龟快，但它们有众所周知的毛病——骄傲且懒惰，于是在与乌龟的比赛中，一旦任一秒结
束后兔子发现自己领先t米或以上，它们就会停下来休息s秒。对于不同的兔子，t，s的数值是不同的，但是所有的乌龟却是一致——它们不到终点决不停止。
　　然而有些比赛相当漫长，全程观看会耗费大量时间，而小华发现只要在每场比赛开始后记录下兔子和乌龟的数据——兔子的速度v1（表示每秒兔子能跑v1米），乌龟的
速度v2，以及兔子对应的t，s值，以及赛道的长度l——就能预测出比赛的结果。但是小华很懒，不想通过手工计算推测出比赛的结果，于是他找到了你——清华大学计算机系
的高才生——请求帮助，请你写一个程序，对于输入的一场比赛的数据v1，v2，t，s，l，预测该场比赛的结果。
输入格式
　　输入只有一行，包含用空格隔开的五个正整数v1，v2，t，s，l，其中(v1,v2<=100;t<=300;s<=10;l<=10000且为v1,v2的公倍数)
输出格式
　　输出包含两行，第一行输出比赛结果——一个大写字母“T”或“R”或“D”，分别表示乌龟获胜，兔子获胜，或者两者同时到达终点。
　　第二行输出一个正整数，表示获胜者（或者双方同时）到达终点所耗费的时间（秒数）。
样例输入
10 5 5 2 20
样例输出
D
4
样例输入
10 5 5 1 20
样例输出
R
3
样例输入
10 5 5 3 20
样例输出
T
4
 */

import java.util.Scanner;

public class test7 {
	private static int v1;
	private static int v2;
	private static int t;
	private static int s;
	private static int l;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		v1 = sc.nextInt();
		v2 = sc.nextInt();
		t = sc.nextInt();
		s = sc.nextInt();
		l = sc.nextInt();
		sc.close();
		
		run(0, 0, 0, 0);
	}
	
	//times 经过的秒数  rl 兔子经过的距离   tl 乌龟经过的距离  sLeft 兔子休息剩余时间 
	public static void run(int times,int rl,int tl,int sLeft) {
		if (sLeft == 0) {
			if (rl - tl >= t) {
				sLeft = s-1;
			} else {
				rl += v1;
			}
		} else {
			sLeft--;
		}
		
		tl += v2;
		times++;
		
		if (rl == l && tl == l) {
			System.out.println("D");
			System.out.println(times);
			return;
		}
		if (rl == l && tl != l) {
			System.out.println("R");
			System.out.println(times);
			return;
		}
		if (tl == l && rl != l) {
			System.out.println("T");
			System.out.println(times);
			return;
		}
		run(times, rl, tl, sLeft);
	}
	
}
