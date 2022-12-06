import java.util.Scanner;
public class DivisibilityEx2 
{
	public static void main(String[] args) 
	{
		Scanner ob=new Scanner(System.in);
		System.out.println("Enter the number:");
		int num=ob.nextInt();
		if(num%3==0)
			System.out.println("Divisible");
		else
			System.out.println("Not Divisible");
	}

}
