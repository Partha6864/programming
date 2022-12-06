import java.util.*;
public class Rectangle 
{
	public static void main(String[] args) 
	{
		Scanner ob=new Scanner(System.in);
		System.out.print("Enter the length of rectangle:");
		double length=ob.nextFloat();
		System.out.print("Enter the breadth of rectangle:");
		double breadth=ob.nextFloat();
		double area,perimeter,diagonal;
		area=length*breadth;
		perimeter=2*(length+breadth);
		diagonal=Math.sqrt((length*length)+(breadth*breadth));
		System.out.println("Area of the rectangle "+area);
		System.out.println("Parameter of the rectangle "+perimeter);
		System.out.println("Diagonal of the rectangle "+diagonal);
	}

}
