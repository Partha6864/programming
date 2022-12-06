import java.util.Scanner;
class PrimeNumber
{
   public static void main(String[]args)
   {
     
      Scanner ob = new Scanner(System.in); 
      System.out.print("Enter a Number:");
     int  n=ob.nextInt();
     int count=0;
     while(n>0)
      {
    	  int r=n%10;
    	  if(r==1||r==2||r==3||r==5||r==7)
  			count++;
    	  n=n/10;
      }
      System.out.println("No of Prime number is "+count);
   }
}