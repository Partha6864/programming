import java.util.*;
public class FactorialNumber 
{
		static int getFact(int x)
		{
			int fact=1;
			while(x>1)
			{
				fact=fact*x;
				x--;
			}
			return fact;
			/*for(int i=2;i<=x;i++)
			{
				fact=fact*i;
			}
			return fact;*/
		}
     public static void main(String[]arg)
     {
    	 Scanner ob=new Scanner(System.in);
    	 System.out.println("Enter the number:");
    	 int n=ob.nextInt();
    	 int f=getFact(n);
    	 System.out.println("Factorial of "+n+" is "+f);
     }
}
