Write a class TestSubstring with a main method. The method receives one command line argument and print the first half of the argument.

Here is an example:
Cmd Args : Eight
Ei


package q11195;
public class TestSubstring {
	public static void main(String[] args){
	//	int n=args[0].length
	System.out.println(args[0].substring(0,args[0].length()/2));
	}
}

