//do-while循环的应用
import java.util.*;
public class App4_8
{
	public static void main(String[] args)
	{
		int n,i=1,sum=0;
		Scanner buf=new Scanner(System.in);
		do{
			System.out.print("输入正整数:");
			n=buf.nextInt();
		} while (n<=0);		//要求输入数n必须大于0，否则一直要求重新输入
		while(i<=n)
			sum+=i++;					//计算和
		System.out.println("1+2+…+"+n+"="+sum); //输出结果
	}
	}
		