package cn.algerfan.student;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

import cn.algerfan.student.Student;

public class MyIO {
	int count = 0;

	public void reader(List<Student> studentList)
			throws NumberFormatException, FileNotFoundException, IOException { // 读取文件
		String filename = "student.txt";
		File file = new File(filename);
		BufferedReader rea = new BufferedReader(new FileReader(file)); // 将文件读取到输入缓冲流
		String temp;
		while ((temp = rea.readLine()) != null) {
			String type = temp.split(",")[0];
			String year = temp.split(",")[1];
			String month = temp.split(",")[2];
			String day = temp.split(",")[3];// 切分字符串并用,隔开
			Student student = new Student(type, year, month, day); // 将属性传给student
			studentList.add(student); // 将切分的数据添加到集合studentList中
			count++;
		}
		rea.close();
	}

	public void writer(List<Student> studentList) throws IOException { // 写入文件
		String allStudent = "";
		for (int i = 0; i < studentList.size(); i++) {
			Student student = (Student) studentList.get(i); // 获取i索引的学生属性
			String temp = student.getName() + "," + student.getSex() + "," + student.getAge() + ","
					+ student.getStuno() + "\r\n";
			// 取到三种属性的值并赋值给变量temp
			allStudent += temp;
		}
		File file = new File("student.txt");
		FileWriter file1 = new FileWriter(file);
		file1.write(allStudent);
		file1.close();
	}

}
