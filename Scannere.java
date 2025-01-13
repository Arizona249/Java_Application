import java.util.Scanner;
public class Scannere{
	public static void main(String[]args){
		Scanner input = new Scanner(System.in);
		int num;
		
		System.out.print("Enter a number:");
		 num=input.nextInt();
		if(num%2==0)
			System.out.println("Number is an even number");
		else if(num%2!=0)
			System.out.println("Number is odd");
		else{
			System.out.println("invalid input please enter another number");
		    System.out.print("Enter a valid number: ");
			num=input.nextInt();
		}
			
	}
}