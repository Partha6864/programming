import java.util.Scanner;
public class HappyNumber 
{
	public static void main(String[] args) 
	{
		Scanner ob=new Scanner(System.in);
		System.out.println("Enter the number:");
		int num=ob.nextInt();
		int sum=0;
		while(num>9)
		{
		while(num>0)
		{
			int r=num%10;
			sum=sum+(r*r);
			num=num/10;
		}
		num=sum;
		sum=0;
		}
		if(num==1||num==7)
			System.out.println("It is a Happy Number");
		else
			System.out.println("It is not a Happy Number");
	}
}
