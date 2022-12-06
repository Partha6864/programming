import java.util.*;
public class Month 
{
	public static void main(String[] args) 
	{
		Scanner ob=new Scanner(System.in);
		System.out.println("Enter the month number:");
		int m=ob.nextInt();
		if(m>=1 && m<=12)
			System.out.println("Month number is valid");
		else
			System.out.println("Month number is invalid");
			
	}
}
