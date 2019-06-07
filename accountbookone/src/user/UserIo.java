package user;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class UserIo implements UserInterface {
	static File file = new File("user.txt");
	//静态代码块，随着类的加载而加载  
    static{  
        try {  
            file.createNewFile();  
        } catch (IOException e) {  
            // TODO Auto-generated catch block  
            e.printStackTrace();  
        }  
    } 
	public boolean islogin(String userName, String passWord) {
		boolean flag = false;
		try {
			BufferedReader br = new BufferedReader(new FileReader(file));
			String line;
			while ((line = br.readLine()) != null) {
				String[] datas = line.split("=");
				if (userName.equals(datas[0]) && passWord.equals(datas[1])) {
					flag = true;
				}
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block 
			e.printStackTrace();
		}
		return flag;
	}
	public boolean isloginOne(String userName) { //读取用户名
		boolean flagOne = false;
		try {
			BufferedReader br = new BufferedReader(new FileReader(file));
			String line;
			while ((line = br.readLine()) != null) {
				String[] datas = line.split("=");
				if (userName.equals(datas[0])) {
					flagOne = true;
				}
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block 
			e.printStackTrace();
		}
		return flagOne;
	}

	public void register(User user) {  //注册写入
		BufferedWriter bw = null;
		try {
			bw = new BufferedWriter(new FileWriter(file,true));
			String info = user.getUserName() + "=" + user.getPassWord();
			bw.write(info); //写入
			bw.newLine(); //换行
			bw.flush();
			bw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block 
			e.printStackTrace();
		}
	}
}
