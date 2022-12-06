package ArrayPackage;
import java.util.*;
class Array2
{
	static int getBiggest(int []a)
	{
		int big=a[0];
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>big)
				big=a[i];
	    }
	return big;
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
		int sn=getBiggest(a);
		System.out.println("Biggest number is "+sn);
	}
}
