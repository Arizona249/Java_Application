// import java.util.Scanner;
public class VarargsArgument
{
	public static void main(String[]args)
	{
		// Scanner scan=new Scanner(System.in)
		listOfNames("Daniel","Emmaunel","Denzel","Simba","Mufasha");
		System.out.println(add(6,20,3,5,7,8,5,9));
		//use a loop to accept user input and pass it to the add method
		
	}
	
	
	public static int add(int...numbers)
	{
		int sum=0;
		for(int num: numbers)
		{
			sum+=num;
		}
		return sum;
	}
	public static void listOfNames(String...names)
	{
	for(String name: names)
	{
		System.out.printf("%s%n",name);
	}
	}
}	