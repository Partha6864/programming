import java.util.*;
public class Circle 
{
	public static void main(String[] args) 
	{
		Scanner ob=new Scanner(System.in);
		System.out.println("Enter the radius:");
		float radius=ob.nextInt();
		double area,circumference;
		area=3.14*radius*radius;
		circumference=2*3.14*radius;
		System.out.println("Area of a circle is "+area);
		System.out.println("Circumference of a circle is "+circumference);
	}

}
