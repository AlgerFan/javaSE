//switch语法的应用
public class App4_3
{
	public static void main(String[] args) throws Exception
	{
		int a=100,b=6;
		char oper;
		System.out.print("请输入运算符:");
		oper=(char)System.in.read();  //从键盘输入一个字符存入变量oper中
		switch (oper)
		{
			case '+':		//输出a+b
				System.out.println(a+"+"+b+"="+(a+b));
				break;
			case '-':  //输出a-b
				System.out.println(a+"-"+b+"="+(a-b));
				break;
			case '*':		//输出a*b
				System.out.println(a+"*"+b+"="+(a*b));
				break;
			case '/':		//输出a/b
				System.out.println(a+"/"+b+"="+(a/b));
				break;
			default:		//输出字符串
				System.out.println("输入的字符不正确!");
		}
	}
}