//hasNextXXX()方法的使用
import java.util.*;
public class App4_7
{
	public static void main(String[] args)
	{
		double sum=0;
		int n=0;
		System.out.println("请输入多个数,每输入一个数后按Enter或空格键确认:");
		System.out.println("请输入一个非数字结束输入操作");
		Scanner reader=new Scanner(System.in);	//用System.in创建一个Scanner对象
		while(reader.hasNextDouble())		//判断输入流是否有双精度浮点型数据
		{
			double x=reader.nextDouble();
			sum=sum+x;
			n++;
		}
		System.out.print("共输入了"+n+"个数,其合为:"+sum);
	}
}