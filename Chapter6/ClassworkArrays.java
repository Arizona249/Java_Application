import java.util.Scanner;
public class ClassworkArrays
{
	public static void main(String[]args)
	{
		//this would pick specfically the 2,6,7,and 9th number from the array ;
		Scanner scan=new Scanner(System.in);
		int i;
		int sum2=0;
		int sum=0;
		int subtractionResult=0;
		int num[]=new int[10];
		for(i=0; i<10; i++)
		{
			System.out.print("Enter number: ");
			num[i]=scan.nextInt();
			if(i==1)
			{
				sum+=num[i];
			}
			else if(i==5)
			{
			  sum+=num[i];
			}
			 else if(i==6)
			 {		
				sum2+=num[i];
			}
			else if(i==8)
			{
				sum2+=num[i];
			}
					
			subtractionResult=sum-sum2;
		}
		System.out.print(subtractionResult);
	}
}
