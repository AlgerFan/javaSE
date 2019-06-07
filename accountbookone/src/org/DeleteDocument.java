package org;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

import moto.Account;
import myio.MyIO;

public class DeleteDocument {
	public ArrayList<Account> accountlist = new ArrayList<Account>();
	int count = 0;

	void deleteAccount() throws IOException { // 删除账目
		MyIO rc = new MyIO();
		rc.reader(accountlist);
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("请输入按哪种方式删除账目：1、按照账目行号删除/2、将某一月份的账目删除/3、将具体一天的账目删除");
			System.out.println("                   4、按照账目原因删除/5、按照账目金额删除/6、返回功能菜单");
			int choose = sc.nextInt();
			if (choose == 1) { // 按照账目行号删除
				System.out.println("以下是所有账目");
				printAllaccount();
				System.out.println("请输入要删除第几行账目：");
				int ord = sc.nextInt();
				ord = orderFind(ord);
				if (ord > -1) {
					accountlist.remove(ord);
					count--;
					System.out.println("删除成功！");
					new MyIO().writer(accountlist);
					printAllaccount();
					break;
				} else
					System.out.println("没有此账目！");
			} else if (choose == 2) { // 按照账目月份删除
				System.out.println("请输入您要删除的账目年份：");
				String year = sc.next();
				System.out.println("请输入您要删除的账目月份：");
				String month = sc.next();
				int count = 0;
				Iterator<Account> it = accountlist.iterator(); // 迭代器,对集合ArrayList中的元素进行取出
				while (it.hasNext()) { // 调用方法hasNext()判断集合中是否有元素
					Account x = it.next();
					if (x.getYear().equals(year) && x.getMonth().equals(month)) {
						// 调用方法next()取出集合中的元素
						it.remove();
						count++;
					}
				}
				if (count == 0) {
					System.out.println("没有此账目");
				} else {
					System.out.println("删除成功！");
					new MyIO().writer(accountlist);
				}
			} else if (choose == 3) { // 按照账目具体一天删除
				System.out.println("请输入您要删除的账目年份：");
				String year = sc.next();
				System.out.println("请输入您要删除的账目月份：");
				String month = sc.next();
				System.out.println("请输入您要删除的账目日期号：");
				String day = sc.next();
				int count = 0;
				Iterator<Account> it = accountlist.iterator(); // 迭代器,对集合ArrayList中的元素进行取出
				while (it.hasNext()) { // 调用方法hasNext()判断集合中是否有元素
					Account x = it.next();
					if (x.getYear().equals(year) && x.getMonth().equals(month) && x.getDay().equals(day)) {
						// 调用方法next()取出集合中的元素
						it.remove();
						count++;
					}
				}
				if (count == 0) {
					System.out.println("没有此账目");
				} else {
					System.out.println("删除成功！");
					MyIO ic = new MyIO();
					ic.writer(accountlist);
				}
			} else if (choose == 4) { // 按照账目原因删除
				System.out.println("请输入您要删除的账目的账目原因：");
				String reason = sc.next();
				int count = 0;
				Iterator<Account> it = accountlist.iterator(); // 迭代器,对集合ArrayList中的元素进行取出
				while (it.hasNext()) { // 调用方法hasNext()判断集合中是否有元素
					Account x = it.next();
					if (x.getReason().equals(reason)) { // 调用方法next()取出集合中的元素
						it.remove();
						count++;
					}
				}
				if (count == 0) {
					System.out.println("没有此账目");
				} else {
					System.out.println("删除成功！");
					new MyIO().writer(accountlist);
				}
			} else if (choose == 5) { // 按照账目金额删除
				System.out.println("请输入您要删除的账目的账目金额：");
				float price = sc.nextFloat();
				int count = 0;
				Iterator<Account> it = accountlist.iterator();
				while (it.hasNext()) {
					Account x = it.next();
					if (x.getPrice() == price) {
						it.remove();
						count++;
					}
				}
				if (count == 0) {
					System.out.println("未查找到您的账目");
				} else {
					System.out.println("删除成功！");
					new MyIO().writer(accountlist);
				}
			} else if (choose == 6) {
				break; // 跳出当前循环，返回上一级循环，即主菜单。
			} else
				System.out.println("输入错误，没有此选项！");
		}
	}

	void printAllaccount() { // 打印所有账目
		for (int i = 0; i < accountlist.size(); i++) {
			Account account = (Account) accountlist.get(i);
			System.out.println("第" + (i + 1) + "行     账目类型:" + account.getType() + "   账目原因:" + account.getReason()
					+ "   账目时间:" + account.getYear() + "-" + account.getMonth() + "-" + account.getDay() + "   账目金额:"
					+ account.getPrice() + "元");
		}
	}

	int orderFind(int number) { // 按行号查找修改，返回ord
		if (number <= accountlist.size()) {
			int ord = number - 1;
			return ord;
		} else
			return -1;
	}

}
