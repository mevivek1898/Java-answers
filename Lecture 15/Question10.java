Create a class CheckMultipleOf with a public method checkMultipleOf that takes two parameters first and second are of type int and returns true if first is multiple of second. The return type of checkMultipleOf is boolean.

Here is an example:
Cmd Args : 18 9
true
Hint: Use the % (modulus) operator. It can be used to find the remainder after division by a number.
For example, to check if a given number is even we write
if (number % 2 == 0) {// when divided by 2, if the reminder is zero, it is a even number
	System.out.println("number is even");
}


Note: Please don't change the package name.
'
package q10925;

public class CheckMultipleOf{
	
	public boolean checkMultipleOf(int f ,int s){
		
		if(f%s==0){
			
			return true;
			
		}
		
		else{
			
			return false;
			
		}
		
	}
	
	
	
}