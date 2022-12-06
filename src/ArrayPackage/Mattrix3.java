package ArrayPackage;

public class Mattrix3 
{
	public static void main(String[] args) 
	{
		MattrixOperation mt=new MattrixOperation();
		int a[][]=mt.readMat();
		mt.displayMat(a);
		int bg[]=mt.rowWiseBiggest(a);
		for(int i=0;i<bg.length;i++)
			System.out.println(i+1+" row Biggest element is "+bg[i]);
	}
}
