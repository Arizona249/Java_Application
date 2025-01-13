import java.util.Scanner;
public class doWhileloop{
	public static void main(String[]args){
		Scanner scan=new Scanner(System.in);
		
		int score;
		int sumofscore=0;
		double average;
		int i=1;
		
		do{
			System.out.print("Enter score:");
			score=scan.nextInt();
			
			sumofscore+=score;
			i++;
		}while(i<=10);
		average=(double)sumofscore/10;
		System.out.print(average);
	}
}
		