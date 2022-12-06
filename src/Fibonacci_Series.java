import java.util.Scanner;
class Fibonacci_Series
{  
public static void main(String args[])  
{    
 int n1=0;
 int n2=1;
 int n3;
 Scanner ob=new Scanner(System.in);
 System.out.print("Enter the number:");
 int count=ob.nextInt();    
 System.out.print(n1+" "+n2);    
    
 for(int i=3;i<=count;i++)  
 {    
  n3=n1+n2;    
  System.out.print(" "+n3);    
  n1=n2;    
  n2=n3;    
 }    
}
}