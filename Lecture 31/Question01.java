Write a class Greeting with a main method. The method receives one command line argument and prints the output as shown below.

For example:
Cmd Args : Ram
Hello Ram!
Note: Make sure to use println and not print method. If you want to use printf, ensure to print a \n character at the end.



package q11191;


public class Greeting{
	
	public static void main(String[] args) {
		
		String ans=args[0];
		
		
		
		System.out.println("Hello "+ ans +"!");
		
		
		
		
	}
}