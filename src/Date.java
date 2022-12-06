import java.util.*;
public class Date 
{
	public static void main(String[] args) 
	{
	Scanner ob=new Scanner(System.in);
	System.out.print("Enter date:");
	int d=ob.nextInt();
	int m=ob.nextInt();
	int y=ob.nextInt();
	if(d<1 || d>31 || m<1 || m>12 || y<1)
		System.out.println("Invalid Date");
	else if((m==4 || m==6 || m==9 || m==11) && d>30)
		System.out.println("Invalid Date");
	else if(m==2 && d>29)
		System.out.println("Invalid Date");
	else if(!(y%4==0 && y%100!=0 || y%400==0) && m==2 && d>28)
		System.out.println("Invalid Date");
	else
		System.out.println("Valid Date");
	}
}