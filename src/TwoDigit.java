import java.util.*;
public class TwoDigit 
{
	public static void main(String[] args) 
	{
		Scanner ob=new Scanner(System.in);
		System.out.println("Enter the number:");
		int num=ob.nextInt();
		if(num>9&&num<100||num<-9&&num>-100)
			System.out.println(num+" is a Two digit number");
		else
			System.out.println(num+" is not a Two digit number");
	}
}
