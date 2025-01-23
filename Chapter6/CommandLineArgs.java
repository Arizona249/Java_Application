public class CommandLineArgs
{
	public static void main(String []args)
	{
		for(String value: args)
		{
			System.out.printf("%s%n",value);
		}
	}
}