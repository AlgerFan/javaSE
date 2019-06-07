//求1!+2!+3!…+10！
public class Test3 
{
	public static void main(String[] args) 
	{
		int sum = 0, s, n, i;
		for (n = 1; n <= 10; n++) 
		{
			s = 1;
			for (i = 1; i <= n; i++)
			s *= i;
			sum += s;
    }
		System.out.println("sum=" + sum);
	}
}