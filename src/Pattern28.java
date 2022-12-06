import java.util.Scanner;
public class Pattern28 
{
	public static void main(String[] args) 
	{
		Scanner ob=new Scanner(System.in);
		System.out.print("Enter the value:");
		int n=ob.nextInt();
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				if(i==1||i==n||j==1||j==n||i==j||i+j==n+1)
				    System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}

}
