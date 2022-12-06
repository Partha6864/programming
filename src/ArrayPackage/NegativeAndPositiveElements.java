package ArrayPackage;
public class  NegativeAndPositiveElements
{
	static int[] NegativeAndPositiveElements(int a[])
	{
		int positive=0;
		int negative=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>=0)
				positive++;
			else
				negative++;
		}
		int count[]= {positive,negative};
		return count;
	}
	public static void main(String[] args) 
	{
		ArrayOperation ar=new ArrayOperation();
		int a[]=ar.ReadArray();
		int x[]=NegativeAndPositiveElements(a);
		System.out.println("No of Positive values in an Array:"+x[0]);
		System.out.println("No of Negative values in an Array:"+x[1]);
	}
}
