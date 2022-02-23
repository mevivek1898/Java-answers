Create a class TestFormatter with a main method. The method receives one command line argument.

Convert the argument received in the main method into a double value.

Format and print the double value such that it has :
comma (or locale specific) delimiters
a minimum width of 12 characters (put numbers in the front if the number is smaller)
only 3 decimal points
a sign indicator (+ or -)
instead of spaces put zeros(0's) to the left if the number is smaller
[Note: You need not use %n at the end of your formatting text.]




package q11189;


public class TestFormatter{
	
	public static void main(String[] args) {
		
		double ans=Double.parseDouble(args[0]);
		
		
		
		System.out.printf("%,+012.3f", ans);
		
		
		
		
	}
}