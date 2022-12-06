import java.util.*;
public class Strong_Number 
{
	public static void main(String[] args) 
	{
		Scanner ob=new Scanner(System.in);
		System.out.println("Enter the number:");
		int n=ob.nextInt();
		int num=n;
		int sum=0;
		int i,p,r;
		while(n>0)
		{
			i=1;
			p=1;
			r=n%10;
			while(i<=r)
			{
				p=p*i;
				i++;
			}
			sum=sum+p;
			n=n/10;
		}
		if(sum==num)
			System.out.println("It is a strong number");
		else
			System.out.println("It is not a strong number");
	}
}
