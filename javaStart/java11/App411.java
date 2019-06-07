/*输出1	3	6	10	15
			2	5	9	14 
			4	8	13 
			7	12 
			11
*/
public class App411{
	public static void main(String[] args){
		int[][] a = {{1,3,6,10,15},{2,5,9,14},{4,8,13},{7,12},{11}};
		int[][] b=new int[5][5];
		Trans pose=new Trans();		//创建Trans类的对象pose
		b=pose.transpose(a);		//用数组a调用方法，返回值赋给数组b
		for(int i = 0; i<b.length; i++){	//输出数组的内容
   		for(int j = 0;j<b[i].length;j++)
    			System.out.print(b[i][j]+"	");
    	System.out.print("\n");
  	}
  }
}