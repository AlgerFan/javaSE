package org.future;
class Person3{
	protected String name;
	protected int age;
	public Person3(String name,int age){//定义Person类的构造方法
		this.name=name;
		this.age=age;
	}
	protected void show(){
		System.out.println("姓名:"+name+" 年龄:"+age);
	}
}
class Student3 extends Person3{//定义子类Student,其父类为Person
	private String department;
	public Student3(String name,int age,String dep){//定义Student类的构造方法
	super(name,age);
	department=dep;
	}
	protected void show(){		//覆盖父类Person中的同名方法
		System.out.println("系别:"+department);
	}
}
public class App8_4 {
	public static void main(String[] args) {
		Student3 stu=new Student3("王永涛",24,"电子");
		stu.show();
	}
}
