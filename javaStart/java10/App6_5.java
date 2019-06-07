//以数组为参数的方法调用
public class App6_5{
	public static void main(String[] args){
		int[] a={8,3,7,88,9,23};	//定义一维数组
		LeastNumb mineNumber=new LeastNumb();
		mineNumber.least(a);	//将一维数组a传入laest()方法
	}
}
class LeastNumb	{	//定义一个类
	public void least(int[] array){
		int min=array[0];
		for(int i=1;i<array.length;i++)
			if(min>array[i])
				min=array[i];
		System.out.println("最小的数为:"+min);
	}
}