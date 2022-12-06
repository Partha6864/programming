import java.util.*;
public class Pipe 
{
	public static void main(String[] args) 
	{
		Scanner ob=new Scanner(System.in);
		System.out.println("Enter length of a pipe in centimetre:");
		int cm=ob.nextInt();
		double inch,feet,metre;
		inch=0.3937*cm;
		feet=0.328*cm;
		metre=0.01*cm;
		System.out.println("Length of the pipe in inch "+inch);
		System.out.println("Length of the pipe in foot "+feet);
		System.out.println("Length of the pipe in metre "+metre);
	}

}
