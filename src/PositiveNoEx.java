import java.util.*;
public class PositiveNoEx 
{
	public static void main(String[] args) 
	{
		Scanner ob=new Scanner(System.in);
		System.out.println("Enter the number:");
		int num=ob.nextInt();
		if(num<0)
		{
			num=num*-1;
			System.out.println("Entered no is "+num);
		}
		else
		{
			System.out.println("Entered no is "+num);
		}
	}

}
