import java.util.Scanner;
public class SwitchLoop{
	public static void main(String[]args){
	SwitchLoop.Daysoftheweek();	
	}
	public static void Daysoftheweek(){
		int num;
		Scanner scan =new Scanner(System.in);
		while(true){
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
				 continue;
		
		

		}
		break;
	}
	}
}
