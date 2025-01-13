// question 1
// write a java program to create a class called bank account with variable account no balance and interest rate provide static methods to get 
// and set the static variable create several bank account object and print there detailes along the variables
// Question 2
// Write a Java program to create a class called constant with a static variable pi initialize to the value of pi....
// Create a method called area to calculate the area of the circle, the radius should be inputted by the user
import java.util.Scanner;

public class CArea{
	static final double pi =3.14;//this is  a static variable final is used to create a variable that is a constant
	static int age=50;//the variable needs to be static when the method is static
	public static void main(String[]args){
		Scanner scan =new Scanner(System.in);
		
		System.out.print("Enter radius:");
		int radius=scan.nextInt();
		
		CArea.Area(radius);
		
	}
	public static void Area(int radius){
		
		
		double area=pi*radius*radius;
		System.out.printf("The area of the circle is %f ",area);
		
		Constants.check();
		
	}
	public static void check(){
		if(age>=18)
			System.out.println("yes,you are an adult");
		else
			System.out.println("you are still a teenager");
	}
}
