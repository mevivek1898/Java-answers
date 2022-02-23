Write a class RemoveChars with a main method. The method receives one command line argument and prints the output by removing all x characters from the argument.

For example:
Cmd Args : prefix
prefi
Note: Make sure to use println and not print method.


package q11211;
public class RemoveChars{
	
	public static void main(String args[]){
		
	String	str = args[0].replace("x", "");
		
		System.out.println(str);
		
		
		
	}
	
	
}

