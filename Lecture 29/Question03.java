Write a class StringIndexOf with a main method. The method receives one command line argument. Print the second occurrence of the string CA in the argument.

For Example:
Cmd Args : CALIFORNICA
9

package q11173;


public class StringIndexOf {
	
	public static void main(String[] args) {
		
		String str = args[0];
		
		System.out.println(str.indexOf("CA",2));
		
		
		
		
	}
}

