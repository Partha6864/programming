package ArrayPackage;
import java.util.Scanner;
class Array3
{
	static int sumOfDigits(int []a)
	{
		int sum=0;
		for(int i=0;i<a.length;i++)
		{
			sum=sum+a[i];
	    }
	return sum;
   }
public static void main(String[] args) 
{
	Scanner ob=new Scanner(System.in);
	System.out.print("Enter the length of Array:");
	int n=ob.nextInt();
		int a[]=new int[n];
		System.out.println("Enter the "+n+" values:");
		for(int i=0;i<a.length;i++)
			a[i]=ob.nextInt();
		System.out.println("User entered Array:");
		for(int i=0;i<a.length;i++)
			System.out.println(a[i]+" ");
		int sn=sumOfDigits(a);
		System.out.println("Sum of numbers is "+sn);
	}
}
