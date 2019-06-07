//比较数组元素的大小
public class App5_2
{
	public static void main(String[] args)
	{
		int i,max,sec;
		int[] a={8,50,20,7,81,55,76,93};//声明数组a，并赋初值
		if (a[0]>a[1])
		{
			max=a[0]; //max存放最大值
			sec=a[1];//sec存放次最大值
		}
		else
		{
			max=a[1];
			sec=a[0];
		}
		System.out.print("数组的各元素为:"+a[0]+""+a[1]);
		for(i=2;i<a.length;i++)
		{
			System.out.print(" " + a[i]);//输出数组a中的各元素
			if (a[i]>max)		//判断最大值
			{
				sec=max;		//原最大值降为次最大值
				max=a[i];		//a[i]为新的最大值
			}
			else		//a[i]不是新的最大值，但若a[i]大于次最大值
				if (a[i]>sec)	sec=a[i];	//a[i]为新的次最大值
		}
		System.out.print("\n其中的最大值是:"+max);//输出最大值
		System.out.println("	次最大值是:"+sec);//输出次最大值
	}
}