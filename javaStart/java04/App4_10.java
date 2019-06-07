/*已知S=N！，其中N为正整数，从键盘输入一个大于1的正数M,
求满足S<M时的最大S及此时的N,并输出S和N的值
*/
import java.util.*;
public class App4_10
{
	public static void main(String[] args)
	{
		int n=1,s=1,m;
		Scanner reader=new Scanner(System.in);
		do{
			System.out.print("请输入大于1的整数m:");
			m=reader.nextInt();
		} while (m<=1);
		while (s<m)
		{
			s*=n;
			n++;
		}
		System.out.println("s="+s/(n-1)+"  n="+(n-2));  //输出结果
	}
}