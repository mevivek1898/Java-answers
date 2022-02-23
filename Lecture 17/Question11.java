Write a class PrimeNumbers with a public method primeInLimits that takes two parameters high and low are of type int. Print the prime numbers between the given limits (including first and last values)

For example:
Cmd Args : 3 10
3 5 7 
Note: Please don't change the package name.

package q10892;

public class PrimeNumbers {
	
	public void primeInLimits(int start, int end) {
	for(int i = start ; i <= end ; i++)
	
	{
		
		//logic for checking number is prime or not
		
		int count = 0;
		
		for(int j = 1 ; j <= i ; j++)
		
		{
			
			if(i % j == 0)
			
			count = count+1;
			
		}
		
		if(count == 2)
		
		System.out.print(i+" ");
		
}
		
	
	}
}
