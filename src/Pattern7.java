import java.util.Scanner;
public class Pattern7
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
				System.out.print((char)(j+64)+" ");
				//ASCII(American Standard Code For Information Interchange) 
				//value of A=65 and a=97;
			}
			System.out.println();
		}
	}
}
