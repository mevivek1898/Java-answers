Write a class RemoveChar with a main method. The method receives one command line argument and prints the output by removing the 3rd character from the argument.

Assumptions:
Length of the argument is greater than or equal to 3 characters
For example:
Cmd Args : Victory
Vitory


package q11198;


public class  RemoveChar{
	
	public static void main(String[] args) {
		
		String str=args[0];
		
		System.out.println(str.substring(0, 2) + str.substring(2+1));
		
		
	}
}