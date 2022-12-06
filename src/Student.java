
public class Student extends Human
{
   String sid;
   String stream;
   Student(String sid,String stream,String name,int age)
   {
	   super(age,name);
	   this.sid=sid;
	   this.stream=stream;
   }
   void printStudent()
   {
	   System.out.println("Student id is "+sid);
	   System.out.println("Student name is "+name);
	   System.out.println("Student age is "+age);
	   System.out.println("Student stream is "+stream);
   }
}
