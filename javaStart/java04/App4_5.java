//while语句的应用
public class App4_5
{
	public static void main(String[] args)
	{
		final int MAX =15;
		int i=0,j=1,k=1;
		while(k<=MAX)
		{
			System.out.print(" "+i+" "+j);
			i=i+j;		//计算序列的下一个数
			j=i+j;		//计算序列的下一个数
			k=k+2;		//用于改变循环的条件表达式的值
		}
		System.out.println();
	}
}