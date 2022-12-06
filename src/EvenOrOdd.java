import java.util.*;
public class EvenOrOdd 
{
	public static void main(String[] args) 
	{
		Scanner ob=new Scanner(System.in);
		System.out.print("Enter the number:");
		int num=ob.nextInt();
		if((num/2)*2==num)
		{
			System.out.println(num+" is Even Number");
		}
		else
		{
			System.out.println(num+" is Odd Number");
		}
	}

}
