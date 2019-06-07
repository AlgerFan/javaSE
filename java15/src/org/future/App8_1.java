package org.future;
//类继承的简单例子
class Person{//Person类是java.lang.Object类的子类
	private String name;//name表示姓名
	private int age;//age表示年龄
	public Person(){//定义Person类的无参构造方法
		System.out.println("调用了个人类的构造方法Person()");
	}
	public void setNameAge(String name,int age){
		this.name=name;
		this.age=age;
	}
	public void show(){
		System.out.println("姓名:"+name+" 年龄:"+age);
	}
}
class Student extends Person{//定义Student类，继承自Person类
	private String department;
	public Student(){//定义Student类是构造方法
		System.out.println("调用了学生类的构造方法Student()");
	}
	public void setDeparment(String dep){
		department=dep;
		System.out.println("我是"+department +"的学生");
	}
}
public class App8_1 {		//主类
	public static void main(String[] args) {
		Student stu=new Student();//创建Student对象
		stu.setNameAge("张小三", 21);//调用父类的setNameAge()方法
		stu.show();			//调用父类的show()方法
		stu.setDeparment("计算机系");//调用子类的setDeparment()
	}
}