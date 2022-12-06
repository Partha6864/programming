import java.util.*;
public class MonthEx3 
{
	public static void main(String[] args) 
	{
		Scanner ob=new Scanner(System.in);
		System.out.print("Enter month number");
		int n=ob.nextInt();
		String s[]= {"January","February","March","April","May","June","July","August","September","October","November","December"};
		if(n<=12)
			System.out.println(s[n-1]);
		else
			System.out.println("Invalid month number");
	}
}
