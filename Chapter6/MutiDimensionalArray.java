import java.util.Scanner;
public class MutiDimensionalArray
{
	public static void main(String[]args)
	{
		Scanner scan=new Scanner(System.in);
		int[][] numbers={{3,4,5},{4,5,6,},{8,9,0}};
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.printf("Element at index [%d] [%d] = %d%n",i,j,numbers[i][j]);
			}
		}
	}
}