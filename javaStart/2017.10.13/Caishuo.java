/*
 此程序随机产生一个0-100的数字，根据提示猜出数字大小
*/
import java.util.Random;  //创建一个新的随机数处理器
import java.util.Scanner;  //导入Scanner类
public class Caishuo
{
	public static void main(String[] args)
	{	
		int oldnum,num,i=0;
		Random r = new Random();  //创建一个随机函数
		oldnum = r.nextInt(100);  //给定一个随机数范围100
		while(true){  //循环
			i++;  //循环加1
			Scanner sc = new Scanner(System.in);  //输入一个整数
			num=sc.nextInt();  //把输入的值给num
			if(oldnum > num){  //随机数与输入的值的大小判断
				System.out.println("你猜的数字小了");
			}
			else if(oldnum < num){
				System.out.println("你猜的数字大了");
			}
			else{
				System.out.println("你猜对了，一共猜了"+ i +"次");	
				break;  //退出循环
			}
		}
	}
}	 