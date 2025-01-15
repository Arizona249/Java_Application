import java.util.Random;
import java.util.Scanner;
public class ClassWork1{
	public static void main(String[]args){
		Random random=new Random();
		Scanner scan=new Scanner(System.in);
		int min;
		int max;
        System.out.print("Enter upper limit: ");
		max=scan.nextInt();
		
		if(max==0){
			System.out.print("number must be greater than zero");
		}
		else{
			int randnum=random.nextInt(max) +1;
			System.out.printf("Generate a Random number from 0 to %d is: %d%n",max,randnum);
		}
		// System.out.print("Enter lower limit: ");
		// min=scan.nextInt();
		
		// int randomNum =min+(max-min)*random.nextInt(max,min);
		
		// System.out.printf("The random number is: %d",randomNum);
	}
}