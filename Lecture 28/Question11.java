Write a class StringCompare with a main the method. The method receives two command line arguments compare the first and second arguments using equals() method and also by using == operator and print the result.

For example :
Cmd Args : Ganga Ganga
The result with equals : true
The result with == : false


package q11169;
public class StringCompare {
	public static void main(String[] args) {
		System.out.println("The result with equals : " + args[0].equals(args[1]));
		System.out.println("The result with == : " + (args[0]==args[1]));
	}
}
