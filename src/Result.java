import java.util.*;
public class Result 
{
	public static void main(String[] args) 
	{
		Scanner ob=new Scanner(System.in);
		System.out.println("Enter 4 subject marks:");
		int p=ob.nextInt();
		int c=ob.nextInt();
		int m=ob.nextInt();
		int b=ob.nextInt();
		int total=p+c+m+b;
		double percentage=total/4.0;
		if(percentage>=85)
			System.out.println("Distinction result");
		else if(percentage>=60)
			System.out.println("1st class result");
		else if(percentage>=50)
			System.out.println("2nd class result");
		else if(percentage>=40)
			System.out.println("3rd class result");
		else
		{
			if(p>=35 && c>=35 && m>=35 && b>=35)
				System.out.println("Result Pass");
			else
				System.out.println("Result Fail");
		}
	}
}
