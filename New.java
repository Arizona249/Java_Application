 import java.util.Scanner;
public class New{
	public static void main(String[]args){
		Scanner Userinput=new Scanner(System.in);
		
		int num;
		int count=0;
		int sum=0;
		String aha;
		int i=1;
		System.out.print("Enter name:");
		aha=Userinput.nextLine();
		while(i<=5){
		
			System.out.print("Enter any number: ");
			num=Userinput.nextInt();
			if(num%2==0)
			     count++;
			else
				sum+=num;
				i++;
		}
      	System.out.printf(aha+" No of even numbers: %d%n",count);
		System.out.print("Sum of odd numbers: "+sum);
	}
}