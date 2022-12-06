import java.util.*;
public class PrimeNumberEx 
{
    static int countPrimeNumber(int x)
    {
    	int count=0;
    	do 
    	{
    		int r=x%10;
    		if(r==1||r==2||r==3||r==5||r==7)
    			count++;
    		x=x/10;
    	}
    	while(x!=0);
    	return count;
    }
	public static void main(String[] args) 
	{
		Scanner ob=new Scanner(System.in);
		System.out.println("Enter the number:");
		int n=ob.nextInt();
		int rs=countPrimeNumber(n);
		System.out.println("No of Prime number is "+rs);
	}
}
