Write a Java program to illustrate the concept creation of own exceptions.

Write the class NumberRangeException which is inherited from Exception, contains only a default constructor which will print the message "Please enter a number between 25 and 50".

Write the class MyException with the main() method which will receive only one argument and convert that into int.

If the given integer is in between 25 and 50 print the given value, otherwise throw the NumberRangeException().

For example, if the given integer is 27 then the output should be:
Given number : 27
For example, if the given integer is 62 then the output should be:
Please enter a number between 25 and 50
NumberRangeException




package q11338;
public class MyException {
	public static void main (String[] args) {
		int num=Integer.parseInt(args[0]);
		try {
			int x = Integer.parseInt(args[0]);
			if (num>=25 && num<=50) // write the condition
	
				System.out.println("Given number : " + x);
				else throw new NumberRangeException();
		}
		catch (NumberRangeException e) {
			System.out.println("q11338.NumberRangeException"); // Fill the missing code
		}
	}
}
class NumberRangeException extends Exception {
public	NumberRangeException(){
		System.out.println("Please enter a number between 25 and 50");
	} 
}


