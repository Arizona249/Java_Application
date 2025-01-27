import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;
public class Ex6_18
{
	public static void main(String[]args)
	{
		Scanner scan=new Scanner(System.in);
		boolean[]seatsStatus=new boolean[10];
		Arrays.fill(seatsStatus,false);
		int seatNo;
		Arrays.sort(seatsStatus);
		for(int i=1;i<=10;i++)
		{
			System.out.println("Please type 1 for First class ");
			System.out.print("Please type 2 for Economy: ");
			int response=scan.nextInt();
			if(response==1)
			{
				seatNo=i;
				seatsStatus[i-1]=true;
				if(seatNo==6)
				{
					System.out.print("First Class full (Would you like to move to economy(Y/N): ");
					String response2=scan.next();
					if(response2.equalsIgnoreCase("y"))
					{
						int index=Arrays.binarySearch(seatsStatus,4,10,false);
						if(index>0)
						{
							seatNo=index+1;
							System.out.printf("===Boarding Pass===\nSeatNO\t\tClass\n%d\t\tEconomy",seatNo);
							seatsStatus[index]=true;

						}
						else
						{
							System.out.print("All Seats has been Taken");
						}
					}
					else
					{
						System.out.print("Next Flight leaves in 3 Hours");
					}
				}
				else
				{
					System.out.printf("===Boarding Pass===\nSeatNO\t\tClass\n%d\t\tFirst",seatNo);
				}
				
			}
			else
			{
				int index2=Arrays.binarySearch(seatsStatus,4,10,false);
				if(index2>0)
				{
					seatNo=index2+1;
					System.out.printf("===Boarding Pass===\nSeatNO\t\tClass\n%d\t\tEconomy",seatNo);	
				}
				else
				{
					System.out.print("Economy full(would you like to move to Economy(Y/N): ");
					String response3=scan.nextLine();
					if(response3.equalsIgnoreCase("y"))
					{
						int index3=Arrays.binarySearch(seatsStatus,0,5,false);
						if(index3>0)
						{
							seatNo=index3+1;
							System.out.printf("===Boarding Pass===\nSeatNO\t\tClass\n%d\t\tFirstClass",seatNo);

						}
						else
						{
							System.out.println("All seats taken");
						}
						
					}
					else
					{
						System.out.print("Next flight leaves in 3 hours");
					}
				}

			}
			
		}
		
		
	}
}