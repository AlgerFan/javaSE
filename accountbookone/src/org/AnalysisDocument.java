package org;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

import moto.Account;
import myio.MyIO;

public class AnalysisDocument {
	public ArrayList<Account> accountlist = new ArrayList<Account>();

	void analysisAccount() throws IOException { // 分析账目
		MyIO rc = new MyIO();
		rc.reader(accountlist);
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("请选择账目分析选项：1、总支出金额和总收入金额对比/2、某一月支出金额和收入金额对比");
			System.out.println("	       3、支出排行榜/4、收入排行榜/5、返回功能菜单");
			int choose = sc.nextInt();
			int sum1 = 0;
			int sum2 = 0;
			if (choose == 1) { //总支出金额和总收入金额对比
				Iterator<Account> it1 = accountlist.iterator(); // 迭代器,对集合ArrayList中的元素进行取出
				while (it1.hasNext()) { // 调用方法hasNext()判断集合中是否有元素
					Account x = it1.next();
					if (x.getType().equals("支出")) {
						// 调用方法next()取出集合中的元素
						sum1 += x.getPrice();
					}
				}
				Iterator<Account> it2 = accountlist.iterator(); // 迭代器,对集合ArrayList中的元素进行取出
				while (it2.hasNext()) { // 调用方法hasNext()判断集合中是否有元素
					Account x = it2.next();
					if (x.getType().equals("收入")) {
						// 调用方法next()取出集合中的元素
						sum2 += x.getPrice();
					}
				}
				System.out.println("总账目支出为：" + sum1 + "  总账目收入为：" + sum2);
			} else if (choose == 2) { //某一月支出金额和收入金额对比
				System.out.println("请输入您要查询的账目年份：");
				String year = sc.next();
				System.out.println("请输入您要查询的账目月份：");
				String month = sc.next();
				Iterator<Account> it1 = accountlist.iterator(); // 迭代器,对集合ArrayList中的元素进行取出
				while (it1.hasNext()) { // 调用方法hasNext()判断集合中是否有元素
					Account x = it1.next();
					if (x.getType().equals("支出") && x.getYear().equals(year) && x.getMonth().equals(month)) {
						// 调用方法next()取出集合中的元素
						sum1 += x.getPrice();
					}
				}
				Iterator<Account> it2 = accountlist.iterator(); // 迭代器,对集合ArrayList中的元素进行取出
				while (it2.hasNext()) { // 调用方法hasNext()判断集合中是否有元素
					Account x = it2.next();
					if (x.getType().equals("收入") && x.getYear().equals(year) && x.getMonth().equals(month)) {
						// 调用方法next()取出集合中的元素
						sum2 += x.getPrice();
					}
				}
				System.out.println("该月的账目支出为：" + sum1 + "元   该月的账目收入为：" + sum2 + "元");
			} else if (choose == 3) { //支出排行榜
				Collections.sort(accountlist);
				for (Account s : accountlist) {
					if (s.getType().equals("支出")) {
						System.out.println(s);
					}
				}
			} else if (choose == 4) {  //收入排行榜
				Collections.sort(accountlist);
				for (Account s : accountlist) {
					if (s.getType().equals("收入")) {
						System.out.println(s);
					}
				}
			} else if (choose == 5) {
				break;
			} else
				System.out.println("输入错误，没有此选项！");
		}
	}
}
