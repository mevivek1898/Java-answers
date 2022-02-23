Create a class TestStringMethods with a main method. The method receives one command line argument. Print the 5th character in the argument.

For Example:
Cmd Args : Strange
n


package q11153;
public class TestStringMethods {
	
	
	
	public static void main(String[] args) {
		
		
		
		String str = args[0];
		
		
		
		System.out.println(str.charAt(4));
	
	}
}
