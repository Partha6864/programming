package StringPackage;
import java.util.*;
public class CountDigits
{
	public static void main(String[] args) 
	{
		Scanner ob=new Scanner(System.in);
		System.out.println("Enter the String:");
		String st=ob.nextLine();
		int dc=0;
		for(int i=0;i<st.length();i++)
		{
			char ch=st.charAt(i);
			if(ch>='0'&&ch<='9')
				dc++;
		}
		System.out.println("No of digits:"+dc);
	}
}
