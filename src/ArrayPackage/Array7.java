package ArrayPackage;
import java.util.Scanner;
class Array7
{
	static float averageOfNumbers(float []a)
	{
		float sum=0;
		for(int i=0;i<a.length;i++)
		{
			sum=sum+a[i];
		}
		float avg=sum/a.length;
		return avg;
	}
	public static void main(String[] args) 
	{
		Scanner ob=new Scanner(System.in);
		System.out.print("Enter the length of Array:");
		int n=ob.nextInt();
		float a[]=new float[n];
		System.out.println("Enter the "+n+" values:");
		for(int i=0;i<a.length;i++)
			a[i]=ob.nextFloat();
		System.out.println("User entered Array:");
		for(int i=0;i<a.length;i++)
			System.out.println(a[i]+" ");
		float sn=averageOfNumbers(a);
		System.out.println("Average of numbers is "+sn);
	}
}