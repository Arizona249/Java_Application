import java.util.Scanner;
public class Assignment2{
	public static void main(String[]args){
		// Assignment2.milesCalculator();
		// Assignment2.creditLimitCalculator();	
        // Assignment2.salaryCalculator();
		// Assignment2.largestNum();
		// Assignment2.nCounter();
		// Assignment2.smallestNum();
		// Assignment2.productOfOddNum();
		factorialN();	
	}

		

	public static void factorialN(){
		int n;
			long factorial=1L;
			Scanner scan=new Scanner(System.in);
			System.out.print("Enter num to find factorial: ");
			n=scan.nextInt();
			for(int i=n; i>=1; i--){
			factorial*=i;
			}
			System.out.printf("The factorial is %d",factorial);	
}


	 public static void salaryCalculator(){
		Scanner scan=new Scanner(System.in);
		int hourlyRate;
		int workHours;
		int grossPay=0;
		for(int i=1; i<=3; i++){
			System.out.print("Enter hours worked: ");
			workHours=scan.nextInt();
			System.out.print("Enter hourlyRate: ");
			hourlyRate=scan.nextInt();
			if(workHours>40){
				int excessHours=workHours-40;
			    int excessHourlyRate=hourlyRate/2;
				grossPay=40*hourlyRate;
				grossPay+=excessHours*excessHourlyRate;
				System.out.println("Grosspay is : "+grossPay);
			}
			
			else{
				grossPay=workHours*hourlyRate;
				System.out.println("Grosspay is : "+grossPay);
			}
				
			
		}
	 }
	
	public static void milesCalculator(){
		Scanner scan =new Scanner(System.in);
		int totalMiles;
		int totalGallons;
		double combinedmilespergallon=0;
		
		while(true){
			System.out.print("Enter total number of miles driven or -1 to stop: ");
			totalMiles=scan.nextInt();
			
			System.out.print("Enter total number of gallons used or -1 to stop: ");
			totalGallons=scan.nextInt();
			if (totalMiles==-1||totalGallons==-1)
			 break;
           
			double result =(double)totalMiles/totalGallons;
			combinedmilespergallon+=result;
			System.out.println("The miles per gallon is: "+result);
		}
		System.out.printf("The total miles per gallon is: %f%n",combinedmilespergallon);

	}
	
	
	public static void creditLimitCalculator(){
		Scanner scan=new Scanner(System.in);
		 int accNO;
		 int beginningBal;
		 int charges;
		 int credits;
		 int creditLimit;
		 int newBalance=0;
		 
		 System.out.print("Enter account no: ");
		 accNO=scan.nextInt();
		 
		 System.out.print("Enter beginning balance: ");
		 beginningBal=scan.nextInt();
		 
		 System.out.print("Enter charges of items: ");
		 charges=scan.nextInt();
		 
		 System.out.print("Enter credit Limit: ");
		 creditLimit=scan.nextInt();
		 
		 System.out.print("Enter applied credits for the month: ");
		 credits=scan.nextInt();
		 
		 newBalance=(beginningBal+charges-credits);
		 System.out.println("The new balance is: "+newBalance);
		 if(newBalance>creditLimit)
			 System.out.println("Dear customer you have exceeded your credit limit for the month");
		 
	}
	
    public static void salesCommissionCalculator(){
		Scanner scan=new Scanner(System.in);
		double grossSales1=0;
		double grossSales2=0;
		double grossSales3=0;
		double grossSales4=0;
		double item1=239.99;
		double item2=129.75;
		double item3=99.95;
		double item4=350.89;
		double grossSales=0;
		int itemSold;
		double totalEarning=1;
		
		double count;
		while(true){
			System.out.print("Enter item sold(1-4)or -1 to stop: ");
			itemSold=scan.nextInt();
			if(itemSold==-1)
				break;
			switch(itemSold){
				case 1: 
					System.out.print("Enter amount sold: ");
					count=scan.nextInt();
					grossSales1=item1*count;
					break;
					
					
				case 2: 
					System.out.print("Enter amount sold: ");
					count=scan.nextInt();
					grossSales2=item2*count;
					break;
					
					
				case 3: 
					System.out.print("Enter amount sold: ");
					count=scan.nextInt();
					grossSales3=item3*count;
					break;
					
				case 4:
					System.out.print("Enter amount sold: ");
					count=scan.nextInt();
					grossSales4=item4*count;
					break;
				
				default:
					break;	
			}
			grossSales=(grossSales1+grossSales2+grossSales3+grossSales4);
			
		}
		System.out.println(grossSales);
		totalEarning=(double)9/100*grossSales;
		totalEarning+=200;
		System.out.println("Your total earnings are: $"+totalEarning);
		
	}
	
	
	
	
	public static void largestNum(){
	int largest=0;
		int number;
		Scanner scan =new Scanner(System.in);
		for(int counter=1;counter<11;counter++){
		System.out.print("Enter a number: ");
		number=scan.nextInt();
		if (number>largest){
			largest=number;
		}
		}
		System.out.print("The largest number is: "+largest);
	}
	


		public static void nCounter(){
			String n="N";
			String ne="10*N";
			String ned="100*N";
			String nedd="1000*N";
			System.out.printf("%5s %10s %10s %10s\n%n",n,ne,ned,nedd);
			for (int i = 1; i <= 5; i++) {
				System.out.printf("%5d %10d %10d %10d\n",i,i*10,i*100,i*1000);
					}
		}
		
		public static void smallestNum(){
		Scanner scan=new Scanner(System.in);
		int i;
		int num;
		int smallNum=0;
		System.out.print("Enter amount of number you want to enter: ");
		i=scan.nextInt();
		for(int j=1; j<=i; j++){
			System.out.print("Enter num: ");
			num=scan.nextInt();
			if(j==1)
				smallNum=num;
				if(num<smallNum){
					smallNum=num;
			}		
		}
			System.out.printf("The smallest number is %d",smallNum);	
		}
		

	    public static void productOfOddNum(){
		int product=1;
		for(int i=1; i<=15; i++){
			if(i%2!=0){
				product*=i;
			}	
		}
		System.out.printf("The product of odd number(1-15) is %d",product);
		
		}
		
}











		/* int x = 1; 
		int total =0; 
		while (x <= 10) { 
		total += x; ++x;
		}
		// int age = 54;
		 // if (age >= 65)
		 // System.out.println("Age is greater than or equal to 65"); 
		// else
			// System.out.println("Age is less than 65"); 
		// int total=0;
		// int x=1;
		// int y=1;
		
		// while (x <= 100){
			 // total += x;
			 // ++x;
			// while (y < 0) { 
				// System.out.println(y);
			// ++y;
			// }
		// }
 // */