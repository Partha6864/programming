import java.util.Scanner;
public class ProductOfDigits
{
	static int ProductOfDigits(int x)
	{
		int product=1;
		while(x!=0)
		{
			int d=x%10;
			product=product*d;
			x=x/10;
		}
		/*do
		{
			int d=x%10;
			product=product*d;
			x=x/10;
		}
		while(x!=0);*/
		return product;
	}
	public static void main(String[] args) 
	{
		Scanner ob=new Scanner(System.in);
		System.out.println("Enter the number:");
        int n=ob.nextInt();
        int pro=ProductOfDigits(n);
        System.out.println("Product Of Digits:"+pro);
	}
}