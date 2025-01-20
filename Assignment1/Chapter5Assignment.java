import java.util.Scanner;
import java.util.Random;
public class Chapter5Assignment
{
	 static final double pi=3.14;
	public static void main(String[]args)
	{
		// calculateCharges();//first question;
		// doubleNumRounding();//Second question;
		
		// Scanner scan=new Scanner(System.in);
		// System.out.print("Enter double value: ");
		// double number=scan.nextDouble();

		// roundToInteger(number);
        // roundToTenths(number);
		// roundToHundredths(number) 
		// roundToThousandths(number)
		
		// randomIntegers();
		
		 // randomNumbersSet();
		 
		 // integerPower(2,10);
		 // System.out.print(hypotenuse(3.0,4.0));
		 
		// System.out.print(isMultiple(3,12));
		
		// isEven(5590602);
		// Scanner scan=new Scanner(System.in);
		// System.out.print("Enter character: ");
		// char fill=scan.next().charAt(0);
		
		// squareOfAsterisks(5);
		// squareOfAsterisks(5,fill);
		
		// circleArea();
		// quotientInt(695,100);
		// remainderInt(695,100);
		displayDigits(6500);
	}
	

public static void displayDigits(int randomNum)
{
	if(randomNum>0&&randomNum<=99999)
	{
		if(randomNum<100)
		{
			int quotientResult=quotientInt(randomNum,10);
			int remainderResult=remainderInt(randomNum,10);
			System.out.printf("Output = %d  %d%n",quotientResult,remainderResult);
		}
		else if(randomNum>=100 &&randomNum<=999)
		{
			int variable;
			int nums[]=new int[3];
			int arrayCounter=2;
			for(int i=0; i<1; i++)
			{
				variable=remainderInt(randomNum,10);
				nums[2]=variable;
				int variable2=quotientInt(randomNum,10);
				if(i>=0)
				{
					variable=remainderInt(variable2,10);
					nums[1]=variable;
					variable=quotientInt(variable2,10);
					nums[0]=variable;
				}
			}
			for(int i=0; i<3;i++)
			{
				System.out.printf("%d  ",nums[i]);
			}
		}
		else if(randomNum>=1000 && randomNum<=9999)
		{
			int variable;
			int num[]=new int[4];
			int arrayCounter=3;
			for(int i=0; i<=1; i++)
			{
				variable=remainderInt(randomNum,10);
				num[arrayCounter]=variable;
				System.out.println(num[arrayCounter]);
				int variable3=quotientInt(randomNum,10);
				arrayCounter=arrayCounter-1;
				if(i==1)
				{
					variable=remainderInt(variable3,10);
					num[arrayCounter]=variable;

					int variable4=quotientInt(variable3,10);
					num[arrayCounter]=variable;
					
					variable=quotientInt(variable4,10);
					num[arrayCounter]=variable;
					
					variable=remainderInt(variable4,10);
					num[arrayCounter]=variable;
				}
			}
            for(int i=0; i<4;i++)
			{
				System.out.printf("%d  ",num[i]);
			}	
			
		}
		else if(randomNum>=10000 && randomNum<=99999)
		{
			int variable;
			int number[]=new int[5];
			int arrayCounter=4;
			for(int i=0; i<=3; i++)
			{
				variable=remainderInt(randomNum,10);
				number[arrayCounter]=variable;
				arrayCounter=arrayCounter-1;
				
				if(i==3)
				{
					variable=remainderInt(randomNum,10000);
					number[arrayCounter]=variable;
					variable=quotientInt(randomNum,10000);
					number[arrayCounter]=variable;
				}
			}
            for(int i=0; i<5;i++)
			{
				System.out.printf("%d  ",number[i]);
			}	
			
		}

		
	}
}
















public static int quotientInt(int a,int b)
{
	int result=a/b;
	System.out.printf("The integer part of the quotient of %d and %d = %d%n",a,b,result);
	return result;
	
}


public static int remainderInt(int a,int b)
{
	int result=a%b;
	System.out.printf("The interger part of the remainder of %d / %d = %d%n",a,b,result);
	return result;
}














	
public static void circleArea()
{
	Scanner scan=new Scanner(System.in);
	System.out.print("Enter radius: ");
	double r=scan.nextDouble();
	double area=pi*(r*r);
	
	System.out.printf("The area of the circle is: %.2f",area);
	
	
}
















	
	
public  static void squareOfAsterisks(int num,char fillCharacter)
{
	
	String result=String.valueOf(fillCharacter).repeat(num);
	for(int i=1;i<=num;i++)
	{
		System.out.printf("\n%s",result);
	}
}
	
	
	
	
		
	
 public  static void squareOfAsterisks(int num)
{
	
	String result="*".repeat(num);
	for(int i=1;i<=num;i++)
	{
		System.out.printf("\n%s",result);
	}
}
























public static void isEven(int num)
{
	boolean result =num%2==0;
	System.out.print(result);
}






















public static boolean isMultiple(int num1,int num2)
{
	boolean result =num2%num1==0;
	return result;
}















public static double hypotenuse(double side1,double side2)
{
	 double result=Math.hypot(side1,side2);
	return result;
}























	
	public static void integerPower(int base,int exponent)
	{
		int result=1;
		for(int i=1; i<=exponent;i++)
		{			
			result*=base;

		}
		System.out.print(result);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static void randomNumbersSet()
	{
		Random random=new Random();
		int set1=random.nextInt(5)*2+2;
		System.out.printf("Random numbers from set1= %d%n",set1);
		
		int set2=random.nextInt(5)*2+3;
		System.out.printf("Random numbers from set2= %d%n",set2);
		
		int set3=random.nextInt(5)*4+6;
		System.out.printf("Random numbers from set3= %d%n",set3);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static void randomIntegers()
	{
		Random random=new Random();
		int range1=random.nextInt(2)+1;
		System.out.printf("Random numbers within range1= %d%n",range1);
		
		int range2=random.nextInt(100)+1;
		System.out.printf("Random numbers within range2= %d%n",range2);
		
		
		int range3=random.nextInt(10);
		System.out.printf("Random numbers within range3= %d%n",range3);
		
		
		int range4=random.nextInt(112)+1000;
		System.out.printf("Random numbers within range4= %d%n",range4);

		int range5=random.nextInt(3)-1;
		System.out.printf("Random numbers within range5= %d%n",range5);
			
			
		int range6=random.nextInt(15)-3;
		System.out.printf("Random numbers within range6= %d%n",range6);	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	 public static void roundToInteger(double num)
	{
		int integer=(int)Math.floor(num+0.5);
		double tenths=Math.floor(num*10+0.5)/10;
		double hundredth=Math.floor(num*100+0.5)/100;
		double thousandths=Math.floor(num*1000+0.5)/1000;
		System.out.printf("OriginalNumber= %.2f\nRoundedToInterger= %d\nRoundedToTenths= %.1f\nRoundedToHundredth= %.2f\nRoundedToTHousandths= %.3f",num,integer,tenths,hundredth,thousandths);
		
	}
	public static void roundToTenths(double num)
	{
		int integer=(int)Math.floor(num+0.5);
		double tenths=Math.floor(num*10+0.5)/10;
		double hundredth=Math.floor(num*100+0.5)/100;
		double thousandths=Math.floor(num*1000+0.5)/1000;
		System.out.printf("OriginalNumber= %.2f\nRoundedToInterger= %d\nRoundedToTenths= %.1f\nRoundedToHundredth= %.2f\nRoundedToTHousandths= %.3f",num,integer,tenths,hundredth,thousandths);
		
	}
	public static void roundToHundredths(double num)
	{
		int integer=(int)Math.floor(num+0.5);
		double tenths=Math.floor(num*10+0.5)/10;
		double hundredth=Math.floor(num*100+0.5)/100;
		double thousandths=Math.floor(num*1000+0.5)/1000;
		System.out.printf("OriginalNumber= %.2f\nRoundedToInterger= %d\nRoundedToTenths= %.1f\nRoundedToHundredth= %.2f\nRoundedToTHousandths= %.3f",num,integer,tenths,hundredth,thousandths);
	}
	
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	// public static void doubleNumRounding()
	// {
		// Scanner scan=new Scanner(System.in);
		// double x;
		// System.out.print("Enter double value: ");
		// x=scan.nextDouble();
		
		// int y=(int)Math.floor(x+0.5);
		// System.out.printf("OriginalNumber\t\tRoundedNumber%n%f\t\t%d",x,y);
		
	// }
	
	
	
	
	
	
	
	
	// public static void calculateCharges()
	// {
		// Scanner scan=new Scanner(System.in);
		// double hoursParked;
		// int totalHours=0;
		// boolean control=true;
		// double charges;
		// double totalEarnings=0;
		// while(control)
		// {
			// System.out.print("Enter hours parked: ");
			// hoursParked=scan.nextDouble();
			// scan.nextLine();
			// if(hoursParked==24){
			  	// charges=10;
				// System.out.printf("Your charges for yesterday is: %.2f%n",charges);
				// totalEarnings+=charges;
				// totalHours+=hoursParked;
				

			// }
			// else if(hoursParked<=3){
				// charges=2;
				// System.out.printf("Your charges for yesterday is: %.2f%n",charges);
				// totalEarnings+=charges;
				// totalHours+=hoursParked;
				
			// }
			// else if(hoursParked>3&&hoursParked<24){
				// charges=2+(hoursParked-3)*0.5;
				// System.out.printf("Your charges for yesterday is: %.2f%n",charges);
				// totalEarnings+=charges;
				// totalHours+=hoursParked;
				
			// }
			// else{
				// System.out.println("Invaild input");
				// continue;
				
			// }	
			// System.out.print("Do you want to continue(Yes/No): ");
			// String response=scan.nextLine();
			// control=response.equalsIgnoreCase("yes");
							
		// }
		// System.out.printf("The total amount earned for %d hours of park time yesterday is = %.2f",totalHours,totalEarnings);
	//}
}