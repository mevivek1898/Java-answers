Write a class PrintAlphabet with a main method. Write a logic to print all the English alphabets from A to Z.

Hint: Use for loop to iterate over the characters from 'A' to 'Z'.

You can declare and initialize a loop counter char i and initialize it to 'A' (eg: char i = 'A';). The condition can similarly be i <= 'Z';.
And the update statement can be i++ then print the value of i.



Note: Please don't change the package name'

package q10884;
class PrintAlphabet

{
	
	public static void main(String args[])
	
	{
		
		char ch;
		
		
		
		for( ch = 'A' ; ch <= 'Z' ; ch++ )
		
		System.out.println(ch);
		
	}
	
}

