import java.util.Scanner;
public class M_Array_Pratice
{
	public static void main(String[]args)
	{
		Scanner scan=new Scanner(System.in);
		int[][]numbers=new int[4][5];
		// System.out.print("how many numbers would you like to input: ");
		// int no=scan.nextInt();
		for(int i=0;i<4;i++)
		{
			for(int j=0;j<5;j++)
			{
				System.out.print("Enter numbers: ");
				numbers[i][j]=scan.nextInt();
			}
		}
		for(int[]num:numbers)
		{
			for(int b:num)
			{
				System.out.print(b+" ");
			}
			System.out.println();
		}
	}
}