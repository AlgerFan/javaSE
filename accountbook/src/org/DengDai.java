package org;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import moto.Account;
import myio.MyIO;

public class DengDai {
	// public static final int SIZE = 100;
	// Account[] accountlist = new Account[SIZE];
	public ArrayList<Account> accountlist = new ArrayList<Account>();
	public int count = 0;
	String username = "fan";
	BufferedReader pas = new BufferedReader(new FileReader("modify.txt"));
	String password = pas.readLine();

	public DengDai() throws IOException {
		for (int i = 3; i >= 1; i--) {
			@SuppressWarnings("resource")
			Scanner sc = new Scanner(System.in);
			System.out.println("登录...");
			System.out.println("请输入用户名:");
			String name = sc.nextLine();
			System.out.println("请输入密码:");
			String psw = sc.nextLine();
			if (name != null && psw != null && name.equals(username) && psw.equals(password)) {
				System.out.println("登录成功");
				System.out.println("     *           *    ");
				System.out.println("  *     *     *     * ");
				System.out.println("  *        *        * ");
				System.out.println("  *  欢迎回到阿杰记事本     * ");
				System.out.println("     *           *    ");
				System.out.println("        *     *       ");
				System.out.println("           *          ");
				Features();
			} else if (i != 1) {
				System.out.println("用户名和密码不匹配!");
				System.out.println("你还有" + (i - 1) + "次机会，请重新输入:");
			} else {
				System.out.println("您没有权限进入系统!");
			}
		}
	}

	void Features() throws IOException {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		MyIO io = new MyIO();
		io.load(this);
		printMenu();
		while (true) {
			// 读取用户输入
			int choice = scan.nextInt();
			if (choice == 6) {
				io.save(this);
				System.out.println("成功退出阿杰记账本");
				System.out.println("     *           *    ");
				System.out.println("  *     *     *     * ");
				System.out.println("  *        *        * ");
				System.out.println("  *    欢迎下次光临           * ");
				System.out.println("     *           *    ");
				System.out.println("        *     *       ");
				System.out.println("           *          ");
				System.exit(0);
			}
			switch (choice) {
			case 1:
				addAccount();
				break;
			case 2:
				deleteAccount();
				break;
			case 3:
				changeAccount();
				break;
			case 4:
				findAccount();
				break;
			case 5:
				modify();
				break;
			default:
				System.out.println("输入非法");
				printMenu();
				continue;// 这个continue 是continue的while
			}
		}
	}

	public void printMenu() { // 打印菜单
		System.out.println("请选择...");
		System.out.println("1...增加账目");
		System.out.println("2...删除账目");
		System.out.println("3...修改账目");
		System.out.println("4...查询账目");
		System.out.println("5...修改密码");
		System.out.println("6...退出系统");
	}

	void modify() throws IOException {
		MyIO io = new MyIO();
		io.modifyio();
	}

	void addAccount() { // 增加账目
		MyIO io = new MyIO();
		if (count > accountlist.size() - 1) {
			@SuppressWarnings("resource")
			Scanner sc = new Scanner(System.in);
			System.out.println("请输入账目类型(必须是“支出”或“收入”)：");
			String type = sc.next();
			if (type.equals("支出") || type.equals("收入")) {
				System.out.println("请输入账目原因(比如:日常三餐)：");
				String reason = sc.next();
				System.out.println("请输入账目时间(比如:2017/11/3)：");
				String time = sc.next();
				System.out.println("请输入账目金额(必须为数字)：");
				String ac = sc.next();
				if (ac != null && ac.matches("^[0-9]+$")) {
					float price = Float.parseFloat(ac);
					Account account = new Account(type, reason, time, price);
					// accountlist[count] = account;
					accountlist.add(account); // 利用add()增加账目
					count++;
					System.out.println("增加成功！");
					io.save(this);
					printAllaccount1();
					printMenu();
				} else {
					System.out.println("输入格式不正确,请重新输入");
					addAccount();
				}
			} else {
				System.out.println("输入格式不正确,请重新输入");
				addAccount();
			}
		} else {
			System.out.println("账目库已满！");
		}
	}

	void deleteAccount() { // 删除账目
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		MyIO io = new MyIO();
		while (true) {
			System.out.println("请输入按哪种方法删除账目：1、行号(若按行号修改账目，将打印出所有账目)/2、账目原因/3、返回主菜单");
			int choose = sc.nextInt();
			if (choose == 1) {
				System.out.println("以下是所有账目");
				printAllaccount1();
				System.out.println("请输入要删除第几行账目：");
				int ord = sc.nextInt();
				ord = orderFind(ord); // System.out.println(ord);
				if (ord > -1) {
					/*
					 * for(int i=ord; i<count-1; i++)//用for循环的形式实现对数组的删除
					 * accountlist[i]=accountlist[i+1];
					 */
					accountlist.remove(ord); // 利用remove实现对集合的删除
					count--;
					System.out.println("删除成功！");
					io.save(this);
					printAllaccount1();
				} else
					System.out.println("输入错误！");
			} else if (choose == 2) {
				System.out.println("请输入您要删除的账目的账目原因：");
				String reason = sc.next();
				int ord = reasonFind(reason);
				if (ord > -1) {
					/*
					 * for(int j = ord; j<count-1; j++) { //用for循环的形式实现对数组的删除
					 * accountlist[j]=accountlist[j+1]; }
					 */
					accountlist.remove(ord);
					count--;
					System.out.println("删除成功！");
					io.save(this);
					printAllaccount1();
				} else
					System.out.println("没有此账目");
			} else if (choose == 3) {
				printMenu();
				break; // 跳出当前循环，返回上一级循环，即主菜单。
			} else
				System.out.println("输入错误！");
		}
	}

	void changeAccount() { // 修改账目
		Scanner sc = new Scanner(System.in);
		MyIO io = new MyIO();
		while (true) {
			System.out.println("请输入按哪种方法修改账目：1、行号(若按行号修改账目，将打印出所有账目)/2、账目原因和账目时间/3、返回主菜单");
			int choose = sc.nextInt();
			if (choose == 1) {
				System.out.println("以下是所有账目");
				printAllaccount1();
				System.out.println("请输入要修改第几行账目：");
				int number = sc.nextInt();
				int ord = orderFind(number);
				if (ord > -1) {
					Account account = (Account) accountlist.get(ord);
					System.out.println("原账目类型为：" + account.getType() + "  请输入账目类型(必须是“支出”或“收入”)：");
					String type = sc.next();
					if (type.equals("支出") || type.equals("收入")) {
						System.out.println("原账目原因为：" + account.getReason() + "  请输入新的账目原因(比如:日常三餐)：");
						String reason = sc.next();
						System.out.println("原账目时间为：" + account.getTime() + "  请输入新的账目时间(比如:2017/11/3)：");
						String time = sc.next();
						System.out.println("原账目的金额为：" + account.getPrice() + "  请输入新的账目金额(必须为数字)：");
						String ac = sc.next();
						if (ac != null && ac.matches("^[0-9]+$")) {
							float price = Float.parseFloat(ac);
							// accountlist[ord].setAccount(type,reason,time,price);
							account.setAccount(type, reason, time, price);
							System.out.println("修改成功！");
							io.save(this);
							printAllaccount1();
						} else {
							System.out.println("输入格式不正确,请重新输入");
							changeAccount();
						}
					} else {
						System.out.println("输入格式不正确,请重新输入");
						changeAccount();
					}
				} else
					System.out.println("输入错误！");
			} else if (choose == 2) {
				System.out.println("请输入您要修改的账目的账目原因：");
				String use = sc.next();
				int ord = reasonFind(use);
				System.out.println("请输入您要修改的账目的账目时间：");
				String day = sc.next();
				int orf = timeFind(day);
				if (ord > -1 && orf > -1) {
					Account account = (Account) accountlist.get(ord);
					System.out.println("原账目类型为：" + account.getType() + "  请输入账目类型(必须是“支出”或“收入”)：");
					String type = sc.next();
					if (type.equals("支出") || type.equals("收入")) {
						System.out.println("原账目原因为：" + account.getReason() + "  请输入新的账目原因(比如:日常三餐)：");
						String reason = sc.next();
						System.out.println("原账目时间为：" + account.getTime() + "  请输入新的账目时间(比如:2017/11/3)：");
						String time = sc.next();
						System.out.println("原账目的金额为：" + account.getPrice() + "  请输入新的账目金额(必须为数字)：");
						String ac = sc.next();
						if (ac != null && ac.matches("^[0-9]+$")) {
							float price = Float.parseFloat(ac);
							// accountlist[ord].setAccount(type,reason,time,price);
							account = new Account(type, reason, time, price);
							accountlist.set(orf, account);
//							account.setAccount(type, reason, time, price);
							System.out.println("修改成功！");
							io.save(this);
							printAllaccount1();
						} else {
							System.out.println("输入格式不正确,请重新输入");
							changeAccount();
						}
					} else {
						System.out.println("输入格式不正确,请重新输入");
						changeAccount();
					}
				}
			} else if (choose == 3) {
				printMenu();
				break;
			} else
				System.out.println("输入错误！");
		}
	}

	void findAccount() { // 查询账目
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("请输入按哪种方法查找账目：1、行号(若按行号修改账目，将打印出所有账目的简要信息)/2、账目原因和账目时间/3、返回主菜单");
			int choose = sc.nextInt();
			if (choose == 1) {
				System.out.println("以下是所有账目");
				printAllaccount2();
				System.out.println("请输入要查找第几条账目：");
				int ord = sc.nextInt();
				ord = orderFind(ord);
				if (ord > -1) {
					Account account = (Account) accountlist.get(ord);
					// System.out.println("你要查找的账目为"+(ord+1)+"行
					// 账目金额:"+accountlist[ord].getPrice()+"元
					// 账目类型:"+accountlist[ord].getType()+"
					// 账目原因:"+accountlist[ord].getReason()+"
					// 账目时间:"+accountlist[ord].getTime()+"");
					System.out.println("你要查找的账目为" + (ord + 1) + "行      账目类型:" + account.getType() + "   账目原因:"
							+ account.getReason() + "  账目时间:" + account.getTime() + "   账目金额:" + account.getPrice()
							+ "元");
				} else
					System.out.println("未查找到您的账目！");
			} else if (choose == 2) {
				System.out.println("请输入您要查询账目的账目原因：");
				String use = sc.next();
				int ord = reasonFind(use);
				System.out.println("请输入您要查询账目的账目时间：");
				String day = sc.next();
				int orf = timeFind(day);
				if (ord > -1 && orf > -1) {
					Account account = (Account) accountlist.get(ord);
					System.out.println("你要查找的账目为" + (ord + 1) + "行      账目类型:" + account.getType() + "   账目原因:"
							+ account.getReason() + "  账目时间:" + account.getTime() + "   账目金额:" + account.getPrice()
							+ "元");
				} else
					System.out.println("未查找到您的账目！");
			} else if (choose == 3) {
				printMenu();
				break;
			} else
				System.out.println("输入错误！");
		}
	}

	void printAllaccount1() {
		for (int i = 0; i < count; i++) {
			Account account = (Account) accountlist.get(i);
			System.out.println("第" + (i + 1) + "行     账目类型:" + account.getType() + "   账目原因:" + account.getReason()
					+ "   账目时间:" + account.getTime() + "   账目金额:" + account.getPrice() + "元");
		}
	}

	void printAllaccount2() {
		for (int i = 0; i < count; i++) {
			Account account = (Account) accountlist.get(i);
			System.out.println(
					"第" + (i + 1) + "行     账目类型:" + account.getType() + "   账目原因:" + account.getReason() + " ");
		}
	}

	int orderFind(int number) { // 按行号查找，返回ord
		if (number <= count) {
			int ord = number - 1;
			return ord;
		} else
			return -1;
	}

	int reasonFind(String reason) { // 按账目原因查找，返回ord
		int ord = -1;
		for (int i = 0; i < count; i++) {
			Account account = (Account) accountlist.get(i);
			// if(accountlist[i].getReason().equals(reason))
			if (account.getReason().equals(reason)) {
				ord = i;
				break;
			} else if (i < count)
				continue;
			else {
				System.out.println("未查找到您的账目");
				break;
			}
		}
		return ord;
	}

	int timeFind(String time) { // 按账目时间查找，返回orf
		int orf = -1;
		for (int i = 0; i < count; i++) {
			Account account = (Account) accountlist.get(i);
			// if(accountlist[i].getTime().equals(time)) {
			if (account.getTime().equals(time)) {
				orf = i;
				break;
			} else if (i < count)
				continue;
			else {
				System.out.println("未查找到您的账目");
				break;
			}
		}
		return orf;
	}

	public static void main(String[] args) throws IOException {
		new DengDai();
	}
}