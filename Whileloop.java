import java.util.Scanner;
public class Whileloop{
	public static void main(String[]args){
		Scanner scan= new Scanner(System.in);
		
		int score;
		int sumofscore=0;
		double average;
		int i=1;
		
		while(i<=10){
			System.out.print("Enter score:");
			score=scan.nextInt();
			
			sumofscore+=score;
			i++;
		}
		average=(double)sumofscore/10;
		System.out.print("your average is "+ average);
		
	}
}