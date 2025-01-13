import java.util.Scanner;
public class Refresh{
	public static void main(String[]args){
		Refresh.worker();
		
	}
	public static void worker(){
		Scanner Scan=new Scanner(System.in);
		char symbol;
		int num1;
		int num2;
		
		System.out.print("Enter arthemtic symbol: ");
		symbol=Scan.next().charAt(0);
		switch(symbol){
			case '/':
				System.out.print("Enter dividend(First number): ");
				num1=Scan.nextInt();
				System.out.print("Enter divisor(Second number): ");
				num2=Scan.nextInt();
				double result=num1/num2;
				System.out.printf("The quotient is %.2f: ",result);
				
			
			case '*':
				System.out.print("Enter multiplicand(First number): ");
				num1=Scan.nextInt();
				System.out.print("Enter multiplier(Second number): ");
				num2=Scan.nextInt();
				result=num1*num2;
				System.out.printf("The product is %.2f: ",result);
		}
			
		
	}
}