import java.util.Scanner;
public class Pattern22
{
	public static void main(String[] args) 
	{
		Scanner ob=new Scanner(System.in);
		System.out.print("Enter the number:");
		int n=ob.nextInt();
		for(int i=1;i<=n;i++)
		{
			for(int k=i;k>=1;k--)
			{
				System.out.print(" ");
			}
			for(int j=i;j<=n;j++)
			{
				System.out.print(j);
			}
			System.out.println();
		}
	}
}
