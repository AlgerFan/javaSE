package org.future;
//对象数组的应用
class Person1{
	private String name;
	private int age;
	public Person1(String name,int age){
		this.name=name;
		this.age=age;
	}
	public void show(){
		System.out.println("姓名:"+name+" 年龄:"+age);
	}
}
public class App7_13{		//主类
	public static void main(String[] args) {
		Person1[] per;//声明类类型的数组
		per=new Person1[3];//用new运算符为数组分配内存空间
		per[0]=new 	Person1("张三",20);
		per[1]=new 	Person1("李四",21);
		per[2]=new 	Person1("王二",19);
		per[2].show();	//利用对象per[2]调用show()方法
		per[0].show();	//利用对象per[0]调用show()方法
	}
}