Write a class PrefixCheck with a main method. The method receives one command line argument. If the argument starts with en print it as it is, else prepend en and print the output.

These are examples for your understanding :
Cmd Args : bye
enbye
Cmd Args : entertainment
entertainment


package q11192;


public class PrefixCheck{
	
	public static void main(String[] args) {
		
	String ans=args[0];
		
		if(ans.startsWith("en")) System.out.println(ans);
		
		else System.out.println("en"+ ans);
		
		
		
		
		
		
	}
}

