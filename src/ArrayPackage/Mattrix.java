package ArrayPackage;
import java.util.*;
public class Mattrix 
{
	public static void main(String[] args) 
	{
		Scanner ob=new Scanner(System.in);
		System.out.println("Enter the rows and columns:");
		int row=ob.nextInt();
		int col=ob.nextInt();
		int mat[][]=new int[row][col];
		System.out.println("Enter "+row*col+" elements:");
		for(int i=0;i<mat.length;i++)
		{
			for(int j=0;j<mat[i].length;j++)
			{
				mat[i][j]=ob.nextInt();
			}
		}
		System.out.println("Entered Matrix is:");
		for(int i=0;i<mat.length;i++)
		{
			for(int j=0;j<mat[i].length;j++)
			{
				System.out.print(mat[i][j]+" ");
			}
			System.out.println();
		}
	}

}
