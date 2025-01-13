import java.util.Scanner;
public class SwitchLoop{
	public static void main(String[]args){
		int num;
		Scanner scan =new Scanner(System.in);
		System.out.print("Enter a number of the weak: ");
		num=scan.nextInt();
		switch(num){
			case 1:
			  System.out.print("Sunday");
            break;
			case 2:
			  System.out.print("Monday");
            break;
			case 3:
			  System.out.print("Tuesday");
            break;	
			case 4:
			  System.out.print("Wednesday");
            break;	
			case 5:
			  System.out.print("Thursday");
            break;	
			case 6:
			  System.out.print("Friday");
            break;	
			case 7:
			  System.out.print("Saturday");
            break;
            default:
               ("Enter a valid number: ");			

		}
		
	}
	// while(true){
		
	// }
}