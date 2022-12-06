import java.util.Scanner;
public class Even_Or_Odd 
{
	public static void main(String[] args) 
	{
		Scanner ob=new Scanner(System.in);
		System.out.println("Enter the number:");
		int num=ob.nextInt();
		if(num%2==0)
		{
			System.out.println(num+" is a Even number");
		}
		else
		{
			System.out.println(num+" is a Odd number");
		}
	}

}
