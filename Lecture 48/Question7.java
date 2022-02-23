Write a Java program to illustrate multiple catch blocks in exception handling.

Write a method multiCatch(int[] arr, int index) in the class MultiCatchBlocks where arr contains integer array values and index contains an integer value.

Write the code in try block to print the value of arr[index] and also print the division value of arr[index] by index.

Write the catch blocks for
ArithmeticException will print "Division by zero exception occurred"
ArrayIndexOutOfBoundsException will print "Array index out of bounds exception occurred".
Exception (which catches all exceptions) will print "Exception occurred"




package q11331;
public class MultiCatchBlocks {
	// Write the code
	public void multiCatch(int[] arr, int index){
		
		try{
			
			System.out.println(arr[index]);
			
			System.out.println(arr[index]/index);
			
		
			
		}
		
		catch(ArithmeticException e)
		
		{
			
			System.out.println("Division by zero exception occurred");
			
		}
		
		catch(ArrayIndexOutOfBoundsException e)
		
		{
			
			System.out.println("Array index out of bounds exception occurred");
			
		}
		
		catch(Exception e)
		
		{
			
			System.out.println("Exception occurred");
			
		}
		
	}
	
	
}
