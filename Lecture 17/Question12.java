Write a class SumAndReverseNumber with a method sumAndReverseANumber that takes one parameter number of type int and find the sum of digits of a given number also find the reverse of a number and print the result.

For example, if a value of 369 is passed then the output should be:
Sum of digits : 18
Reverse : 963


package q10893;
class SumAndReverseNumber {
	
	
	
	static int reversDigits(int num)
	
	{
		
		
		
		// Making input hard coded else
		
	//	num = 25;
		
		// else do not initialize num
		
		
		
		
		
		int rev = 0, rem;
		
		
		
		// Statements to be executed in do loop
		
		do {
			
			// Reversal of a number as discussed in
			
			// algorithm
			
			rem = num % 10;
			
			rev = rev * 10 + rem;
			
			num = num / 10;
			
			
			
		}
		
		
		
		// Condition check
		
		while (num > 0);
		
		
		
		// Returning reverse of the user enter number
		
		return rev;
		
	}
	
	
	
	
	
	static int sumDigits(int num)
	
	{
		
		
		
	//	num = 25;
		
		
		
		// Creating remainder variable
		
		int sum = 0, rem;
		
		
		
		
		
		do {
			
			
			
			rem = num % 10;
			
			sum = sum + rem;
			
			num = num / 10;
			
			
			
		}
		
		// condition check
		
		while (num > 0);
		
		
		
		return sum;
		
	}
	
	
	
	public static void sumAndReverseANumber(int num)
	
	{
		
		// num = Integer.parseInt(args[0]);
		
	//	System.out.println(num);
		
		
		
		System.out.println("Sum of digits : "+ sumDigits(num));
		
		System.out.println("Reverse : "+ reversDigits(num));
		
		
		
		
		
		}
		
		}
