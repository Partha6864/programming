import java.util.*;
public class Divisibility 
{
	public static void main(String[] args) 
	{
		Scanner ob=new Scanner(System.in);
		System.out.println("Enter the number:");
		int num=ob.nextInt();
		if(num%4==0 && num%3==0 && num%5==0)
			System.out.println(num+" is divisible");
		else
			System.out.println(num+" is not divisible");
		/*if(num%4==0 || num%3==0 || num%5==0)
			System.out.println(num+" is divisible");
		else
			System.out.println(num+" is not divisible");*/
	}
}
