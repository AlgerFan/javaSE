//从键盘上输入一个数n  计算sum=1-1/2!+1/3!…+(-1)n-1 1/n!
import java.util.*;
public class App405{
	public static void main(String[] args){
		float n,sum = 0, s, j, i,k=-1;
		Scanner reader=new Scanner(System.in);
		System.out.print("请输入一个数:");
		n=reader.nextInt();
		for (j = 1; j <= n; j++) 
		{
			s = 1;
			for (i = 1; i <= j; i++)
				s *= i;
			k=-k;
			sum += (1/s)*k;
    }
    System.out.println("sum="+sum);
  }
}