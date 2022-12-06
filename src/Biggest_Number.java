import java.util.*;
public class Biggest_Number 
{
	public static void main(String[] args) 
	{
		Scanner ob=new Scanner(System.in);
		System.out.println("Enter 3 number:");
		int a=ob.nextInt();
		int b=ob.nextInt();
		int c=ob.nextInt();
		int big=a;
		if(b>big)
			big=b;
		if(c>big)
			big=c;
		System.out.println("The biggest number is "+big);	
	}
}
