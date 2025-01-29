class Student
{
	static int check=13;
	int studentID=101;
	 String name="John";
	 int age=18;
	 String gender="Male";
	 
	 
	public void study()
	{
		System.out.printf("Student ID: %d%n",studentID);
		System.out.printf("Student name: %s%n",name);
		System.out.printf("Student age: %d%n",age);
		System.out.printf("Student gender: %s%d%n",gender,check);
		System.out.println("I am learning java");
	}	


	
	
	
 
}
public class DemoStudent
{
	public static void main(String[]args)
		{
			Student student=new Student();
			student.study();
			System.out.print(student.check);
			System.out.print(student.name);

			
		}
}