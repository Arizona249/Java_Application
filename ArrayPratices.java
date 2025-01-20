import java.util.Scanner;
public class ArrayPratices{
	public static void main(String[]args){
		Scanner scan=new Scanner(System.in);
		
			String userName[]=new String[5];
			int userAge[]=new int[5];
		for(int i=0; i<5;i++){
			System.out.print("Enter name: ");
			userName[i]=scan.nextLine();
			System.out.print("Enter age: ");
			userAge[i]=scan.nextInt();
			scan.nextLine();
		}
		for(int i=0; i<5;i++){
			System.out.printf("%s you are %d years old%n",userName[i],userAge[i]);
		}
	}
}
// int numbers[]={10,20,30,40,50};
		// for(int i=0; i<5; i++){
			// System.out.printf("The Numbers in the %d position of the array is = %d%n",i,numbers[i]);
		// }