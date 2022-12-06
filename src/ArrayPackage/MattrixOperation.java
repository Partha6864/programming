package ArrayPackage;
import java.util.*;
public class MattrixOperation
{
    int[][] readMat() 
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
		return mat;
	}
    void displayMat(int mat[][])
    {
		for(int i=0;i<mat.length;i++)
		{
			for(int j=0;j<mat[i].length;j++)
			{
				System.out.print(mat[i][j]+" ");
			}
			System.out.println();
		}
    }
    int getBiggest(int mat[][])
    {
    	int big=mat[0][0];
		for(int i=0;i<mat.length;i++)
		{
			for(int j=0;j<mat[i].length;j++)
			{
				if(mat[i][j]>big)
					big=mat[i][j];
			}
		}
		return big;
    }
    int sumOfMat(int mat[][])
    {
    	int sum=0;
    	for(int i=0;i<mat.length;i++)
		{
			for(int j=0;j<mat[i].length;j++)
			{
				sum=sum+mat[i][j];
			}
		}
    	return sum;
    }
    int[] countOfEO(int mat[][])
    {
    	int ec=0,oc=0;
    	for(int i=0;i<mat.length;i++)
		{
			for(int j=0;j<mat[i].length;j++)
			{
				if(mat[i][j]%2==0)
					ec++;
				else
					oc++;
			}
		}
    	int count[]= {ec,oc};
    	return count;
    }
    int[][] addMat(int a[][],int b[][])
    {
    	if(a.length!=b.length||a[0].length!=b[0].length)
    	{
    		System.out.println("Orde must be same...");
    		return null;
    	}
    	int c[][]=new int[a.length][a[0].length];
    	for(int i=0;i<c.length;i++)
    	{
    		for(int j=0;j<c[i].length;j++)
    		{
    			c[i][j]=a[i][j]+b[i][j];
    		}
    	}
    	return c;
    }
    public int[][] Transpose(int mat[][])
    {
    	int tr[][]=new int[mat[0].length][mat.length];
    	for(int i=0;i<mat.length;i++)
    	{
    		for(int j=0;j<mat[i].length;j++)
    		{
    			tr[i][j]=mat[i][j];
    		}
    	}
    	return tr;
    }
    public void rowReverse(int mat[][])
    {
    	for(int i=0;i<mat.length;i++)
    	{
    		for(int j=0;j<mat[0].length;j++)
    		{
    			int temp=mat[i][j];
    			mat[i][j]=mat[i][mat[0].length-1-j];
    			mat[i][mat[0].length-1-j]=temp;
    		}
    	}
    }
    public void columnReverse(int mat[][])
    {
    	for(int i=0;i<mat.length/2;i++)
    	{
    		for(int j=0;j<mat[0].length;j++)
    		{
    			int temp=mat[i][j];
    			mat[i][j]=mat[mat.length-1-i][j];
    			mat[mat.length-1-i][j]=temp;
    		}
    	}
    }
    public int[][] rotate90right(int mat[][])
    {
    	mat=Transpose(mat);
    	rowReverse(mat);
    	return mat;
    }
    public int[][] rotate90left(int mat[][])
    {
    	mat=Transpose(mat);
    	columnReverse(mat);
    	return mat;
    }
    public int[] rowWiseBiggest(int mat[][])
    {
    	int big[]=new int[mat[0].length];
    	for(int i=0;i<mat[0].length;i++)
    	{
    		big[i]=mat[0][i];
    		for(int j=1;j<mat.length;j++)
    		{
    			if(mat[j][i]>big[i])
    				big[i]=mat[j][i];
    		}
    	}
    	return big;
    }
    public int[] columnWiseBiggest(int mat[][])
    {
    	int big[]=new int[mat[0].length];
    	for(int i=0;i<mat[0].length;i++)
    	{
    		big[i]=mat[0][i];
    		for(int j=1;j<mat.length;j++)
    		{
    			if(mat[j][i]>big[i])
    				big[i]=mat[j][i];
    		}
    	}
    	return big;
    }
    public void diagonalReverse(int mat[][])
    {
    	int n=mat.length-1;
    	for(int i=0;i<mat.length/2;i++)
    	{
    		int temp=mat[i][i];
    		mat[i][i]=mat[n-i][n-i];
    		mat[n-i][n-i]=temp;
    		temp=mat[i][n-i];
    		mat[i][n-i]=mat[n-i][i];
    		mat[n-i][i]=temp;
    	}
    }
    public int[] diagonalWiseBiggest(int mat[][])
    {
    	int n=mat.length-1;
    	int pbig=mat[0][0];
    	int sbig=mat[0][n];
    	for(int i=0;i<mat.length;i++)
    	{
    		if(mat[i][i]>pbig)
    			pbig=mat[i][i];
    		if(mat[i][n-i]>sbig)
    			sbig=mat[i][n-i];
    	}
    	int big[]={pbig,sbig};
    	return big;
    }
}
