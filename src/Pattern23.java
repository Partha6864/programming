import java.util.*;
public class Pattern23 
{
	public static void main(String[] args) 
	{
		Scanner ob=new Scanner(System.in);
		System.out.print("Enter the value:");
		int n=ob.nextInt();
		for(int i=1;i<=n;i++)
		{
			for(int k=1;k<=n-i;k++)
			{
				System.out.print(" ");
			}
				for(int j=1;j<=2*i-1;j++)
				{
					System.out.print(j%2);
				}
				System.out.println();
			}
	}
}
