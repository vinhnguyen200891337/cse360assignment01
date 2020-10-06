package cse360assignment02;

public class AddingMachine2 {
	
	public static void main(String[] args)
	{
		myCalculator test = new myCalculator();
		test.add(4);
		test.subtract(5);
		test.add(15);
		System.out.println(test.toString());
		test.clear();
		System.out.println(test.getTotal());
		
	}
}
