//for循环语句的应用
public class App4_11
{
	public static void main(String[] args)
	{
		int i,n=10,s=0;
		for(i=1;i<=n;i++)
		s=s+i;
		System.out.println("Sum=1+…+"+n+"="+s);
		s=0;
		System.out.print("Sum=");	//从10到2进行累加求和
		for(i=n;i>1;i--){
			  s+=i;
			  System.out.print (i+"+"); //输出数i和加号"+"
		}
			System.out.println(i+"="+(s+i));  //输出结果
				}	
}