import java.util.Scanner;
public class VotersCheck{
	public static void main(String[]args){
		// Scanner scan=new Scanner(System.in);
		// int age;
		// System.out.print("Enter age to check eligibilty: ");
		// age=scan.nextInt();
		// if(age>=18)
			// System.out.print("You are eligible");
		// else if(age<18&& age>0){
			// int waitTime =18-age;
			// System.out.printf("You are not eligible come back in the next %d years",waitTime);			
		// }
		// greetingMsg();
		perimeterOrArea();

	}
	public static void perimeterOrArea(){
		Scanner scann=new Scanner(System.in);
		System.out.println("******options******");
		System.out.println("Choose 1 to find area of rectangle");
		System.out.print("Choose 2 to find perimeter of rectangle: ");
		int option=scann.nextInt();
		
		switch(option){
			case 1:
				System.out.print("Enter length of rectangle: ");
				double length=scann.nextDouble();
				System.out.print("Enter Width of rectangle: ");
				double width=scann.nextDouble();
				double area=length*width;
				System.out.printf("The area is: %.2f",area);
			break;	
			case 2:
				System.out.print("Enter length of rectangle: ");
				double length2=scann.nextDouble();
				System.out.print("Enter Width of rectangle: ");
				double width2=scann.nextDouble();
				double perimeter=2*(length2+width2);
				System.out.printf("The perimeter is: %.2f",perimeter);
			break;
			default:
				System.out.print("Invalid Input");
		}
	}
	
	
}









// public static void greetingMsg(){
		// Scanner scan=new Scanner(System.in);
		// int age;
		// String name;
		// boolean checker=true;
		// while(checker){
		// System.out.print("Enter name: ");
		// name=scan.nextLine();
		// System.out.print("Enter age: ");
		// age=scan.nextInt();
		// scan.nextLine();
		
		// if(age>0){
			// int ageInFiveYears =age + 5;
			// System.out.printf("Hello %s you would be %d years old in the next Five years",name,ageInFiveYears);
			// System.out.println();
		// }
		// else{
			// System.out.print("invalid input");
		// }	
		// System.out.print("Do you want to check another age(yes/no): ");
		// String reply=scan.nextLine();
		// checker=reply.equalsIgnoreCase("yes");
		// }
	// }		
















// import java.util.Scanner;

// public class VotersCheck {
    // public static void main(String[] args) {
        // Scanner scan = new Scanner(System.in);
        // boolean continueChecking = true;

        // while (continueChecking) {
            // System.out.print("Enter age to check eligibility: ");
            // int age = scan.nextInt();

            // if (age < 0) {
                // System.out.println("Age cannot be negative.");
            // } else if (age >= 18) {
                // System.out.println("You are eligible to vote.");
            // } else {
                // int waitTime = 18 - age;
                // System.out.printf("You are not eligible to vote. Come back in %d years.%n", waitTime);
            // }

            // System.out.print("Do you want to check another age? (yes/no): ");
            // String response = scan.next();

            // continueChecking = response.equalsIgnoreCase("yes");
        // }

        // scan.close();
    // }
// }
