package ArrayPackage;
import java.util.Scanner;
class Array5
{
	static int productOfElements(int []a)
	{
		int p=1;
		for(int i=0;i<a.length;i++)
		{
			p=p*a[i];
	    }
	return p;
   }
public static void main(String[] args) 
{
	Scanner ob=new Scanner(System.in);
	System.out.print("Enter the length of Array:");
	int n=ob.nextInt();
		int a[]=new int[n];
		System.out.println("Enter the "+n+" values:");
		for(int i=0;i<a.length;i++)
		{
			a[i]=ob.nextInt();
		}
		System.out.println("User entered Array:");
		for(int i=0;i<a.length;i++)
			System.out.println(a[i]+" ");
		int sn=productOfElements(a);
		System.out.println("Product of the elements is "+sn);
	}
}
