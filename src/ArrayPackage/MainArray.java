package ArrayPackage;
public class MainArray 
{
	public static void main(String[] args) 
	{
		ArrayOperation ar=new ArrayOperation();
		int x[]=ar.ReadArray();
		System.out.println("User Entered Array:");
		ar.DisplayArray(x);
		System.out.println("Average Of Array Elements:"+ar.AvgOfArray(x));
	}
}
