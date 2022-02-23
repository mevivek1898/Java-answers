The String class provides a method public int compareTo(String anotherString) to perform a lexicographical comparison of itself with another string passed to it.

It returns 0 (zero) if the strings are equal.
It returns a positive number ( > 0 ), when the string appears before the string argument passed.
It returns a negative number ( < 0 ), when the string appears after the string argument passed.

For example:
"Moon".compareTo("Moon") returns 0
"Earth".compareTo("Moon") returns -8
"Moon".compareTo("Earth") returns 8
Write a class StringCompareTo with a main method.

Assume the main method receives two string arguments. Write code to print the below output by comparing first argument and the second argument.
arg1 is lesser than arg2 //if first argument lexicographically appears before the second argument
arg1 is greater than arg2 //if first argument lexicographically appears after the second argument
arg1 and arg2 are equal//if first argument is equal to the second argument


package q11170;


public class StringCompareTo {
	
	public static void main(String[] args) {
		
		int ans = args[0].compareTo(args[1]);
		
		if(ans>0) System.out.println("arg1 is lesser than arg2");
		
		else if(ans==0) System.out.println("arg1 and arg2 are equal");
		
		else System.out.println("arg1 is greater than arg2");
		
		
		
		
		
		
		
		
	}
}