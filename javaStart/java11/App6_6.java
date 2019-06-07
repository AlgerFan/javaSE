public class App6_6{
	public static void main(String[] args){
		int[][] a={{1,2,3},{4,5,6},{7,8,9}};
		int[][] b=new int[3][3];
		Trans pose=new Trans();		//创建Trans类的对象pose
		b=pose.transpose(a);		//用数组a调用方法，返回值赋给数组b
		for(int i = 0; i<b.length; i++){	//输出数组的内容
   		for(int j = 0;j<b[i].length;j++)
    			System.out.print(b[i][j]+" ");
    	System.out.print("\n");			//每输出数组的一行后换行
  	}
  }
}
class Trans{
	int temp;
	int[][] transpose(int[][] array){	//返回值和参数均为二维整型数组的方法
		for(int i=0;i<array.length;i++)	//将矩形转置
			for(int j=i+1;j<array[i].length;j++){
				temp=array[i][j];
				array[i][j]=array[j][i];
				array[j][i]=temp;								//将二维数组的行与列互换
			}
		return array;
	}
}