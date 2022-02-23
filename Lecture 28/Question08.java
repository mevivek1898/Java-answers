Write a class StringCompare with a main method. The method receives two command line arguments and prints true if both are equal.

Assumptions:
Ignoring the case of the two arguments
For Example:
Cmd Args : Congrats conGrats
true


package q11166;


public class StringCompare {
	
	public static void main(String[] args) {
		
		String str1 = args[0];
		
		String str2 = args[1];
		
		System.out.println(str1.equalsIgnoreCase(str2));
		
		
		
		
	}
}
