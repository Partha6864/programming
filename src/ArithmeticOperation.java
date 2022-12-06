import java.util.*;
public class ArithmeticOperation 
{
	public static void main(String[] args) 
	{
		Scanner ob=new Scanner(System.in);
		System.out.println("Enter 1st number:");
		int num1=ob.nextInt();
		System.out.println("Enter 2nd number:");
		int num2=ob.nextInt();
		int result=num1+num2;
		System.out.println("Sum of 2 number is "+result);
		result=num1-num2;
		System.out.println("Subtraction of 2 number is "+result);
		result=num1*num2;
		System.out.println("Multiplication of 2 number is "+result);
		result=num1/num2;
		System.out.println("Division of 2 number is "+result);
		result=num1%num2;
		System.out.println("Remainder after division of 2 number is "+result);
	}

}
