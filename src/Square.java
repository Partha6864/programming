import java.util.*;
public class Square 
{

	public static void main(String[] args) 
	{
		Scanner ob=new Scanner(System.in);
		System.out.println("Enter the side of a square:");
		double side=ob.nextFloat();
		double area,perimeter,diagonal;
		area=side*side;
		perimeter=4*side;
		diagonal=Math.sqrt(2)*side;
		System.out.println("Area of a square "+area);
		System.out.println("Perimeter of a square "+perimeter);
		System.out.println("Diagonal of a square "+diagonal);
	}
}
