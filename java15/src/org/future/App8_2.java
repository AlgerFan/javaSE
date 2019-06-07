package org.future;
//定义Person类
class Person2{
	private String name;
	private int age;
	public Person2(){	//定义Person类的无参构造方法
		System.out.println("调用了Person类的无参构造方法");
	}
	public Person2(String name,int age){	//定义Person类的有参构造方法
		System.out.println("调用了Person类的有参构造方法");
		this.name=name;
		this.age=age;
	}
	public void show(){
		System.out.println("姓名:"+name+" 年龄:"+age);
	}
}
class Student2 extends Person2{	//定义继承来自Student类的子类Student
	private String department;
	public Student2(){	//定义Student类的无参构造方法
		System.out.println("调用了学生类的无参构造方法Student()");
	}
	public Student2(String name,int age,String dep){//定义Student类的有参构造方法
		super(name,age);
		department=dep;
		System.out.println("我是"+department +"的学生");
		System.out.println("调用学生类的有参构造方法Student(String name,int age,String dep)");
	}
}
public class App8_2 {
	public static void main(String[] args) {
		Student2 stu1=new Student2();//创建对象并调用无参构造方法
		Student2 stu2=new Student2("李小四",23,"信息系");//创建对象并调用有参构造方法
		stu1.show();
		stu2.show();
	}
}
