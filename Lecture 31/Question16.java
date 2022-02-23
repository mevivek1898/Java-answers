Write a class TestString with a main method. The method receives one command line argument. Create a new string by concatenating the first three and last three characters of the argument and print the output.

Assumptions:
String length is at least six
For Example:
Cmd Args : Hyderabad
Hydbad


package q11206;

public class TestString{
	public static void main(String args[]){
		
		System.out.println(args[0].substring(0,3)+args[0].substring(args[0].length()-3));
	}
}

