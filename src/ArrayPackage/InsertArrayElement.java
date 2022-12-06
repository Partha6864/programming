package ArrayPackage;
public class  InsertArrayElement
{
	static int[] InsertArray(int a[],int b,int c)
	{
		if(c<0||c>a.length)
		{
			System.out.println("Index not in range.");
			return a;
		}
		int d[]=new int[a.length+1];
		d[c]=b;
		for(int i=0;i<a.length;i++)
		{
			if(i<c)
				d[i]=a[i];
			else
				d[i+1]=a[i];
		}
		return d;
	}
	public static void main(String[] args) 
	{
		ArrayOperation ar=new ArrayOperation();
		int a[]=ar.ReadArray();
		int x[]=InsertArray(a,39,3);
		System.out.println("New Array is:");
		for(int i=0;i<x.length;i++)
		{
		System.out.print(x[i]+" ");
		}
	}
}