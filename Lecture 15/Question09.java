Create a class CheckPositiveNegative with a public method checkPositiveNegative that takes two parameters first and second are of type int.

Follow the given instructions while writing the code
If both numbers are negative, the program should print negative
If both numbers are positive, the program should print positive
If one of the numbers is positive and the other is negative, the program should print mixed
For example:
Cmd Args : 1 2
positive


Note: Please don't change the package name.

package q10924;

public class CheckPositiveNegative{
	
	public static void checkPositiveNegative(int first, int second){
		
		if(first<0 && second<0)
		
		System.out.println("negative");
		
		else if(first>0 && second>0)
		
		System.out.println("positive");
		
		else
		
		System.out.println("mixed");
		
	}
	
	
}