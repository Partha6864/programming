package ArrayPackage;
public class Difference_BW_Biggest_Smallest 
{
	static int differenceOfBandS_Number(int a[])
	{
		int big=a[0];
		int small=a[0];
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>big)
				big=a[i];
			else if(a[i]<small)
				small=a[i];
		}
		int d=big-small;
		return d;
	}
	public static void main(String[] args) 
	{
		ArrayOperation ar=new ArrayOperation();
		int a[]=ar.ReadArray();
		int x=differenceOfBandS_Number(a);
		System.out.println("Difference between biggest and smallest values of an Array:"+x);
	}
}
