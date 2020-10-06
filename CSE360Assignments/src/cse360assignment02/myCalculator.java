package cse360assignment02;

	

public class myCalculator {
	  private int total; // Store the total value
	  private String output; //Store the string ouput
	  private String sign; //Store the string of sign
	  
	public myCalculator () {
	    total = 0;  // not needed - included for clarity	
	    output = " ";
	  }
	  
	  public int getTotal () {
	    return total;
	  }
	  
	  public void add (int value) {
		 sign = " + ";
		 output = output + sign + Integer.toString(value);
		 total = total + value;
	  }

	  public void subtract (int value) {
		  sign = " - ";
		  output = output + sign + Integer.toString(value);
		  total = total - value;
	  }

	  public String toString () {
	    return "0" + output;
	  }

	  public void clear() {
		output = " ";
		total = 0;
		toString();
	  }
}
