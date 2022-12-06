import java.util.*;
public class DateEx 
{
	static boolean isValidDate(int d,int m,int y)
	{
		if(d<1 || d>31 || m<1 || m>12 || y<1)
			return false;
		else if((m==4 || m==6 || m==9 || m==11) && d>30)
			return false;
		else if(m==2 && d>29)
			return false;
		else if(!(y%4==0 && y%100!=0 || y%400==0) && m==2 && d>28)
			return false;
		else
			return true;
	}
	public static void main(String[] args) 
	{
		Scanner ob=new Scanner(System.in);
		System.out.println("Enter the date(dd mm yyyy):");
		int d=ob.nextInt();
		int m=ob.nextInt();
		int y=ob.nextInt();
		boolean rs=isValidDate(d,m,y);
		if(rs==true)
			System.out.println("Date is valid");
		else
			System.out.println("Date is not valid");
	}

}
