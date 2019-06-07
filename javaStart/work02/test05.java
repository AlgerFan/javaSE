package org.future;
/*
 * 输出如下图形，不得使用字符串直接输出
  	  *
     ***
    *****
   *******
  *********

 */

public class test05 {
	public static void main(String[] args) {
		int N=5;  //定义行数
		for(int i=0;i<N;i++){ 
		  for(int m=0;m<N-1-i;m++){
		   System.out.print(" ");   
		  }
		  for(int j=0;j<2*i+1;j++){
		   System.out.print("*");
		  }
		   System.out.print("\n");
		  }
	}
}
