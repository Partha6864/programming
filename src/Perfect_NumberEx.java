import java.util.*;
public class Perfect_NumberEx 
{
	static boolean isPerfectNumber(int x)
	{
		int sum=0;
		for(int i=1;i<=x/2;i++)
		{
			if(x%i==0)
				sum=sum+i;
		}
		return sum==x;
		/*if(sum==x)
			return true;
		else
			return false;*/
	}
	public static void main(String[] args) 
	{
		Scanner ob=new Scanner(System.in);
		System.out.println("Enter the number:");
		int n=ob.nextInt();
		boolean rs=isPerfectNumber(n);
		if(rs==true)
			System.out.println(n+" is a Perfect Number");
		else
			System.out.println(n+" is not a Perfect Number");
	}
}