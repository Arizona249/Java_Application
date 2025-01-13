import java.util.Scanner;
public class Pratices{
	public static void main(String[]args){
		Scanner userInput=new Scanner(System.in);
        int num;
        int sum=0;
        double average=0;
		int count=0;
        
        for(int i=0; i<=10; i++){
			System.out.print("Enter a number: ");
			num=userInput.nextInt();
			sum+=num;
			count++;
		}
        average=sum/10;
		System.out.println(count);
		System.out.println(sum);
        System.out.println((double)average);
	    
	}
}

// int num;
// int sum;
// double average=0;
// int count;
// Scanner userInput=new Scanner(System.in);
// int i=1;
// while(i<=10){
	// System.out.print("Enter a number please: ");
	// num=userInput.nextInt();
	// sum+=num;
	// count++;
	// i++;
// }
// average=sum/10;
// System.out.println(count);
// System.out.println(sum);
// System.out.println((double)average);
// }