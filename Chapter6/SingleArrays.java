public class SingleArrays{
	public static void main(String[]args){
		//creating an array and intiliziting
		int[]ages={12,8,15,35,20};
		String[] names={"jack","Mary","Chisom","kim","Becca"};
		//creating an array using new keyword
		int[]numbers=new int[5];
		//assigning values to an empty array
		numbers[0]=15;
		numbers[1]=30;
		numbers[2]=22;
		numbers[3]=12;
		numbers[4]=11;
		System.out.printf("Name is %s and age is %d%n",names[0],ages[0]);
		System.out.printf("The number at the 2nd position is: %d%n",numbers[1]);


	}
}