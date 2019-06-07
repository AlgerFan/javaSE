package org.wlgzs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class test02 {
		public static void main(String[] args) {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("请输入一个字符串：");
		String pas;
		try {
			pas = reader.readLine();
			String [] sc = pas.split("\\s+");
			for(String s : sc){
				System.out.println(s);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
