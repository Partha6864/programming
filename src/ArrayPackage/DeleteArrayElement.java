package ArrayPackage;
public class  DeleteArrayElement
{
	static int[] DeleteArray(int a[],int b)
	{
		if(b<0||b>=a.length)
		{
			System.out.println("Index not in range.");
			return a;
		}
		int c[]=new int[a.length-1];
		for(int i=0;i<c.length;i++)
		{
			if(i<b)
				c[i]=a[i];
			else
				c[i]=a[i+1];
		}
		return c;
	}
	public static void main(String[] args) 
	{
		ArrayOperation ar=new ArrayOperation();
		int a[]=ar.ReadArray();
		int x[]=DeleteArray(a,2);
		System.out.println("New Array is:");
		for(int i=0;i<x.length;i++)
		{
		System.out.print(x[i]+" ");
		}
	}
}