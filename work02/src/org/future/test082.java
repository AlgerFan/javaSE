package org.future;
/*
	设计一个学生类，该类包括姓名，年龄，性别，返回姓名的	方法，	
	输出年龄和性别的方法。设计主类调用学生类对象的两个方法，	其中姓名，年龄由主类创建对象时赋值。
*/
class Student{
	int age;
	String sex;
	String name;
	public void SexAge(String sex,int age){
		sex="男";
		System.out.println("性别:"+sex+" 年龄:"+age);
	}
	public void Name(String n){
		name=n;
		System.out.println("我是"+name+"");
	}
}
public class test082 {
	public static void main(String[] args) {
		Student stu=new Student();
		stu.SexAge("男",20);
		stu.Name("张三");
	}
}
