
import java.util.Scanner;
public class ArrayEx4 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the row:");
		int r=sc.nextInt();
		System.out.print("Enter the column:");
		int c=sc.nextInt();
		int a[][]=new int[r][c];
		System.out.print("Enter the value:");
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
			for(int i=0;i<r;i++)
			{
				for(int j=0;j<c;j++)
				{
				System.out.print(" "+a[i][j]+" ");
			    }
			 System.out.println();
		}
	}
}
