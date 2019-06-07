//从键盘输入多个数据
import java.io.*;
public class App3_5
{
	public static void main(String[] args) throws IOException
	{
		int num1,num2;
		String str1,str2;
		InputStreamReader in;
		in=new InputStreamReader(System.in);
		BufferedReader buf;
		buf=new BufferedReader(in);
		System.out.print("请输入第一个数:");
		str1=buf.readLine();   //将输入的内容赋值给字符串变量str1
		num1=Integer.parseInt(str1);	//将str1转成int类型后赋给num1
		System.out.print("请输入第二个数");
		str2=buf.readLine();		//将输入的内容复制给字符串变量str2
		num2=Integer.parseInt(str2);	//将str2转成int类型后赋给num2
		System.out.println(num1+"*"+num2+"="+(num1*num2));
	}
}