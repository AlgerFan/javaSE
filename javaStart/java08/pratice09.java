//╩С│Ш1-1/2+1/3-1/4+...+1/99-1/100;х─ох
public class pratice09{
	public static void main(String[] args){
		float s,sum1=0,sum2=0,i,j;
		for (i=1;i<=100;i++)
			sum1=sum1+1/i;
		for (j=2;j<=100;j+=2)
			sum2=sum2+1/j;
		s=sum1-sum2*2;
		System.out.println("1-1/2+1/3-1/4+...+1/99-1/100="+s);
	}
}