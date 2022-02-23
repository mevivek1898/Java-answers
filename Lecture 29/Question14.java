Create a class PalindromeOrNot with a main method. The method receives one command line argument. Check the given argument is palindrome or not.

For example:
Cmd Args : madam
The given string madam is a palindrome
Cmd Args : Godavari
The given string Godavari is not a palindrome



package q11184;


public class PalindromeOrNot{
	
	public static void main(String[] args) {
		
		String str = args[0];
		
		String rev=new StringBuffer(str).reverse().toString();
		
		if(str.equals(rev)) {
			System.out.println("The given string " + str + " is a palindrome");
		}
		
		else {
			System.out.println("The given string " + str + " is not a palindrome");
		
		}
	}
}