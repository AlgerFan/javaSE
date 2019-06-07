package org;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

import moto.Account;
import myio.MyIO;

public class FindDocument {
	public ArrayList<Account> accountlist = new ArrayList<Account>();

	void findAccount() throws IOException { // 查询账目
		MyIO rc = new MyIO();
		rc.reader(accountlist);
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("请输入按哪种方法查找账目：1.按账目原因查询/2.按账目金额查询");
			System.out.println("		   3.查询某一年的账目/4.查询某一月的账目/5.查询某一天的账目6.返回功能菜单");
			int choose = sc.nextInt();
			if (choose == 1) { // 按账目原因查询
				System.out.println("请输入您要删除的账目的账目原因：");
				String reason = sc.next();
				int count = 0;
				Iterator<Account> it = accountlist.iterator(); // 迭代器,对集合ArrayList中的元素进行取出
				while (it.hasNext()) { // 调用方法hasNext()判断集合中是否有元素
					Account x = it.next();
					if (x.getReason().equals(reason)) { // 调用方法next()取出集合中的元素
						System.out.println(x);
						count++;
					}
				}
				if (count == 0) {
					System.out.println("没有此账目");
				}
			} else if (choose == 2) { // 按账目金额查询
				System.out.println("请输入您要查询的账目的账目金额：");
				float price = sc.nextFloat();
				int count = 0;
				Iterator<Account> it = accountlist.iterator(); // 迭代器,对集合ArrayList中的元素进行取出
				while (it.hasNext()) { // 调用方法hasNext()判断集合中是否有元素
					Account x = it.next();
					if (x.getPrice() == price) { // 调用方法next()取出集合中的元素
						System.out.println(x);
						count++;
					}
				}
				if (count == 0) {
					System.out.println("没有此账目");
				}
			} else if (choose == 3) { // 查询某一年的账目
				System.out.println("请输入您要查询的账目年份：");
				String year = sc.next();
				int count = 0;
				Iterator<Account> it = accountlist.iterator(); // 迭代器,对集合ArrayList中的元素进行取出
				while (it.hasNext()) { // 调用方法hasNext()判断集合中是否有元素
					Account x = it.next();
					if (x.getYear().equals(year)) { // 调用方法next()取出集合中的元素
						System.out.println(x);
						count++;
					}
				}
				if (count == 0) {
					System.out.println("没有此账目");
				}
			} else if (choose == 4) { // 查询某一月的账目
				System.out.println("请输入您要查询的账目年份：");
				String year = sc.next();
				System.out.println("请输入您要查询的账目月份：");
				String month = sc.next();
				int count = 0;
				Iterator<Account> it = accountlist.iterator(); // 迭代器,对集合ArrayList中的元素进行取出
				while (it.hasNext()) { // 调用方法hasNext()判断集合中是否有元素
					Account x = it.next();
					if (x.getYear().equals(year) && x.getMonth().equals(month)) { // 调用方法next()取出集合中的元素
						System.out.println(x);
						count++;
					}
				}
				if (count == 0) {
					System.out.println("没有此账目");
				}
			} else if (choose == 5) { // 查询某一天的账目
				System.out.println("请输入您要查询的账目年份：");
				String year = sc.next();
				System.out.println("请输入您要查询的账目月份：");
				String month = sc.next();
				System.out.println("请输入您要查询的账目日期号：");
				String day = sc.next();
				int count = 0;
				Iterator<Account> it = accountlist.iterator(); // 迭代器,对集合ArrayList中的元素进行取出
				while (it.hasNext()) { // 调用方法hasNext()判断集合中是否有元素
					Account x = it.next();
					if (x.getYear().equals(year) && x.getMonth().equals(month) && x.getDay().equals(day)) {
						// 调用方法next()取出集合中的元素
						System.out.println(x);
						count++;
					}
				}
				if (count == 0) {
					System.out.println("没有此账目");
				}
			} else if (choose == 6) {
				break;
			} else
				System.out.println("输入错误，没有此选项！");
		}
	}
}
