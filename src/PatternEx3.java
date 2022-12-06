import java.util.*;
public class PatternEx3 
{
	public static void main(String[] args) 
	{
		Scanner ob=new Scanner(System.in);
		System.out.println("Enter the value:");
		int n=ob.nextInt();
		int i,j,m;
		for(i=1;i<=n;i++)
		{
			for(j=1;j<=n;j++)
			{
				m=i<j?i:j;
				System.out.print(m+" ");
			}
			for(j=n;j>=1;j--)
			{
				m=i<j?i:j;
				System.out.print(m+" ");
			}
			System.out.println();
		}
		for(i=n;i>=1;i--)
		{
			for(j=1;j<=n;j++)
			{
				m=i<j?i:j;
				System.out.print(m+" ");
			}
			for(j=n;j>=1;j--)
			{
				m=i<j?i:j;
				System.out.print(m+" ");
			}
			System.out.println();
		}
	}
}
