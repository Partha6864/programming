import java.util.*;
public class PassOrFail 
{
	public static void main(String[] args) 
	{
		Scanner ob=new Scanner(System.in);
		System.out.println("Enter 4 subject number:");
		int p=ob.nextInt();
		int c=ob.nextInt();
		int m=ob.nextInt();
		int b=ob.nextInt();
		/*if(p<35||c<35||m<35||b<35)
			System.out.println("Fail");
		else
			System.out.println("Pass");*/
		if(p<35&&c<35&&m<35&&b<35)
			System.out.println("Pass");
		else
			System.out.println("Fail");
	}
}