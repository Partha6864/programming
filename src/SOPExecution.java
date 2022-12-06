import java.util.*;
public class SOPExecution 
{
	public static void main(String[] args) 
	{
		System.out.println(5+6+" is equal to "+5+6);//11 is equal to 56
		int c=5,d=6;
		System.out.println(c+d+" is equal to "+c+d);//11 is equal to 56
		Scanner ob=new Scanner(System.in);
		int a=ob.nextInt();
		int b=ob.nextInt();
		System.out.println(a+"+"+b+"="+a+b);//a+b=ab
		System.out.println(a+"+"+b+"="+(a+b));//a+b=a+b
		//System.out.println(a+"-"+b+"="+a-b);//"-"is a bad operator.So,Compile Time Error
		System.out.println(a+"-"+b+"="+(a-b));//a-b=a-b
		System.out.println(a+"*"+b+"="+a*b);//a*b=a*b
		System.out.println(a+"/"+b+"="+a/b);//a/b=result
		System.out.println(a+"%"+b+"="+a%b);//a%b=remainder
	}

}
