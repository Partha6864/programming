
public class Employee extends Human 
{
   String empid;
   String designation;
   Employee(int age,String name,String empid,String designation)
   {
	   super(age,name);
	   this.empid=empid;
	   this.designation=designation;
   }
   void printEmployee()
   {
	   System.out.println("Emloyee name is "+name);
	   System.out.println("Employee id is "+empid);
	   System.out.println("Employee age is "+age);
	   System.out.println("Employee designation is "+designation);
   }
}
