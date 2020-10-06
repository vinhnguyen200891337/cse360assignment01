//Vinh Duy NGUYEN
//Editted AddingMachine.java. Include main method
//Main method in seperate file.
//Github Repo- https://github.com/vinhnguyen200891337/cse360assignment02

package cse360assignment02;

public class AddingMachine {
	  private int total; // Store the total value
	  private String output; //Store the string output
	  private String sign; //Store the string of sign
	  
		public static void main(String[] args)
		{
			AddingMachine myCalculator = new AddingMachine();
			System.out.println(myCalculator.toString());
			System.out.println(myCalculator.getTotal());
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
		  sign = " - ";
		  output = output + sign + Integer.toString(value);
		  total = total - value;
	  }

	  public String toString () {
	    return "0" + output; //Returning output string
	  }

	  public void clear() {
		output = " "; //Reset the output
		total = 0; // Reset total value		
	  }
}
