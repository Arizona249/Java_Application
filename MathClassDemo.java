// create a class called maths class demo and use the methods 
import java.util.Scanner;//importing Scanner class
public class MathClassDemo{
	static double x;
	static double y;//Declaration of two static variables
	public static void main(String[]args){//Main method
																							
		Scanner scan=new Scanner(System.in);//creation of the Scanner object
		
		System.out.print("Enter side X: ");//Asking for Userinput
		x=scan.nextDouble();//Accepting USerinput
		
		System.out.print("Enter side Y: ");//Asking for the second Userinput
		y=scan.nextDouble();//Accepting USerinput
		
		
		System.out.println("The square is: "+Math.pow(x,2));//using the Math class and pow method to perform exponential calculations on userinput
		System.out.println("The square is: "+Math.round(x));//using the Math class and round method to round up to the nearest whole number
		
		System.out.println("The squareroot is: "+Math.sqrt(x));//using the Math class and sqrt method to find the squareroot of userinput
		System.out.println("The floor value is: "+Math.floor(x));//using the Math class and floor method to round down the userinput to the nearest integer 
		
		System.out.println("The ceiling value is: "+Math.ceil(x));//using the Math class and ceil method is used to round up the user input to the nearest integer 
		System.out.println("The absolute value is: " + Math.abs(y));//using the Math class and abs method  this returns the absolute value of the user input
		
		
		System.out.print("The hypotenuse of the triangle is: ");
		System.out.print(MathClassDemo.HypotenuseOfATriangle(x,y));//using the print statement to print the result of the Hyptenuse method
	}
	public static double HypotenuseOfATriangle(double x,double y){//creating a static method that returns a doublevalue and takes two double arguments
		double hypotenuse;
		hypotenuse=Math.sqrt((x*x)+(y*y));//calculation of hypotenuse using the values entered by the user as arguments
		return hypotenuse;//used to return the result of the calculation
	}
}
// double z=5.7;
// double w=-10;
// String reply="The hypotenuse is: ";
