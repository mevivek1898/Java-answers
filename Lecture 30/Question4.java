Create a class TestFormatter with a main method. The method receives one command line argument, convert it to an integer.

Format and print the integer such that it has comma (or locale specific) delimiters, has a minimum width of 6 characters (put spaces in the front if the number is smaller), and has a sign indicator (+ or -).

[Note: You need not use %n at the end of your formatting text.]

package q11188;


public class TestFormatter{
	
	public static void main(String[] args) {
		
		int ans=Integer.parseInt(args[0]);
		
		
		
		System.out.printf("%,+6d", ans);
		
		
		
		
	}
}