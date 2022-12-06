import java.util.*;
public class Currency 
{
	public static void main(String[] args)
	{
		Scanner ob=new Scanner(System.in);
		System.out.println("Enter the amount:");
		int amt=ob.nextInt();
		System.out.println(amt/2000+" 2000RS");
		amt=amt%2000;
		System.out.println(amt/500+" 500RS");
		amt=amt%500;
		System.out.println(amt/200+" 200RS");
		amt=amt%200;
		System.out.println(amt/100+" 100RS");
		amt=amt%100;
		System.out.println(amt/50+" 50RS");
		amt=amt%50;
		System.out.println(amt/20+" 20RS");
		amt=amt%20;
		System.out.println(amt/10+" 10RS");
		amt=amt%10;
		System.out.println(amt/5+" 5RS");
		amt=amt%5;
		System.out.println(amt/2+" 2RS");
		amt=amt%2;
		System.out.println(amt+" 1RS");
	}

}
