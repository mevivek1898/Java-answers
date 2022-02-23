Write a class StringLastIndexOf with a main method. The method receives one command line argument. Print the index of the last occurrence of the character * in the argument.

For Example:
Cmd Args : TCA*TX*TX*
9


package q11174;


public class StringLastIndexOf {
	
	public static void main(String[] args) {
		
		String str = args[0];
		
		System.out.println(str.lastIndexOf("*"));
		
		
		
		
	}
}
