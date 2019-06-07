package org.future;
//6.打印杨辉三角形
public class test06 {
	public static void main(String[] args) {
		int i,j;
		int[][] yang=new int[7][];	//声明7行二维数组，存放杨辉三角的各数
		System.out.println("杨辉三角形:");
		for(i=0;i<yang.length;i++)
			yang[i]=new int[i+1];
		yang[0][0]=1;		//定义二维数组的第i行有i+1列
		for(i=1;i<yang.length;i++){//计算杨辉三角形
			yang[i][0]=1;
			for(j=1;j<yang[i].length-1;j++)
				yang[i][j]=yang[i-1][j-1]+yang[i-1][j];
			yang[i][yang[i].length-1]=1;
		}
		for(int[] row : yang){//利用foreach语句显示出杨辉三角形
			for(int col : row)
				System.out.print(col+ " ");
			System.out.println();
		}
	}
}
