package q10775;
public class GuessShort {
	public static void main(String[] args) {
		//in the below line write code to convert
		//the string value passed in args[0] into a short
		//Hint: Since args[0] is going to be a String 
		// you can use Short.parseShort(args[0]); to convert
		// the value in args[0] into a short
		short shortValue =Short.parseShort(args[0]) ;  
		
		if (Byte.MIN_VALUE <= shortValue && shortValue <= Byte.MAX_VALUE) {
			System.out.println("The short value " + shortValue + " is in the range of a byte ");
		} else {
			System.out.println("The short value in args[0] is : " + shortValue);
		}
	}
}