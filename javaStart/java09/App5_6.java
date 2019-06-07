//一个5位数，判断它是不是回文数。即12321是回文数，个位与万位相同，十位与千位相同；
public class App5_6{
	public static void main(String[] args){
		String s="rotor";
		int i=0,n;
		if(args.length>0)		
			s=args[0];			///用于判断是否带有命令行参数
		System.out.println("s="+s);
		n=s.length();
		String a="",b="";
		for(i=0;i<n;i++){
			a=s.substring(i,i+1);
			b=a+b;//将截取下来的字符放在字符串c的首位置
		}
		System.out.println("b="+b);
		System.out.println("算法2:"+s.equals(b));
	}
}