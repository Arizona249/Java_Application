public class CompoundInterestCalculation{
	public static void main(String[]args){
		int principal=10000;
		double interest =0.05;
		int Amount;
		
		// System.out.printf("%-5s %-20s%n","year","Amount on deposit");- left to right +right to left
		
		for(int year=1; year<10; ++year){
			Amount=principal*(int)Math.pow(1.0+interest,year);
			
			
			System.out.printf("%d,%d",year,Amount);
			
			
		}
	}
}