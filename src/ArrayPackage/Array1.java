package ArrayPackage;
import java.util.*;
public class Array1 
{
	static int sumOfLF(int []ar)
	{
		int sum=0;
		for(int i=0;i<ar.length;i++)
		{
			sum=sum+ar[i];
		}
		return sum;
	}
	public static void main(String[] args) 
	{
		//Scanner ob=new Scanner(System.in);
		//System.out.println("Enter the element:");
		//int n=ob.nextInt();
		int x[]= {34,56,78,98,76};
		int sn=sumOfLF(x);
		System.out.println("Sum of the last and first element is "+sn);
	}
}
