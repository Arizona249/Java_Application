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
		while(i<1)
		{
			int result=num/i;
			if(result%i==0)
			{
				rows=i;
				col=result;
			}
			i--;
		}
		System.out.printf("Row= %d%ncol= %d",rows,col);
		int[][]numbers=new int[rows][col];
		
		for(int b=0;b<rows;b++)
		{
			for(int j=0;j<col;j++)
			{
				System.out.printf("Element at position[%d][%d]=[%d][%d]",b,j,numbers[b][j]);
			}
		}
	}
}