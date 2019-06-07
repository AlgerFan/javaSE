package myio;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import moto.Account;

public class MyIO {
	int count = 0;

	public void reader(ArrayList<Account> accountlist)
			throws NumberFormatException, FileNotFoundException, IOException { // 读取文件
		String filename = "account.txt";
		File file = new File(filename);
		BufferedReader rea = new BufferedReader(new FileReader(file)); // 将文件读取到输入缓冲流
		String temp;
		while ((temp = rea.readLine()) != null) {
			String type = temp.split(",")[0];
			String reason = temp.split(",")[1];
			String year = temp.split(",")[2];
			String month = temp.split(",")[3];
			String day = temp.split(",")[4];
			String pricestr = temp.split(",")[5]; // 切分字符串并用,隔开
			float price = Float.parseFloat(pricestr);
			Account account = new Account(type, reason, year, month, day, price); // 将属性传给account
			accountlist.add(account); // 将切分的数据添加到集合accountlist中
			count++;
		}
		rea.close();
	}

	public void writer(ArrayList<Account> accountlist) throws IOException { // 写入文件
		String allaccount = "";
		for (int i = 0; i < accountlist.size(); i++) {
			Account account = (Account) accountlist.get(i); // 获取i索引的账目属性
			String temp = account.getType() + "," + account.getReason() + "," + account.getYear() + ","
					+ account.getMonth() + "," + account.getDay() + "," + account.getPrice() + "\r\n";
			// 取到三种属性的值并赋值给变量temp
			allaccount += temp;
		}
		File file = new File("account.txt");
		FileWriter file1 = new FileWriter(file);
		file1.write(allaccount);
		file1.close();
	}

	public void writerOne(ArrayList<Account> accountlist) throws IOException { // 继续写入文件
		String allaccount = "";
		for (int i = 0; i < accountlist.size(); i++) {
			Account account = (Account) accountlist.get(i); // 获取i索引的账目属性
			String temp = account.getType() + "," + account.getReason() + "," + account.getYear() + ","
					+ account.getMonth() + "," + account.getDay() + "," + account.getPrice() + "\r\n";
			// 取到三种属性的值并赋值给变量temp
			allaccount += temp;
		}
		File file = new File("account.txt");
		FileWriter file1 = new FileWriter(file, true);
		file1.write(allaccount);
		file1.close();
	}
}
