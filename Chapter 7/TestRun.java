class Testing{
	int testOne;
	int testTwo;
	String StillTesting;
	
	public void display()
	{
		System.out.printf("Testing the mic %d %d%n",testOne,testTwo);
	}

}

class Testing1{
	private int testOne1;
	private int testTwo2;
	String stillTesting1;
	
	
	public int getTestOne1(){
		return testOne1;
	}
	public int getTestTwo2(){
		return testTwo2;
	}
	public String getStillTesting1(){
		return stillTesting1;
	}
	
	public void setTestOne1(int testOne1){
		this.testOne1=testOne1;
	}
	
	public void setTestOne2(int testTwo2){
		this.testTwo2=testTwo2;
	}
	
	public void setStillTesting(String  stillTesting1){
		this.stillTesting1=stillTesting1;
	}
	
	
	public void display()
	{
		System.out.printf("%s %d %d%n",stillTesting1,testOne1,testTwo2);
	}
	
	
}




public class TestRun{
	public static void main(String[]args)
	{
		Testing test=new Testing();
		test.testOne=1;
		test.testTwo=2;
		test.display();
		
		Testing1 test1=new Testing1();
		test1.setStillTesting("Testing the mic");
		test1.setTestOne1(1);
		test1.setTestOne2(2);
		test1.display();
		
		
	}
}