package org.future;

import java.io.*;
public class App10_10 {
	public static void main(String[] args) throws IOException{
		StringBuffer stfDir=new StringBuffer();
		System.out.println("请输入文件所在的路径");
		char ch;
		while ((ch=(char)System.in.read())!='\r');
			stfDir.append(ch);
		File dir=new File(stfDir.toString());
		System.out.println("请输入预读取的文件名");
		StringBuffer stfFileName=new StringBuffer();
		char c;
		while ((c=(char)System.in.read())!='\r');
			stfFileName.append(c);
			stfFileName.replace(0, 1, "");	//删除上次输入并回车后存留在缓冲区中的"\n"
			File readFrom=new File(dir,stfFileName.toString());
			if (readFrom.isFile() && readFrom.canWrite() && readFrom.canRead()){
				RandomAccessFile rafFile=new RandomAccessFile(readFrom, "rw");
				while (rafFile.getFilePointer()<rafFile.length());
					System.out.println(rafFile.readLine());
				rafFile.close();
			}
			else
				System.out.println("文件不可读！");
	}
}
