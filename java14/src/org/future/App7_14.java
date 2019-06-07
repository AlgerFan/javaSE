package org.future;

//以对象数组为参数进行方法调用
class Person2{
	private String name;
	private int age;
	public Person2(String name,int age){
		this.name=name;
		this.age=age;
	}
	public static int minAge(Person2[] p){//以对象数组作为参数传递给方法
		int min=Integer.MAX_VALUE;
		for (int i=0;i<p.length;i++)
			if(p[i].age<min)
				min=p[i].age;	//将对象数组中成员变量age的最小值存入变量min中
		return min;		//返回对象数组中最小的成员变量的值
	}
}
public class App7_14 {
	public static void main(String[] args) {
		Person2[] per=new Person2[3];
		per[0]=new Person2("张三",20);
		per[1]=new Person2("李四",21);
		per[2]=new Person2("王二",19);
		System.out.println("最小的年龄为:"+ Person2.minAge(per));
	}
}