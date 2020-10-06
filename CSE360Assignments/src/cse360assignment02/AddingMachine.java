package cse360assignment02;

public class AddingMachine {
	  private int total; // Store the total value
	  private String output; //Store the string output
	  private String sign; //Store the string of sign
	  
		public static void main(String[] args)
		{
			AddingMachine myCalculator = new AddingMachine();
			myCalculator.add(4);
			myCalculator.subtract(5);
			myCalculator.add(15);
			System.out.println(myCalculator.toString());
			myCalculator.clear();
			System.out.println(myCalculator.getTotal());
			
		}
	  
	public AddingMachine () {
	    total = 0;  // not needed - included for clarity	
	    output = " ";
	  }
	  
	  public int getTotal () {
	    return total;
	  }
	  
	  public void add (int value) {
		 sign = " + ";
		 output = output + sign + Integer.toString(value); //Concat the strings together
		 total = total + value;
	  }

  public void subtract (int value) {
  }

  public String toString () {
    return "";
  }

  public void clear() {
	
  }
}