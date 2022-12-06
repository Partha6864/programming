package StringPackage;
import java.util.*;
public class PallindromeString
{
	static boolean isPallindrome(String st)
	{
		int i=0,j=st.length()-1;
		while(i<j)
		{
			if(st.charAt(i)!=st.charAt(j))
				return false;
			i++;
			j--;
		}
		return true;
	}
	public static void main(String[] args) 
	{
		Scanner ob=new Scanner(System.in);
		System.out.println("Enter the String:");
		String st=ob.nextLine();
		boolean rs=isPallindrome(st);
		if(rs==true)
		System.out.println("String is Pallindrome");
		else
		System.out.println("String is not a Pallindrome");

	}
}