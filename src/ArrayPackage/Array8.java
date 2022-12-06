package ArrayPackage;
import java.util.Scanner;
class Array8
{
	static int secondBiggest(int []a)
	{
		int fbig=a[0];
		int sbig=a[0];
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>fbig)
			{
				sbig=fbig;
				fbig=a[i];
			}
			else if(a[i]>sbig && a[i]==fbig)
			{
				sbig=a[i];
			}
	    }
	return sbig;
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
		int sn=secondBiggest(a);
		System.out.println("Second Biggest number is "+sn);
	}
}
