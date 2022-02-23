Write a class StringIndexOf with a main method. The method receives one command line argument. Print the index of the first occurrences of the string CA in the argument.

For Example:
Cmd Args : TCA*CX*CX*CAT
1

package q11172;


public class StringIndexOf {
	
	public static void main(String[] args) {
		
		String str = args[0];
		
		System.out.println(str.indexOf("CA"));
		
		
		
		
	}
}



