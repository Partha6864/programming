import java.util.Scanner;
public class Pallindrome 
{
	static boolean isPallindrome(int x)
	{
		int rev=0,temp=x;
		do {
			int d=x%10;
			rev=rev*10+d;
			x=x/10;
		}
		while(x!=0);
		if(temp==rev)
			return true;
		else
			return false;
	}
	public static void main(String[] args) 
	{
		Scanner ob=new Scanner(System.in);
		System.out.println("Enter the number:");
		int n=ob.nextInt();
		boolean rs=isPallindrome(n);
		if(rs==true)
			System.out.println(n+" is Pallindrome");
		else
			System.out.println(n+" is not Pallindrome");
	}

}
