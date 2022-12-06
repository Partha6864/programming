import java.util.*;
public class HappyNumberEx 
{
    static boolean isHappyNumber(int n)
    {
    	while(n>9)
    	{
    		n=sumofsqDigits(n);
    	}
    	return (n==1||n==7);
    }
    static int sumofsqDigits(int x)
    {
    	int sum=0;
    	do {
    		int d=x%10;
    		sum=sum+d*d;
    		x=x/10;
    	}while(x!=0);
    	return sum;
    }
	public static void main(String[] args) 
	{
		Scanner ob=new Scanner(System.in);
		System.out.println("Enter the number:");
		int n=ob.nextInt();
		boolean rs=isHappyNumber(n);
		if(rs==true)
		    System.out.println("Number is Happy Number");
		else
			System.out.println("Number is not Happy Number");
	}

}
