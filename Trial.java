import java.util.Scanner;
public class Trial{
	public static void main(String[]args){
		Scanner scan=new Scanner(System.in);
		int num1;
		int num2;
		int sum;
		// System.out.print("Enter a number: ");
		// num1=scan.nextInt();
		
		// System.out.print("Enter another number: ");
		// num2=scan.nextInt();
		
		// sum=num1+num2;
		
		// System.out.printf("Sum of the two number is %d%n",sum);
		Trial.trial2();
		
}

public static void trial2(){
	Scanner scan=new Scanner(System.in);
	int count1=0;
	int count2=0;
	int count3=0;
	int bread=2000;	
	int friedEgg=500;
	int choloclateDrink=1500;
	int total=0;
	int response;
	String order1="bread";
	String order2="friedEgg";
	String order3="choloclateDrink";
	String response2;
	int count;
	int total2=0;
	boolean control=true;
			while(control){
				System.out.print("What would you like to order\n 1,2,3 or choose 4 to order all: ");
				response=scan.nextInt();
				scan.nextLine();
				switch(response){
						case 1:
							System.out.print("How many servings??: ");
							count=scan.nextInt();
							count1+=count
							scan.nextLine();
							total+=bread*count;
							order1="bread";
						break;	
						case 2:
							System.out.print("How many servings??: ");
							count=scan.nextInt();
							count2+=count
							scan.nextLine();
							total+=friedEgg*count;
							order2="friedEgg";	
						break;	
						case 3:
							System.out.print("How many servings??: ");
							count=scan.nextInt();
							count3+=count
							scan.nextLine();
							total+=choloclateDrink*count;
							order3="choloclateDrink"; 
						break;
						case 4:		
							total=bread+friedEgg+choloclateDrink;
						break;				
				}
				System.out.print("Do you want to order any order thing(Yes/no): ");
				response2=scan.nextLine();
				total2+=total;
				if(response2.equals("no"))
					control=false;
				else
					continue;
				
				if(response==4)	
					System.out.printf("Orders\t\t\t%s\n\t\t\t%s\n\t\t\t%s%ntotal\t\t\t%d",order1,order2,order3,total);
				else if(response==3)
					System.out.printf("Orders\t\t\t%s%ntotal\t\t\t%d",order3,total,count3);
				else if(response==2)
					System.out.printf("Orders\t\t\t%s%ntotal\t\t\t%d",order2,total,count2);
				else if(response==1)
					System.out.printf("Orders\t\t\t%s%ntotal\t\t\t%d",order1,total,count1);
				else if(response==1&response==2&response==3&response==4)
						System.out.printf("Orders\t\t\t%s\n\t\t\t%s\n\t\t\t%s%ntotal\t\t\t%d",order1,order2,order3,total);

					
			
				
	}
	

		
		
	
}
}
