The Byte class wraps a primitive byte value.
This class provides constants and methods that are useful while working with bytes. For example it has a method Byte.parseByte(String s, int radix) which can be used to convert a string value representing a binary, octal, hex or a decimal integer within the valid range of a byte
byte x = Byte.parseByte("111", 2);
//parses the string literal "111" using base-2 and returns decimal 7

byte y = Byte.parseByte("23", 10);
//parses the string literal "23" using base-10 (by default) and returns decimal 23
In the below code, the main method of GuessDataType will be passed an argument. The argument can be any number between 0 to 127.
You can assume that the string value passed in args[0] will always contain a number represented in base-10.
Complete the below code so that it produces the correct output.


Note: Please don't change the package name.



Answer 

package q10779;
public class GuessDataType {
	public static void main(String[] args) {
		//write code to convert the value pased in args[0] into a byte
		byte numberOfBits =Byte.parseByte(args[0]) ;

		switch(numberOfBits) {
			case 8 : 
				System.out.println("byte");
				break;
			case 16 : 
				System.out.println("short or a char");
				break;
			case 32 : 
				System.out.println("int or a float");
				break;
			case 64 : 
				System.out.println("long or a double");
				break;
			default : 
				System.out.println("Could not guess the data type of size : " + numberOfBits + " bits");
				break;
		}
		
	}
}