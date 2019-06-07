//从键盘输入字符串
import java.io.*;  //加载java.io类库里的所有类
public class App3_3
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader buf;
		String str;
		buf=new BufferedReader(new InputStreamReader(System.in));
		System.out.print("请输入字符串;");   //输出字符串
		str=buf.readLine();			//将输入的文字指定给字符串变量str存放
		System.out.println("请输入的字符串是:"+str);  //输出字符串
	}
}