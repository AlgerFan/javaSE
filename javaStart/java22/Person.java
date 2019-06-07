//运算符 instanceof及getName(),getSuperclass()方法的使用
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
		System.out.println("本类名="+this.getClass().getName()+"; ");
		System.out.println("父类名="+this.getClass().getSuperclass().getName());
		System.out.println("Person1.count="+this.count+ " ");
		System.out.println("Student.count="+Student.count+ " ");
		Object obj=this;
		if(obj instanceof Student)
			System.out.println(obj.toString()+"是student类对象.");
		else if(obj instanceof Person)
			System.out.println(obj.toString()+"是Person类对象");
	}
}
class Student extends Person{//子类Student继承自父类Person,且是主类但不是public类
	static int count=0;  //隐藏 了父类的count
	protected String dept;
	protected Student(String n1,int a1,String d1){
		super(n1,a1);
		dept=d1;
		this.count++;
	}
	public String toString(){	
		return super.toString()+","+dept;  //调用父类的方法
	}
	public void display(){
		super.display();
		System.out.println("super.count="+this.count);
		System.out.println(" ;this.count="+this.count);
	}
	public static void main(String[] args) {
		Person per=new Person("王永涛",23);
		per.display();
		Student stu=new Student("张小三",22,"计算机系");
		stu.display();
	}
}