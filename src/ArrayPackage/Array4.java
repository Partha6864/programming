package ArrayPackage;
import java.util.Scanner;
class Array4
{
	static int differenceOfLF(int []a)
	{
		int d=0;
		for(int i=0;i<a.length;i++)
		{
			d=a[0]-a[a.length-1];
	    }
	return d;
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
		int sn=differenceOfLF(a);
		System.out.println("Difference of first and last element is "+sn);
	}
}
