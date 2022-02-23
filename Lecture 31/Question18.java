Write a class MiddleChar with a main method. The method receives one command line argument. Print the middle character of the argument.

Assumptions:
 The length of the string is odd
Example:
Cmd Args : Three
r
Note: Make sure to use println and not print method.


package q11208;
public class MiddleChar{
	public static void main(String args[]){
		System.out.println(args[0].charAt(args[0].length()/2));
	}
}


