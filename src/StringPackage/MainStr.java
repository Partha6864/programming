package StringPackage;

public class MainStr 
{
	public static void main(String[] args) 
	{
		String st="Jspider and Qspider";
		System.out.println(st.length());
		String st1="Ramesh";
		String st2=new String("Ramesh");
		System.out.println(st2);
		char ch1=st1.charAt(0);
		System.out.println(ch1);
		char ch2=st1.charAt(5);
		System.out.println(ch2);
		for(int i=0;i<st1.length();i++)
			System.out.println(i+" -> "+st1.charAt(i));
		
		
		
		
		String st3="Qspiders";
		System.out.println(st3.indexOf('a'));
		System.out.println(st3.indexOf('s'));
		System.out.println(st3.indexOf('q'));
		System.out.println(st3.indexOf('e'));
		System.out.println(st3.lastIndexOf('a'));
	}
}
