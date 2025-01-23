import java.util.Scanner;
public class Pratice
{
	public static void main(String[]args)
	{
		int rows=0;
		int col=0;
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter total number: ");
		int num=scan.nextInt();
		int i=10;
		while(i>1)
		{
			int result=num/i;
			if(num%i==0&&i>2&&i<10)
			{
				rows=result;
				col=i;
				break;	
			}
			i--;
		}
		System.out.printf("Row= %d%ncol= %d%n",rows,col);
		int[][]numbers=new int[rows][col];
		
		for(int b=0;b<rows;b++)
		{
			for(int j=0;j<col;j++)
			{
				System.out.print("Enter numbers: ");
				numbers[b][j]=scan.nextInt();
			}
		}
		
		
		for(int b=0;b<rows;b++)
		{
			for(int j=0;j<col;j++)
			{
				System.out.printf("Element at position[%d][%d]=%d%n",b,j,numbers[b][j]);
			}
			System.out.println();
		}
	}
}