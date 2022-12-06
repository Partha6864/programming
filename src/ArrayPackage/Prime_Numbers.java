package ArrayPackage;
public class  Prime_Numbers
{
	static int PrimeNumbers(int a[])
	{
		int count=0;
		for(int i=0;i<a.length;i++)
		{
			boolean prime=true;
			if(a[i]>1)
			{
				for(int j=2;j<a[i];j++)
				{
					if(a[i]%j==0)
						prime=false;
					break;
				}
			}
			if(prime==true)
				count++;
		}
		return count;
	}
	public static void main(String[] args) 
	{
		ArrayOperation ar=new ArrayOperation();
		int a[]=ar.ReadArray();
		int x=PrimeNumbers(a);
		System.out.println("No of Prime numbers in the Array:"+x);
	}
}
