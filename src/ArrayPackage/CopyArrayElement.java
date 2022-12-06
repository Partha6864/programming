package ArrayPackage;
public class  CopyArrayElement
{
	static int[] CopyArray(int a[])
	{
		int b[]=new int[a.length];
		for(int i=0;i<a.length;i++)
		{
			b[i]=a[i];
		}
		return b;
	}
	public static void main(String[] args) 
	{
		ArrayOperation ar=new ArrayOperation();
		int a[]=ar.ReadArray();
		int x[]=CopyArray(a);
		System.out.print("New Array is:");
		for(int i=0;i<x.length;i++)
		{
			System.out.print(x[i]+" ");
		}
	}
}