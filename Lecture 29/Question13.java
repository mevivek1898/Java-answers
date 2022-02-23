Create a class StringSplit with a main method. The method receives two command line arguments. First argument is a string. Second argument is a regular expression.

A regular expression is a sequence of characters that define a search pattern.

Example:
+,  -, *, ]Split the first argument using the regular expression and print the items. Make sure there are no leading or trailing spaces in the items.

For Example:
Cmd Args: Rama-Lakshmana-Bharatha-Satrugna -
Rama
Lakshmana
Bharatha
Satrugna


package q11183;


public class StringSplit {
	
	public static void main(String[] args) {
		
		String str = args[0];
		
		String[] splits = str.split(args[1]);
		
		for (String s : splits) {
			
			System.out.println(s.trim());
			
			
		}
	}
}