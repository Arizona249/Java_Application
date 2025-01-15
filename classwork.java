import java.util.Random;
import java.util.Scanner;
public class ClassWork{
	public static void main(String[]args){
		Random random=new Random();
		Scanner scan=new Scanner(System.in);
		int min;
		int max;
        System.out.print("Enter upper limit: ");
		max=scan.nextInt();
		
		System.out.print("Enter lower limit: ");
		min=scan.nextInt();
		
		int randomNum =min+(max-min)*random.nextInt();
		
		System.out.printf("The random number is: %d",randomNum);
	}
}