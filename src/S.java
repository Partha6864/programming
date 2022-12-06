import java.util.Scanner;
class S 
{
	public void add()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Press 1 to add 2 Numbers");
		System.out.println("Press 2 to add 3 Numbers");
		System.out.println("Press 3 to add 4 Numbers");
	    int num=sc.nextInt();
		switch(num)
		{
			case 1:{
			        System.out.println("Enter 2 Numbers to be added");
				    int num1=sc.nextInt();
		            int num2=sc.nextInt();
				    int sum=num1+num2;
					System.out.println();
                    System.out.println("sum is :"+sum);
                   }
			        break;
			case 2:{
				    System.out.println("Enter 3 Numbers to be added");
				    int num1=sc.nextInt();
				    int num2=sc.nextInt();
                    int num3=sc.nextInt();
                    int sum=num1+num2+num3;
					System.out.println();
                    System.out.println("sum is :"+sum);
			       }
			        break;
			case 3:{
				    System.out.println("Enter 4 Numbers to be added");
				    int num1=sc.nextInt();
				    int num2=sc.nextInt();
				    int num3=sc.nextInt();
				    int num4=sc.nextInt();
				    int sum=num1+num2+num3+num4;
					System.out.println();
				    System.out.println("sum is :"+sum);
			       }
			        break;
		   default :System.out.println("Invalid Number!!!");
		            break;
		}
		S S1=new S();
		S1.back();
	}
public void back()
	{
	    try (Scanner ob = new Scanner(System.in))
	    {
			System.out.println("Press 1 to Continue");
			System.out.println("Press any Other number to stop");
			int n=ob.nextInt();
			while(n==1)
			{
				S S1=new S();
				S1.add();
			}
			return;
		}
    }
	public static void main(String[]arg)
	{
		S S1=new S();
		S1.add();
	}
}