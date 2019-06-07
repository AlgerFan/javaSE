package org.future;
//对象的两种比较方式
class A{
	int a=1;
}
public class App8_7 {
	public static void main(String[] args) {
		A obj1=new A();
		A obj2=new A();
		String s1,s2,s3="abc",s4="abc";	//s3,s4为指向字符串池中同一字符串"abc"的对象
		s1=new String("abc");
		s2=new String("abc");
		System.out.println("s1.equals(s2)是"+(s1.equals(s2)));
		System.out.println("s1==s3是"+(s1==s3));
		System.out.println("s1.equals(s3)是"+(s1.equals(s3)));
		System.out.println("s3==s4是"+(s3==s4));
		System.out.println("s2.equals(s3)是"+(s2.equals(s3)));
		System.out.println("s1==s2是"+(s1==s2));
		System.out.println("obj1==obj2是"+(obj1==obj2));
		System.out.println("obj1.equals(obj2)是"+(obj1.equals(obj2)));
		obj1=obj2;
		System.out.println("obj1=obj2后obj1==obj2是"+(obj1==obj2));
		System.out.println("obj1=obj2后obj1.equals(obj2)是"+(obj1.equals(obj2)));
	}
}
