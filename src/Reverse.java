import java.util.Scanner;
public class Reverse 
{
	static int reverse(int x)
	{
		int rev=0;
		do {
			int d=x%10;
			rev=rev*10+d;
			x=x/10;
		}
		while(x!=0);
		return rev;
	}
	public static void main(String[] args) 
	{
		Scanner ob=new Scanner(System.in);
		System.out.println("Enter the number:");
		int n=ob.nextInt();
		int rs=reverse(n);
	    System.out.println("Reverse of "+n+" is "+rs);
	}

}
