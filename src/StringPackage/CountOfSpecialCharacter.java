package StringPackage;
import java.util.*;
public class CountOfSpecialCharacter
{
	public static void main(String[] args) 
	{
		Scanner ob=new Scanner(System.in);
		System.out.println("Enter the String:");
		String st=ob.nextLine();
		int spc=0;
		for(int i=0;i<st.length();i++)
		{
			char ch=st.charAt(i);
			if(ch>='A'&&ch<='Z'||ch>='a'&&ch<='z'||ch>='0'&&ch<='9')
				continue;
			else
				spc++;
		}
		System.out.println("No of Special Characters:"+spc);
	}
}
