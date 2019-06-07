package myio;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import moto.Account;
import org.DengDai;
public class MyIO {
	public void modifyio() throws IOException{  //修改密码
		System.out.println("请输入您要修改的新密码:");
		Scanner b = new Scanner(System.in);
		String password = b.nextLine();
		FileWriter fa=new FileWriter("modify.txt");
		fa.write(password);
		fa.close();
		System.out.println("修改密码成功");
		System.out.println("您修改的新密码为"+password);
		DengDai qw = new DengDai();
		qw.printMenu();
	}
	public void load(DengDai dengDai) throws NumberFormatException {  //读取数据
		try{
			String filename = "account1.txt";
			File file = new File(filename);
			BufferedReader reader = new BufferedReader(new FileReader(file));
			String temp;
			while ((temp = reader.readLine()) !=null){
				String type=temp.split(",")[0];
				String reason=temp.split(",")[1];
				String time=temp.split(",")[2];
				String pricestr=temp.split(",")[3];  //切分字符串并用,隔开
				float price = Float.parseFloat(pricestr);
				Account account = new Account(type,reason,time,price);
				dengDai.accountlist.add(account);  //将切分的数据添加到DengDai类中
				dengDai.count++;
			}
			reader.close();
		} catch (FileNotFoundException e){
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NumberFormatException e){
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e){
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void save(DengDai dengDai){ //写入数据
		String fileName = "account1.txt";
		String allaccount="";
		for (int i = 0;i<dengDai.accountlist.size();i++){
			Account account=(Account)dengDai.accountlist.get(i);  
			String temp = account.getType()+ ","+account.getReason()+ ","  +account.getTime()+ "," +account.getPrice()+ "\r\n";
			//取到三种属性的值并赋值给变量temp
			allaccount +=temp;
		}
		try {
			File file1=new File(fileName);
			FileWriter fileWriter =new FileWriter(file1);
			fileWriter.write(allaccount);
			fileWriter.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
} 