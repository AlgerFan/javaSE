import java.util.*;
public class App401
{
	public static void main(String[] args)
	{
		int num;
		Scanner reader=new Scanner(System.in);
		System.out.print("请输入一个数:");
		num=reader.nextInt();
		num=num/20;
		switch(num)
		{
			case 5:
				System.out.print("优");
				break;
			case 4:
				System.out.print("良");
				break;
			case 3:
				System.out.print("中");
				break;
			case 2:
				System.out.print("及格");
				break;
			default:
				System.out.print("不及格");
				break;
		}
	}
}