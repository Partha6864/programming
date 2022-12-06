package ArrayPackage;
import java.util.*;
public class ArrayOperation 
{
	int[] ReadArray()
	{
		Scanner ob=new Scanner(System.in);
		System.out.print("Enter the size of an Array:");
		int n=ob.nextInt();
		int a[]=new int[n];
		System.out.println("Enter the "+n+" values:");
		System.out.println("User entered Array:");
		for(int i=0;i<a.length;i++)
		{
			a[i]=ob.nextInt();
		}
		return a;
	}
	void DisplayArray(int a[])
	{
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
		System.out.println();
	}
	double AvgOfArray(int a[])
	{
		double sum=0;
		for(int i=0;i<a.length;i++)
		{
			sum=sum+a[i];
		}
		return sum/a.length;
	}
}
