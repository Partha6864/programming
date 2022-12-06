import java.util.Scanner;
public class DeceriumNumber 
{
	static int countDigits(int n)
	{
		int count=0;
		do {
			count++;
			n=n/10;
		}while(n!=0);
		return count;
	}
	static int pow(int n,int p)
	{
		int prod=1;
		while(p>0)
		{
			prod=prod*n;
			p--;
		}
		return prod;
	}
    static boolean isDecerium(int x)
    {
    	int sum=0,temp=x;
    	int dc=countDigits(x);
    	do {
    		int d=x%10;
    		sum=sum+pow(d,dc);
    		dc--;
    		x=x/10;
    	}while(x!=0);
    	return sum==temp;
    }
	public static void main(String[] args) 
	{
		Scanner ob=new Scanner(System.in);
		System.out.println("Enter the number:");
		int n=ob.nextInt();
		boolean rs=isDecerium(n);
		if(rs==true)
		    System.out.println("Number is Decerium Number");
		else
			System.out.println("Number is not Decerium Number");

	}

}
