//求1!+2!+…n!
import java.util.*;
public class App403
{
	public static void main(String[] args)
	{
		int num,sum = 0, s, n, i;
		Scanner reader=new Scanner(System.in);
		System.out.print("请输入一个数:");
		num=reader.nextInt();
		for (n = 1; n <= num; n++) 
		{
			s = 1;
			for (i = 1; i <= n; i++)
			s *= i;
			sum += s;
    }
		System.out.println("sum=" + sum);
			
	}
}