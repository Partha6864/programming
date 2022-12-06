package ArrayPackage;
public class  MergeTwoArray
{
	static int[] Merge(int a[],int b[])
	{
		int c[]=new int[a.length+b.length];
		for(int i=0;i<a.length;i++)
		{
			c[i]=a[i];
		}
		for(int i=0;i<b.length;i++)
		{
			c[a.length+i]=b[i];
		}
		return c;
	}
	public static void main(String[] args) 
	{
		ArrayOperation ar=new ArrayOperation();
		int a[]=ar.ReadArray();
		int b[]=ar.ReadArray();
		int x[]=Merge(a,b);
		System.out.println("Merge Of Two Arrays:");
		for(int i=0;i<x.length;i++)
		{
		System.out.print(x[i]+" ");
		}
	}
}