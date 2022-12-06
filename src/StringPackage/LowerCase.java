package StringPackage;
import java.util.*;
public class LowerCase
{
	public static void main(String[] args) 
	{
		Scanner ob=new Scanner(System.in);
		System.out.println("Enter the String:");
		String st=ob.nextLine();
		//st=st.toLowerCase();
		//System.out.println(st);
		char ch[]=st.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]>='A'&&ch[i]<='Z')
				ch[i]=(char)(ch[i]+32);
		}
		st=new String(ch);
		System.out.println(st);
	}
}
