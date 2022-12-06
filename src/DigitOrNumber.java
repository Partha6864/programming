import java.applet.*;
import java.util.Scanner;
public class DigitOrNumber 
{
	public static void main(String[] args) 
	{
		Scanner ob=new Scanner(System.in);
		System.out.println("Enter the number:");
		int num=ob.nextInt();
		if(num>=-9&&num<=9)
			System.out.println("Digit");
		else
			System.out.println("Number");
	}

}
