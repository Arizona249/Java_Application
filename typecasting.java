public class Typecasting{
	public static void main(String[]args){
		//widening(implict) from int
		int num1=100;
		double d=(double)num1;
		
		System.out.println(d);
		// Narrowing(explicit) from long to int
		long longValue=10000000000l;
		int intValue=(int)longValue;
		
		System.out.println(intValue);
		//explicit conversion data would be lost
		double num=100.99;
		int i=(int) num;
		System.out.println(i);
	}
}	