import java.util.*;
public class Temperature 
{
	public static void main(String[] args) 
	{
		Scanner ob=new Scanner(System.in);
		System.out.println("Temperature in celcius:");
		int celsius=ob.nextInt();
		double fahrenheit,kelvin;
		fahrenheit=32+(celsius*1.8);
		kelvin=273.15+celsius;
		System.out.println("Temperature in Fahrenheit "+fahrenheit);
		System.out.println("Temperature in Kelvin "+kelvin);
	}

}
