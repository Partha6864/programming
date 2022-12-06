import java.util.Scanner;
public class Pattern26
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
			int x=i;
				for(int j=1;j<=2*i-1;j++)
				{
					System.out.print(x%2);
					if(j<i)
						x--;
					else
						x++;
				}
				System.out.println();
			}
	}
}
