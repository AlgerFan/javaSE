package org;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import moto.Account;
import myio.MyIO;

public class ChangeDocument {
	public ArrayList<Account> accountlist = new ArrayList<Account>();
	int count = 0;

	void changeAccount() throws IOException { // 修改账目
		MyIO rc = new MyIO();
		rc.reader(accountlist);
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("请输入按哪种方式修改账目：1、行号(若按行号修改账目，将打印出所有账目) 2、账目原因  3、返回功能菜单");
			int choose = sc.nextInt();
			if (choose == 1) { // 按行号修改账目
				System.out.println("以下是所有账目");
				printAllaccount();
				System.out.println("请输入要修改第几行账目：");
				int number = sc.nextInt();
				int ord = orderFind(number);
				if (ord > -1) {
					Account account = (Account) accountlist.get(ord);
					System.out.println("原账目类型为：" + account.getType() + "  请选择新的账目类型--> 1.支出、2.收入：");
					int ty = sc.nextInt();
					String type = null;
					if (ty == 1) {
						type = "支出";
					} else {
						type = "收入";
					}
					System.out.println("原账目原因为：" + account.getReason() + "  请输入新的账目原因(比如:日常三餐)：");
					String reason = sc.next();
					System.out.println("原账目时间的年份为：" + account.getYear() + "  请输入新的账目时间的年份(比如:2017-11-3)：");
					String year = sc.next();
					System.out.println("原账目时间的月份为：" + account.getMonth() + "  请输入新的账目时间的月份(比如:2017-11-3)：");
					String month = sc.next();
					System.out.println("原账目的日期号：" + account.getDay() + "  请输入新的账目的日期号(比如:2017-11-3)：");
					String day = sc.next();
					System.out.println("原账目的金额为：" + account.getPrice() + "  请输入新的账目金额(必须为数字)：");
					boolean ad = true;
					Float price = null;
					while (ad) { // 用布尔类型满足条件时结束循环
						try {
							price = sc.nextFloat();
							if (price >= 0)
								ad = false;
						} catch (Exception e) {
							System.out.println("输入格式错误，请重新输入：");
							sc.nextLine();
						}
					}
					account = new Account(type, reason, year, month, day, price);
					accountlist.set(ord, account);
					System.out.println("修改成功！");
					new MyIO().writer(accountlist);
				} else {
					System.out.println("没有此账目!!!");
				}
			} else if (choose == 2) { // 按账目原因修改账目
				System.out.println("请输入您要修改的账目的账目原因：");
				String use = sc.next();
				int ord = reasonFind(use);
				if (ord > -1) {
					Account account = (Account) accountlist.get(ord);
					System.out.println("原账目类型为：" + account.getType() + "  请选择新的账目类型--> 1.支出、2.收入：");
					int ty = sc.nextInt();
					String type = null;
					if (ty == 1) {
						type = "支出";
					} else {
						type = "收入";
					}
					System.out.println("原账目原因为：" + account.getReason() + "  请输入新的账目原因(比如:日常三餐)：");
					String reason = sc.next();
					System.out.println("原账目时间的年份为：" + account.getYear() + "  请输入新的账目时间的年份(比如:2017-11-3)：");
					String year = sc.next();
					System.out.println("原账目时间的月份为：" + account.getMonth() + "  请输入新的账目时间的月份(比如:2017-11-3)：");
					String month = sc.next();
					System.out.println("原账目的日期号为：" + account.getDay() + "  请输入新的账目的日期号(比如:2017-11-3)：");
					String day = sc.next();
					System.out.println("原账目的金额为：" + account.getPrice() + "  请输入新的账目金额(必须为数字)：");
					boolean ad = true;
					Float price = null;
					while (ad) { // 用布尔类型满足条件时结束循环
						try {
							price = sc.nextFloat();
							if (price >= 0)
								ad = false;
						} catch (Exception e) {
							System.out.println("输入格式错误，请重新输入：");
							sc.nextLine();
						}
					}
					account = new Account(type, reason, year, month, day, price);
					accountlist.set(ord, account);
					System.out.println("修改成功！");
					new MyIO().writer(accountlist);
				} else {
					System.out.println("没有此账目!!!");
				}

			} else if (choose == 3) {
				break;
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

	int reasonFind(String reason) { // 按账目原因查找修改，返回ord
		int ord = -1;
		for (int i = 0; i < accountlist.size(); i++) {
			Account account = (Account) accountlist.get(i);
			if (account.getReason().equals(reason)) {
				ord = i;
				break;
			} else if (i < accountlist.size())
				continue;
			else {
				System.out.println("未查找到您的账目");
				break;
			}
		}
		return ord;
	}

}
