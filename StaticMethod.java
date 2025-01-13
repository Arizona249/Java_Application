/* divide and conquer is the use of modules to break down large codes into smaller codes or methods through the use of methods into
instead of functions and procedures
Methods are blocks of code that perform specific tasks and can be executed when called 
how to declare a method
the access modifier(public,private,proteced)
the return type(e.g...int,void,float,or any datatype )
The method name (using the same rules that are used for variable e.g main,mainInt)
 parameters(it is opitional and is placed inside the parentheses)
the method body

Syntax for creating a method
returntype,methodname(parameters)
static method belongs to a class where it is created rather than the instance of the class by default it sets the access modifier
to public
1.belongs to the class
2.can be called without an instance
3.cannot accessed by an instance of variable can only access static variable and static method
you cannot create a method inside the main method but outside and called inside the main method
*/
import java.util.Scanner;
public class StaticMethod{
	public static void main(String[]args){	
	 StaticMethod.sum();//invoking the sum method;
	 
	 
	 StaticMethod.divide(90,70);//the argument 
	 System.out.println(StaticMethod.product());//so as to print the returned value
	 
	 
	 Scanner scan=new Scanner(System.in);
	 System.out.print("Enter firstName");
	 String firstName =scan.nextLine();
	 
	 
	 System.out.print("Enter lastname");
	 String lastname=scan.nextLine();
	 System.out.println(StaticMethod.personName(firstName,lastname));
	}
	public static void sum(){		//creation of a static method	
		int x=50;
		int y=30;
		int total=x+y;
		System.out.printf("Sum of the two numbers is %d%n",total);
	}
	public static void divide(int x,int y){//the parameter is called the method signature 
		double total=(double)x/y;
		System.out.printf("the second sum of the two numbers is %.2f%n",total);
		
	}
	public static int product(){
		int x=60;
		int y=10;
		int total;
		return total =x*y;
		// System.out.printf("%d",total);
		
	}
	public static String personName(String firstName,String lastname){
		String fullName=firstName+"  "+lastname;
		return fullName;
		
	}
}