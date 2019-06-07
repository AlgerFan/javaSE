package org;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

import moto.Account;
import myio.MyIO;

public class AddDocument {
	public ArrayList<Account> accountlist = new ArrayList<Account>();
	public int count = 0;

	void addAccount() throws IOException { // 增加账目
		Scanner sc = new Scanner(System.in);
		System.out.println("请选择  1.支出、2.收入：");
		int ty = sc.nextInt();
		String type = null;
		if (ty == 1) {
			type = "支出";
		} else {
			type = "收入";
		}
		System.out.println("请输入账目原因(比如:日常三餐,网购)：");
		String reason = sc.next();
		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy");
		SimpleDateFormat sdf2 = new SimpleDateFormat("MM");
		SimpleDateFormat sdf3 = new SimpleDateFormat("dd"); // 分别自动获取日期，并格式化
		String year = sdf1.format(new Date());
		String month = sdf2.format(new Date());
		String day = sdf3.format(new Date());
		System.out.println("当前所存账目的日期为：" + year + "-" + month + "-" + day);
		System.out.println("请输入账目金额(必须为数字)：");
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
		Account account = new Account(type, reason, year, month, day, price);
		accountlist.add(account); // 利用add()增加账目
		count++;
		System.out.println("增加成功！");
		new MyIO().writerOne(accountlist);
	}
}
