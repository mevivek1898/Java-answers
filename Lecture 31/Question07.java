Write a class StringStairs with a main method. The method receives one command line argument and prints the first char in one line, then the first two chars in the next line, etc.

For example:
Cmd Args : Delhi
D
De
Del
Delh
Delhi


package q11197;


public class  StringStairs{
	
	public static void main(String[] args) {
		
		for(int i=1;i<=args[0].length();i++){
			
			System.out.println(args[0].substring(0,i));

			
		}
	}
}