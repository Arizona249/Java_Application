import java.util.Scanner;
public class EnhancedForLoopManipulation
{
	public static void main(String[]aa)
	{
		int pro=1;
		int x,y;// would this work 
		Scanner scan=new Scanner(System.in);
		int []numbers=new int[10];//and this would this work;s
		for(int i=0;i<10;i++)
		{
			System.out.print("Enter number: ");
			numbers[i]=scan.nextInt();
			
			pro*=numbers[i];
			
		}
		System.out.printf("The product of all the numbers is: %d",pro);
		
	}
}