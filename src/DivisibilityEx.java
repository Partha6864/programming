import java.util.Scanner;
public class DivisibilityEx 
{
	public static void main(String[] args) 
	{
		Scanner ob=new Scanner(System.in);
		System.out.print("Enter the number:");
		int n=ob.nextInt();
		if(n%3==0&&n%5==0)
			System.out.println("Sanju Weeds Geeta");
		else if(n%3==0)
			System.out.println("Sanju Love Geeta");
		else if(n%5==0)
			System.out.println("Geeta Love Sanju");
		else
			System.out.println("Breakup");
	}

}
