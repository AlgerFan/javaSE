package org.future;

import java.io.*;
public class App10_4 {
	public static void main(String[] args) {
		try{
			byte[] b=new byte[120];		//设置缓存区
			System.out.println("请输入字符：");
			int count=System.in.read(b);	//读取标准输入流，将回车符和换行符也存放到数组中
			System.out.println("您输入的是：");
			for(int i=0;i<count;i++)
				System.out.print(b[i]+ " ");
			System.out.println();
			for (int i=0;i<count-2;i++)
				System.out.print((char)b[i]+ " ");
			System.out.println();
			System.out.println("输入的字符个数为"+count);
			Class InClass=System.in.getClass();
			Class OutClass=System.out.getClass();
			System.out.println("in所在的类是："+InClass.toString());
			System.out.println("out所在的类是："+OutClass.toString());
		}
		catch (IOException e) { }
	}
}
