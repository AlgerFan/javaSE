//由键盘输入整数
import java.io.*;
public class App3_4
{
	public static void main(String[] args)throws IOException
	{
		float num;
		String str;
		BufferedReader buf;
		buf=new BufferedReader(new InputStreamReader(System.in));
		System.out.print("请输入一个实数:");
		str=buf.readLine();  //将输入的文字指定给字符串变量str存放
		num=Float.parseFloat(str);  //将str转换成float类型后赋给num
		System.out.println("您输入的数为:"+num);
	}
}