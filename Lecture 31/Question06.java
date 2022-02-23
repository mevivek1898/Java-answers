Write a class TestSubstring with a main method. The method receives one command line argument and prints the output by removing the first and last characters of the argument.

For example:
Cmd Args : January
anuar

package q11196;


public class  TestSubstring{
	
	public static void main(String[] args) {
		
		System.out.println(args[0].substring(1,args[0].length()-1));
	
	}
}
