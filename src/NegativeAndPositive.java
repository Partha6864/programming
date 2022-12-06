import java.util.Scanner;
public class NegativeAndPositive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner ob=new Scanner(System.in);
    		 System.out.println("Enter the number:");
     int n=ob.nextInt();
     if(n>0)
     {
    	 System.out.println(n+" is a Positive number");
     }
     else if(n<0)
     {
    	 System.out.println(n+" is a Negative number");
     }
     else
     {
    	 System.out.println(0);
     }
	}

}
