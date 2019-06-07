//一维数组
public class App5_1
{
	public static void main(String[] args)
	{
		int i;
		int[] a;  //声明一个数组
		a=new int[5];  //分配内存空间供整型数组a使用，其元素个数为5
		for(i=0;i<5;i++)		//对数组元素进行赋值
			a[i]=i;
		for(i=a.length-1;i>=0;i--)		//逆序输出数组的内容
			System.out.print("a["+i+"]="+a[i]+",\t");
		System.out.println("\n数组a的长度是:"+a.length);//输出数组的长度
	}
}