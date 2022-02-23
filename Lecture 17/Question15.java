Write a class FibonacciSeries with a main method. The method receives one command line argument. Write a program to display fibonacci series i.e. 0 1 1 2 3 5 8 13 21.....

For example:
Cmd Args : 80
0 1 1 2 3 5 8 13 21 34 55


package q10896;
class FibonacciSeries{
	
	static void Fibonacci(int N)
	
	{
		
		int num1 = 0, num2 = 1;
		
		
		
		int counter = 0;
		
		
		
		// Iterate till counter is N
		
		while (counter < N) {
			
			
			
			// Print the number
			
			System.out.print(num1 + " ");
			
			
			
			// Swap
			
			int num3 = num2 + num1;
			
			num1 = num2;
			
			num2 = num3;
			
			counter = counter + 1;
			
		}
		
	}
	

	
	
	
	public static void main(String[] args)
	
	{
		int n=Integer.parseInt(args[0]);
		int a=0,b=1,c;
		int k=0;
		
		
		do{
			
			if(k==0){
				System.out.print(a);
				k=1;
			}else{
				
			
			
			System.out.print(" "+a);
			}
			
			
			
			c=a+b;
			
			
			
			a=b;
			
			
			
			b=c;
			
			
			
		}while(a<=n);
		
		
		
	
		
	
		
		
		
	}}
	
