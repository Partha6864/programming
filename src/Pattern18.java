import java.util.Scanner;
public class Pattern18
{
	public static void main(String[] args) 
	{
		Scanner ob=new Scanner(System.in);
		System.out.print("Enter the number:");
		int n=ob.nextInt();
		for(int i=n;i>=1;i--)
		{
			for(int j=i;j<=n;j++)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}
}
