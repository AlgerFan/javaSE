package org.future;

import java.io.*;
public class APP10_5 {
	public static void main(String[] args) throws IOException{
		char[] c=new char[500];		//创建可容纳500个字符的数组
		FileReader fr=new FileReader("d:\\java\\test.txt");//创建对象fr
		int num=fr.read(c);
		String str=new String(c,0,num);	//将字符数组转换成字符串
		System.out.println("读取的字符个数为："+num+",其内容如下:");
		System.out.println(str);
		fr.close();
	}
}
