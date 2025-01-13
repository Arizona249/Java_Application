import java.util.Scanner;

public class SentinelLoop{
	public static void main(String[] args){
		 Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter numbers to sum(enter -1 to stop):");
		
		int sum=0;
		int number;
		// Sentinel value is -1
		while(true){
			System.out.print("Enter number:");
			number=scan.nextInt();
			if(number==-1){
			 break;
			}
			sum+=number;
		}
		System.out.printf("The total sum is:%d",sum);
		
		scan.close(); 
		// int sum=4;
		// System.out.print(sum++);
	}
}