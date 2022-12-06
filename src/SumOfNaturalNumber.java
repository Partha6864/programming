import java.util.*;
public class SumOfNaturalNumber 
{
	static int SumOfN(int x)
	{
		int sum=0;
		for(int i=1;i<=x;i++)
		{
			sum=sum+i;
		}
		/*while(x>0)
		{
			sum=sum+x;
			x--;
		}*/
		return sum;
	}
	public static void main(String[] args) 
	{
		Scanner ob=new Scanner(System.in);
		System.out.println("Enter the number:");
        int n=ob.nextInt();
        int sn=SumOfN(n);
        System.out.println("Sum Of first"+n+" natural number is "+sn);
	}
}