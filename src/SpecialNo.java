import java.util.Scanner;
public class SpecialNo 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
      Scanner ob=new Scanner(System.in);
      System.out.println("Enter the number:");
      int num=ob.nextInt();
      int a=num/10;
      int b=num%10;
      int sum=a+b+a*b;
      if(num==sum)
      {
    	  System.out.println(num+" is a special number");
      }
      else
      {
    	  System.out.println(num+" is not a special number");
      }
	}

}
