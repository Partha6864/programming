import java.util.Scanner;
public class SumOfSqDigits 
{
	static int SumOfDigits(int x)
	{
		int sum=0;
		while(x!=0)
		{
			int d=x%10;
			sum=sum+d*d;
			x=x/10;
		}
		return sum;
	}
	public static void main(String[] args) 
	{
		Scanner ob=new Scanner(System.in);
		System.out.println("Enter the number:");
        int n=ob.nextInt();
        int sn=SumOfDigits(n);
        System.out.println("Sum Of Square Of Digits:"+sn);
	}
}