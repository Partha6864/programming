import java.util.*;
public class SmallerNo 
{
	public static void main(String[] args) 
	{
		Scanner ob=new Scanner(System.in);
		System.out.println("Enter 4 number:");
		int a=ob.nextInt();
		int b=ob.nextInt();
		int c=ob.nextInt();
		int d=ob.nextInt();
		int small=a;
		if(b<small)
			small=b;
		if(c<small)
			small=c;
		if(d<small)
			small=d;
		System.out.println("The smallest number is "+small);
		/*if(a<b&&a<c&&a<d)
			System.out.println("The smallest number is "+a);
		else if(b<c&&b<d)
			System.out.println("The smallest number is "+b);
		else if(c<d)
			System.out.println("The smallest number is "+c);
		else
			System.out.println("The smallest number is "+d);*/
	}
}
