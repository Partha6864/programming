package ArrayPackage;

public class ArrayEx6 
{
	public static void main(String[] args) 
	{
      String S="India";
      String S1="India";
      System.out.println(S.charAt(0));
      System.out.println(S.charAt(3));
      System.out.println(S==S1);
      System.out.println(S1);
      System.out.println(S.substring(3));
      int i=S.indexOf("a");
      System.out.println(i);
      String sub=S.substring(i);
      System.out.println(sub);
      String sub1=S.substring(1,5);
      System.out.println(sub1);
      String S2="Bengal";
      System.out.println(S==S2);
      String N=new String("Bihar");
      System.out.println(N==S2);
      int I=S.length();
      System.out.println(I);
	}
}
