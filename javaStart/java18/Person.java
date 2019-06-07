package org.future;

public class Person{
	static int count=0;
	protected String name;
	protected int age;
	public Person(String n1,int a1){
		name=n1;
		age=a1;
		this.count++;
	}
	public String toString(){
		return this.name+" , "+this.age;
	}
	public void display(){
		System.out.print("本类名="+this.getClass().getName()+"; ");
		System.out.println("父类名="+this.getClass().getSuperclass().getName());
		System.out.print("Person1.count="+this.count+ " ");
		System.out.print("Student.count="+Student.count+ " ");
		Object obj=this;
		if(obj instanceof Student)
			System.out.println(obj.toString()+"是student类对象.");
		else if(obj instanceof Student)
			System.out.println(obj.toString()+"是Person类对象");
	}
	public static void main(String[] args) {
		Person per=new Person("王永涛",23);
		per.display();
		Student stu=new Student("张小三",22,"计算机系");
		stu.display();
	}
}
