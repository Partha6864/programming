package ArrayPackage;
public class  EvenAndOdd
{
	static int[] EvenAndOdd(int a[])
	{
		int even=0;
		int odd=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2==0)
				even=even+a[i];
			else
				odd=odd+a[i];
		}
		int count[]= {even,odd};
		return count;
	}
	public static void main(String[] args) 
	{
		ArrayOperation ar=new ArrayOperation();
		int a[]=ar.ReadArray();
		int x[]=EvenAndOdd(a);
		System.out.println("Sum of Even numbers in an Array:"+x[0]);
		System.out.println("Sum of Odd numbers in an Array:"+x[1]);
	}
}
