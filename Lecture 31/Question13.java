Write a class MiddleTwoChars with a main method. The method receives one command line argument extract the middle two characters from the argument and print the output.

Assumptions:
 The string has even number of characters
For example:
Cmd Args : java
av
Note: Make sure to use println and not print method.

package q11203;
public class MiddleTwoChars {
	public static void main(String[] args){
		String str=args[0];
		int position;
		
		int length;
		
		if (str.length() % 2 == 0)
		
		{
			
			position = str.length() / 2 - 1;
			
			length = 2;
			
		}
		
		else
		
		{
			
			position = str.length() / 2;
			
			length = 1;
			
		}
		
		System.out.println(str.substring(position, position + length));
		
	
	}
}