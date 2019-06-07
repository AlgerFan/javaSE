package org;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

import moto.Account;
import myio.MyIO;
import user.User;
import user.UserInterface;
import user.UserIo;

public class MainDocument {
	public ArrayList<Account> accountlist = new ArrayList<Account>();
	public int count = 0;
	
	public MainDocument() throws IOException {
		Scanner scan = new Scanner(System.in);
		System.out.println("请选择...1、登录帐户/2、注册账户");
		int choose = scan.nextInt();
		if (choose == 1){
			logIn();
		} else if(choose == 2) {
			registered();
		} else{
			System.out.println("输入错误：");
		}
	}
	public void registered() throws IOException {	//注册帐号
		UserInterface ud = new UserIo();
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入要注册的用户名：（由字母或者数字组成，不能含有特殊符号）");
		String em = sc.nextLine();
		boolean flagOne = ud.isloginOne(em);
		if (flagOne == false) { //判断用户名是否重复
			boolean a = em.matches("[0-9a-zA-Z]+");
			if(a){
				System.out.println("请设置账户密码：（开头必须是字母，之后由字母或者数字组成，不能含有特殊符号，长度8到16）");
				String es = sc.nextLine();
				boolean b = es.matches("[a-zA-Z][0-9a-zA-Z]{7,15}");
				if(b){
					User user = new User(em,es);
					ud.register(user);
					System.out.println("注册成功");
					logIn();
				} else {
					System.out.println("密码格式不正确，请重新注册：");
					registered();
				}
			} else{
				System.out.println("用户名格式不正确，请重新输入：");
				registered();
			}
		} else {
			System.out.println("该用户名已存在，请重新输入：");
			registered();
		}
	}
	public void logIn() throws IOException {
		UserInterface ud = new UserIo();
		Scanner sc = new Scanner(System.in);
		System.out.println("请登录...");
		for (int i = 3; i >= 1; i--) {
			System.out.println("请输入用户名:");
			String name = sc.nextLine();
			System.out.println("请输入密码:");
			String psw = sc.nextLine();
			boolean flag = ud.islogin(name, psw);
			if (flag) {
				verificationCode();
			} else if (i != 1) {
				System.out.println("用户名和密码不匹配!");
				System.out.println("你还有" + (i - 1) + "次机会，请重新输入:");
			} else {
				System.out.println("您没有权限进入系统!");
			}
		}
	}
	
	public void verificationCode() throws IOException {
		for (int i = 3; i >= 1; i--) {
			Random random = new Random();
			int s = random.nextInt(1000) + 8999;
			System.out.println("验证码为：" + s);
			Scanner sc = new Scanner(System.in);
			System.out.println("请输入验证码：");
			int code = sc.nextInt();
			if (code == s) {
				System.out.println("               .........登录成功.........");
				System.out.println("                     *           *    ");
				System.out.println("                  *     *     *     * ");
				System.out.println("                  *        *        * ");
				System.out.println("                  *  欢迎回到阿杰记事本     * ");
				System.out.println("                     *           *    ");
				System.out.println("                        *     *       ");
				System.out.println("                           *          ");
				Features();
			} else if (i != 1) {
				System.out.println("验证码错误，你还有" + (i - 1) + "次机会：");
			} else {
				System.out.println("您没有权限进入系统!");
			}
		}
	}

	public void Features() throws IOException {
		Scanner scan = new Scanner(System.in);
		new MyIO().reader(accountlist);
		Menu();
		while (true) {
			// 读取用户输入
			int choice = scan.nextInt();
			if (choice == 7) {
				System.out.println("               ......成功退出阿杰记账本.....");
				System.out.println("                     *           *    ");
				System.out.println("                  *     *     *     * ");
				System.out.println("                  *        *        * ");
				System.out.println("                  *    欢迎下次光临           * ");
				System.out.println("                     *           *    ");
				System.out.println("                        *     *       ");
				System.out.println("                           *          ");
				System.exit(0);
			}
			switch (choice) {
			case 1:
				AddDocument ic1 = new AddDocument();
				ic1.addAccount();
				Menu();
				break;
			case 2:
				DeleteDocument ic2 = new DeleteDocument();
				ic2.deleteAccount();
				Menu();
				break;
			case 3:
				ChangeDocument ic3 = new ChangeDocument();
				ic3.changeAccount();
				Menu();
				break;
			case 4:
				FindDocument ic4 = new FindDocument();
				ic4.findAccount();
				Menu();
				break;
			case 5:
				AnalysisDocument ic5 = new AnalysisDocument();
				ic5.analysisAccount();
				Menu();
				break;
			case 6:
				printAllaccount();
				break;
			default:
				System.out.println("没有此选项！");
				Features();
				continue;// 这个continue 是continue的while
			}
		}
	}

	public void Menu() { // 打印菜单
		System.out.println("               ..........请选择.........");
		System.out.println("               1.........增加账目........");
		System.out.println("               2.........删除账目........");
		System.out.println("               3.........修改账目........");
		System.out.println("               4.........查询账目........");
		System.out.println("               5.........账目分析........");
		System.out.println("               6.........打印所有账目.....");
		System.out.println("               7.........退出系统........");
	}

	void printAllaccount() throws IOException { // 打印所有账目
		for (int i = 0; i < accountlist.size(); i++) {
			Account account = (Account) accountlist.get(i);
			System.out.println("第" + (i + 1) + "行     账目类型:" + account.getType() + "   账目原因:" + account.getReason()
					+ "   账目时间:" + account.getYear() + "-" + account.getMonth() + "-" + account.getDay() + "   账目金额:"
					+ account.getPrice() + "元");
		}
		Features();
	}

	public static void main(String[] args) throws IOException {
		new MainDocument();
	}
}