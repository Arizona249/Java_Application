/* while loop
for loop
to...while loop */

import java.util.Scanner;
public class Forloop{
	public static void main(String[]args){
		Scanner scan= new Scanner(System.in);
		int score;
		int sumofscore = 0;
		double average;
		
		for(int i =1; i<=10;i++){
		System.out.print("Enter score: ");
		score=scan.nextInt();
		
		sumofscore += score;
		}
		average=(double)sumofscore/10;
		System.out.printf("The score average is %f",average);
		
	}
}