//二维数组应用的例子；显示杨辉三角
public class App5_4{
	public static void main(String[] args){
		int i,j;
		int level=7;
		int[] [] hui=new int[level][];//声明7行二维数组，存放杨辉三角形的各数
		System.out.println("杨辉三角形");
		for (i=0;i<hui.length;i++)
			hui[i]=new int[i+1];//定义二维数组的第i行有i+1列
		hui[0][0]=1;
		for (i=1;i<hui.length;i++){//计算杨辉三角形
			hui[i][0]=1;
			for (j=1;j<hui[i].length-1;j++)
				hui[i][j]=hui[i-1][j-1]+hui[i-1][j];
			hui[i][i]=1;
		}
		for(int[] row : hui)	{	//利用foreach语句显示出杨辉三角形
		for(int col : row)
			System.out.print(col+" ");
		System.out.println();
		}
  }
}