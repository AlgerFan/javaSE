//多重条件选择语句的应用
public class App4_2
{
	public static void main(String[] args)
	{
		int testScore=86;
		char grade;
	if(testScore>=90) {
		grade='A';
	} else if (testScore>=80) {
		grade='B';
	}	else if (testScore>=70) {
			grade='C';
		} else {
			grade='E';
		}
		System.out.println("评定成绩为:"+ grade);
	}
}