Write a class StringTrim with a main method. The method receives one command line argument, remove any leading or trailing white spaces from the argument and print the argument.

For Example:
Cmd Args :  blank
blank



package q11180;


public class StringTrim{
	
	public static void main(String[] args) {
		
		String str = args[0];
		
		System.out.println(str.trim());
		
		
	}
}

