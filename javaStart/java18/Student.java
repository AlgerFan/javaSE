package org.future;

class Student extends Person{//子类Student继承自父类Person,且是主类但不是public类
	static int count=0;  //隐藏 了父类的count
	protected String dept;
	protected Student(String n1,int a1,String d1){
		super(n1,a1);	//调用父类的构造方法
		dept=d1;
		this.count++;	//调用子类的静态变量
	}
	public String toString(){	
		return super.toString()+","+dept;  //调用父类的同名方法
	}
	public void display(){
		super.display();	//调用父类的方法
		System.out.println("super.count="+this.count);	//引用父类的变量
		System.out.println(" ;this.count="+this.count);
	}
	public static void main(String[] args) {
		Person per=new Person("王永涛",23);
		per.display();
		Student stu=new Student("张小三",22,"计算机系");
		stu.display();
	}
}