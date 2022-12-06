package StringPackage;
import java.util.*;
public class CountUpperAndLowerCase 
{
	public static void main(String[] args) 
	{
		Scanner ob=new Scanner(System.in);
		System.out.println("Enter the String:");
		String st=ob.nextLine();
		int uc=0,lc=0;
		for(int i=0;i<st.length();i++)
		{
			char ch=st.charAt(i);
			if(ch>='A'&&ch<='Z')
				uc++;
			else if(ch>='a'&&ch<='z')
				lc++;
		}
		System.out.println("No of upper case:"+uc);
		System.out.println("No of lower case:"+lc);
	}
}
