Write a Java program to handle an ArithmeticException divided by zero by using try, catch and finally blocks.

Write the main() method with in the class MyFinallyBlock which will receive four arguments and convert the first two into integers, the last two into float values.

Write the try, catch and finally blocks separately for finding division of two integers and two float values.

If the input is given as command line arguments to the main() as "10", "4", "10", "4" then the program should print the output as:
Result of integer values division : 2
Inside the 1st finally block
Result of float values division : 2.5
Inside the 2nd finally block
If the input is given as command line arguments to the main() as "5", "0", "3.8", "0.0" then the program should print the output as:
Inside the 1st catch block
Inside the 1st finally block
Result of float values division : Infinity
Inside the 2nd finally block



package q11330;
public class MyFinallyBlock {

		
		public static void main(String[] args) {
			
			int  a=Integer.parseInt(args[0]);
			
			int  b=Integer.parseInt(args[1]);
			
			float  c=Float.parseFloat(args[2]);
			
			float  d=Float.parseFloat(args[3]);
			
			try{
				
				
				
				try{
					
					System.out.println("Result of integer values division : "+a/b);
					
				}catch (ArithmeticException e)
				
				{
					
					System.out.println("Inside the 1st catch block");
					
				}finally{
					
					System.out.println("Inside the 1st finally block");
					
				}
				
				
				
				try{
					
					System.out.println("Result of float values division : "+c/d);
					
				}catch (ArithmeticException e)
				
				{
					
					System.out.println("/by Zero");
					
					
					
				}finally{
					
					System.out.println("Inside the 2nd finally block");
					
				}
				
			}catch (Exception e) {
				
				System.out.println("Exception");
				
			}
			
			
			
		
		
			}
}
		