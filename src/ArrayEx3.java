
public class ArrayEx3 
{

	public static void main(String[] args) 
	{
		int a[][]= {{12,13,15},{17,12,10},{50,20,35},{14,25,27}};
		System.out.println("Printing The Array");
		for(int i=0;i<4;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.print(" "+a[i][j]+" ");
			}
			System.out.println();
		}
	}

}
