import java.util.*;
public class Prime_NumberEx 
{
	static boolean isPrimeNumber(int x)
	{
		 for(int i=2;i<=x/2;i++)
	      {
	    	  if(x%i==0)
	    		return false;
	      }
		 return true;
	}
	public static void main(String[] args) 
	{
		Scanner ob=new Scanner(System.in);
		System.out.println("Enter the number:");
		int n=ob.nextInt();
		boolean rs=isPrimeNumber(n);
		if(rs==true)
			System.out.println(n+" is a Prime Number");
		else
			System.out.println(n+" is not a Prime Number");
	}
}
