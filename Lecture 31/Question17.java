Write a class TestString with a main method. The method receives one command line argument. Create a string by extracting the first character and appending it to the end of the argument , then append aa at the end.

For example:
Cmd Args : Europe
uropeEaa
Note: Make sure to use println and not print method.


package q11207;
public class TestString{
	
	public static void main(String args[]){

	
		System.out.println(args[0].substring(1)+args[0].charAt(0)+"aa");
	}
}


