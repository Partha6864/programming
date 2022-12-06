import java.util.*;
public class EvenOrOddEx 
{
	public static void main(String[] args) 
	{
		Scanner ob=new Scanner(System.in);
		System.out.println("Enter the number:");
		int num=ob.nextInt();
		String st=(num%2==0)?"Even":"Odd";
		System.out.println(num+" is "+st);
		String s[]= {"Even","Odd"};
		System.out.println(num+" is "+s[num%2]);
		switch(num%2)
		{
		case 0:System.out.println(num+" is Even");
		break;
		case 1:System.out.println(num+" is Odd");
		break;
		}
	}
}
