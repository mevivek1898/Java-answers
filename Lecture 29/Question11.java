Create a class StringReplace with a main method. The method receives one command line argument , replace all the occurrences of character c with k and print the result.

For Example:
Cmd Args : Acceptance
Akkeptanke


package q11181;


public class StringReplace{
	
	public static void main(String[] args) {
		
		String str = args[0];
		
		System.out.println(str.replace("c", "k"));
		
		
	}
}

