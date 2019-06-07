//字符串应用:判断回文字符串
public class App5_6{
	public static void main(String[] args){
		String str="rotor";
		int i=0,n;
		boolean yn=true;
		if(args.length>0)//用于判断是否带有命令行参数
			str=args[0];
		System.out.println("str="+str);
		n=str.length();
		char sChar,eChar;
		while (yn && (i<n/2))	{	//算法1
			sChar=str.charAt(i);	//返回字符串str正数第i+1个位置的字符
			eChar=str.charAt(n-i-1);	//返回字符串str倒数第i+1个位置的字符
		System.out.println("sChar="+sChar+" eChar="+eChar);
		if (sChar==eChar)
			i++;
		else
			yn=false;
		}
		System.out.println("算法1:"+yn);
		String temp="",sub1="";//算法2
		for (i=0;i<n;i++){
			sub1=str.substring(i,i+1);//将str的第i+1个字符截取下来赋给sub1
				temp=sub1+temp;		//将截取下来的字符放在字符串temp的首位置
		}
			System.out.println("temp="+temp);
			System.out.println("算法2:"+str.equals(temp)); //判断字符串str与temp是否相等
	}
}