import java.util.*;
public class Perfect_Number 
{
	public static void main(String[] args) 
	{
		Scanner ob=new Scanner(System.in);
		System.out.println("Enter the number:");
		int num=ob.nextInt();
		int sum=0;
		for(int i=1;i<=num/2;i++)
		{
			if(num%i==0)
			{
				sum=sum+i;
			}
		}
		if(num==sum)
			System.out.println(num+" is a Perfect Number");
		else
			System.out.println(num+" is not a Perfect Number");
	}
}
