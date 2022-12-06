import java.util.*;
public class PositiveNo 
{
	static int checkNum(int x)
	{
		int ans=Integer.signum(x);
		return ans;
	}
	public static void main(String[] args) 
	{
	   Scanner ob=new Scanner(System.in);
	   System.out.println("Enter the number:");
	   int num=ob.nextInt();
	   int result=checkNum(num);
	   if(result==0)
	   {
		   System.out.println("Entered number is Zero");
	   }
	   else if(result==1)
	   {
		   System.out.println("Entered number in Positive format");
	   }
	   else
	   {
		   System.out.println("Entered number in Negative format");
	   }
	}

}
