import java.util.*;
public class StrongNumber 
{
	static boolean isStrong(int x)
	{
		int sum=0,temp=x;
		do {
			int d=x%10;
			sum=sum+fact(d);
			x=x/10;
		}
		while(x!=0);
		return sum==temp;
	}
	static int fact(int a)
	{
		int fact=1;
		while(a>1)
		{
			fact=fact*a;
			a--;
		}
		return fact;
	}
	public static void main(String[] args) 
	{
		Scanner ob=new Scanner(System.in);
		System.out.println("Enter the number:");
		int n=ob.nextInt();
		boolean rs=isStrong(n);
		if(rs==true)
			System.out.println("Date is valid");
		else
			System.out.println("Date is not valid");
	}
}
