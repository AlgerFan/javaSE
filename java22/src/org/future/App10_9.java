package org.future;

import java.io.*;
public class App10_9 {
	public static void main(String[] args) {
		String str=new String();
		try{
			InputStreamReader isr=new InputStreamReader(System.in);
			BufferedReader inp=new BufferedReader(isr);
			String sdir="d:\\cgj";
			String sfile;
			File fdir1=new File(sdir);
			if (fdir1.exists() && fdir1.isDirectory()){
				System.out.println("文件夹："+sdir+"已经存在");
				for (int i=0; i<fdir1.list().length;i++)
					System.out.println((fdir1.list())[i]);
				File fdir2=new File("d:\\cgj\\temp");
				if (!fdir2.exists())
					fdir2.mkdirs();
				System.out.println();
				System.out.println("建立新文件夹后的文件列表");
				for(int i=0;i<fdir1.list().length;i++)
					System.out.println(fdir1.list()[i]);
			}
			System.out.print("请输入该文件夹中的一个文件名：");
			sfile=inp.readLine();		//从键盘读取数据
			File ffile=new File(fdir1,sfile);
			if(ffile.isFile()){
				System.out.print("文件名："+ffile.getName());
				System.out.print("; 所在文件夹："+ffile.getPath());
				System.out.println(";文件大小："+ffile.length()+"字节");
			}
			if(inp!=null) inp.close();
		}
		catch (IOException e){
			System.out.println(e.toString());
		}
	}
}