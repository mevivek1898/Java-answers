Write a class SubstringText with a main method. The method receives one command line argument. Print the substring of the argument that starts at index 5 and ends at index 12 (should include the character at index 12).

Assumptions:
The argument contains more than 12 characters
For Example:
Cmd Args : Merry-go-round
-go-roun


package q11178;


public class SubstringText {
	
	public static void main(String[] args) {
		
		String str = args[0];
		
		System.out.println(str.substring(5,13));
		
	}
}

