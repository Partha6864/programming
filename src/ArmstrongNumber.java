import java.util.*;
public class ArmstrongNumber 
{
	public static void main(String[] args) 
	{
		Scanner ob=new Scanner(System.in);
		System.out.println("Enter the number:");
		int n=ob.nextInt();
		int sum=0;
		int r;
		int num=n;
		while(n>0)
		{
			r=n%10;
			sum=sum+(r*r*r);
			n=n/10;
		}
			if(sum==num)
				System.out.println("It is an Armstrong Number");
			else
				System.out.println("It is not an Armstrong Number");

	}

}
