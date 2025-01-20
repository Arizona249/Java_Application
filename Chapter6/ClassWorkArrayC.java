import java.util.Scanner;
public class ClassWorkArrayC
{
	public static void main(String[]args)
	{
		Scanner scan=new Scanner(System.in);
		int num[]=new int[10];
		int sum=0;
		int sum2=0;
		int result=0;
		
		for(int i=0; i<10; i++)
		{
			System.out.print("Enter number: ");
			num[i]=scan.nextInt();
			
			if(i>=1&&i<=5)
			{
			sum+=num[i];
			System.out.print(num[i]);
			}
			else if(i>=6&&i<=8)
			{
				sum2+=num[i];
				System.out.print(num[i]);
			}
		}
		result =sum-sum2;
		System.out.printf("The sum total of all the numbers: %d",result);
		
	}
}