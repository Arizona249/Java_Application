import java.util.Arrays;
public class UsingArraysClass
{
	public static void main(String[]args)
	{
		int []numbers={6,19,2,29,30,8,3,12,4,1};
		int[] orginal={1,2,3};
		int[] copy =Arrays.copyOf(orginal,5);
		
		
		// converting arrays to string 
		// String copyArray=Arrays.toString(copy);
		// System.out.printf("%s%n",copyArray);
		// System.out.print(copy);
		
		
	//using the equals method to check if two arrays are of the same type and size
		// int[] arr1={1,2,3};
		// int[] arr2={1,2,3};
		// boolean isEqual=Arrays.equals(arr1,arr2);
		
		// System.out.println(isEqual);
		// System.out.println("=========");
		
		
	//filling an array using the fill method 
		// int[] myArrays=new int[5];
		
		// Arrays.fill(myArrays,20);
		// for(int element:myArrays)
		// {
			// System.out.printf("%d%n" +" ",element);
		
		// }
		
	//copying an array using the copy method	
		// int[] orginal={1,2,3};
		// int[] copy =Arrays.copyOf(orginal,5);//this is the size of thearray
		// for(int n: orginal)
		// {
			// System.out.print(n +" \n");
		// }
		// for(int b: copy)
		// {
			// System.out.print(b +" ");
		// }
		
		// sorting method
		// Arrays.sort(numbers,0,5);//sorts for index num 4 and stops at index no 8
		
		
		
		
		
		// using binarySearch to return the index number of a given value after the array has been sorted
		// int index=Arrays.binarySearch(numbers,30);
		// System.out.printf("The index number of element 30 = %d%n",index);
		// for(int n:numbers)
		// {
			// System.out.printf("%d"+" ",n);
		// }
		
		//comparing arrays using the compare method it compares the two arrays lexicographically.
		int []arr1={1,2,3,4,6,5};
		int[]arr2={1,2,3,4,5};
		int c=Arrays.compare(arr1,arr2);
		System.out.print(c);
	}
	
	
	
	

// import java.util.Arrays;
// public class UsingArraysClass
// {
	// public static void main(String[]args)
	// {
		// int []numbers={6,19,2,29,30,8,3,12,4,1};
		
		// Arrays.sort(numbers);or we can use the parallelsort()method that would return the same value but it is mostly used in a large array
		// for(int n:numbers)
		// {
			// System.out.printf("%d"+" ",n);
		// }
	// }
}