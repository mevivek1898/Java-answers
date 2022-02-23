Write a class Factorial with a main method. The method takes one command line argument. Write a logic to find the factorial of a given argument and print the output.

For example:
Cmd Args : 5
Factorial of 5 is 120


Note: Please don't change the package name.

package q10886;
class Factorial{
	
	public static void main(String[] args ){
		
		int i,fact=1;
		
		int number=Integer.parseInt(args[0]);
		
		for(i=1;i<=number;i++){
			
			fact=fact*i;
			
		}
		
		System.out.println("Factorial of "+number+" is "+fact);
		
	}
	
}  

