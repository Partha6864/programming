import java.util.*;
public class PowerPrint 
{
	static int Power(int n,int p)
	{
		int prod=1;
		while(p>0)
		{
			prod=prod*n;
			p--;
		}
		return prod;
	}
	public static void main(String[] args) 
	{
		Scanner ob=new Scanner(System.in);
		System.out.println("Enter the number:");
		int n=ob.nextInt();
		System.out.println("Enter the power:");
		int p=ob.nextInt();
		int rs=Power(n,p);
		System.out.println("Poduct of the number is "+rs);
	}

}
