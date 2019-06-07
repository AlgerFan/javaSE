package org.future;

//方法的返回值为对象
class person{
	private String name;
	private int age;
	public person(String name,int age){
		this.name=name;
		this.age=age;
	}
	public person compare(person p){		//返回值的类型为对象
		if(this.age>p.age)
			return this;		//返回调用该方法的对象
		else
			return p;		//返回参数对象
	}
}
public class App7_12 {		//主类
	public static void main(String[] args) {
		person per1=new person("张三",20);
		person per2=new person("李四",21);
		person per3;
		per3=per1.compare(per2);
		if(per3==per1)
			System.out.println("张三年龄大");
		else
			System.out.println("李四年龄大");
	}
}