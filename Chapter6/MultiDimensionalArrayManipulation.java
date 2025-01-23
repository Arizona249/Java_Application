public class MultiDimensionalArrayManipulation
{
	public static void main(String[]args)
	{
		int[][]numbers={{3,4,3,2,1,5},{4,3,2,4,5,5}};
		int sum=0;
		
		for(int row=0;row<2;row++)
		{
			for(int col=0;col<5;col++)
			{
				sum+=numbers[row][col];
			}
		}
		System.out.printf("The total numbers are %d",sum);
	}
}