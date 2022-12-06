import java.util.*;
public class MiddleNo 
{
	public static void main(String[] args) 
	{
		Scanner ob=new Scanner(System.in);
		System.out.println("Enter 3 Distinct Number:");
		int a=ob.nextInt();
		int b=ob.nextInt();
		int c=ob.nextInt();
		if((a>b && a<c)||(a>c && a<b))
			System.out.println(a);
		else if((b>a && b<c)||(b>c && b<a))
			System.out.println(b);
		else
			System.out.println(c);
	}

}
