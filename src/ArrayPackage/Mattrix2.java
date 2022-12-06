package ArrayPackage;
import java.util.*;
public class Mattrix2 
{
	public static void main(String[] args) 
	{
        MattrixOperation mt=new MattrixOperation();
        int x[][]=mt.readMat();
        System.out.println("User Entered Mattrix:");
        mt.displayMat(x);
        System.out.println("Biggest Element is:"+mt.getBiggest(x));
        System.out.println("Sum of matrix element is:"+mt.sumOfMat(x));
        int c[]=mt.countOfEO(x);
        System.out.println("No of even no:"+c[0]);
        System.out.println("No of odd no:"+c[1]);
	}
}
