import java.util.Scanner;
class Biggest
{
public static void main(String[] args) 
{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number ");
		int n=sc.nextInt();
		int big=n%10;
		while(n!=0)
		{
			int d=n%10;
			if(d>big)
			big=d;
			n=n/10;
		}
		System.out.println("Biggest digit is "+big);
	}
}
