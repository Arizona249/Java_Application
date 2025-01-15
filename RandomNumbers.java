import java.util.Random; //step one import the randomclass
public class RandomNumbers{
	public static void main(String[]args){
		Random random= new Random();//creating the object of the Random class
		
		//create a variable to store the random number generated
		int randomNumber=random.nextInt();
		
		//Print randomnumber
		System.out.printf("Random number is: %d%n",randomNumber);
		
		//Generating a random within a range
		int randomNumInRange=random.nextInt(20)+1;//would not include 20unless +1 is added
		
		System.out.printf("Random number in range: %d%n",randomNumInRange);
		
		//Generating a float value random number
		double floatPointNum= random.nextDouble();
		
		//print
		System.out.printf("Random decimal number is: %.2f%n",floatPointNum);
		
		//Generating a float value within a range
		double min=10.0;
		double max=20.0;
		double floatNumInRange=min+(max-min)*random.nextDouble();
		//or
		// double floatNumInRange=random.nextDouble(2);
		
		//print
		System.out.printf("Random float within a range: %f%n",floatNumInRange);
		
		//Generate a random boolean value
		boolean booleanValue=random.nextBoolean();
		//print
		System.out.printf("Random Boolean Value is: %s",booleanValue);
		
	}
}