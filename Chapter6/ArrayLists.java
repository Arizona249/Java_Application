import java.util.ArrayList;
public class ArrayLists
{
	public static void main(String[]args)
	{
		ArrayList<String>list=new ArrayList<String>();
		//populating an arrayList
		list.add("John");
		list.add("Henry");
		list.add("Mary");
		list.add("Jack");
		list.add("Blessing");
		
		//populating an arrayList at a position it doesnt replace it
		// list.add(2,"Clinton");
		list.add(2,"Clinton");
		//used to replace a value with another
		list.set(3,"Peter");
		
		//removing from an arrayList based on the index and object;
		// list.remove("Henry");
		// list.remove(3);
		//clearing the arrayList
		// list.clear();
		
		System.out.print(list.get(3));
		
		
		
		
		//Additional methods
		// set
		// contains
		// get
		// size
		// index

		
		
		for(String name:list)
		{
			System.out.printf("%s%n",name);
		}
	}
}