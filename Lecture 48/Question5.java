Write a Java program to handle an ArithmeticException divide by zero using exception handling.

Write a class called Division with a main() method. Assume that the main() method will receive two arguments which have to be internally converted to integers.

Write code in the main() method to divide the first argument by the second (as integers) and print the result (i.e the quotient).

If the command line arguments to the main() method are "12", "3", then the program should print the output as:
Result = 4
If the command line arguments to the main() method are "55", "0", then the program should print the output as:
Exception caught : divide by zero occurred



package q11329;
public class Division {
	
	public static void main (String args[]) {
		
		int num1 = Integer.parseInt(args[0]);
		
		int num2 = Integer.parseInt(args[1]),result = 0;
		
		try{
			
			result = num1/num2;
			
			System.out.println("Result = " +result);
			
		}
		
		catch (ArithmeticException e) {
			
			System.out.println ("Exception caught : divide by zero occurred" );
			
		}
		
	}
	
}

	