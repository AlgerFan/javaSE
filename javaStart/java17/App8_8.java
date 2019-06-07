package org.future;
//利用getClass()方法返回运行该方法的对象所属的类
class Person{
	protected String name;
	public Person(String xm){//定义Person类的构造方法
		name=xm;
	}
}
public class App8_8 {
	public static void main(String[] args) {
		Person per=new Person("张三");
		Class obj=per.getClass();
		System.out.println("对象per所属的类为:"+obj);
	}
}