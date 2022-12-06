package ArrayPackage;
import java.util.Scanner;
class Array6
{
	static int[] CountOfEvenAndOdd(int []a)
	{
		int even=0;
		int odd=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2==0)
				even++;
			else
				odd++;
		}
		int count[]= {even,odd};
		return count;
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
		int ct[]=CountOfEvenAndOdd(a);
		System.out.println("No of Even Number is "+ct[0]);
		System.out.println("No of Odd Number is "+ct[1]);
	}
}
