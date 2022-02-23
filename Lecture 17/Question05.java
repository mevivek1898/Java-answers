Write a class PrimeVerify with a public method checkPrimeOrNot that takes one parameter number of type int. Write a code to check whether the given number is a prime number or not.

For example:
Cmd Args : 13
13 is a prime number


Note: Please don't change the package name.

package q10885;

public class PrimeVerify{
 boolean isPrime(int n)
	
	{
		
		// Corner cases
		
		if (n <= 1)
		
		return false;
		
		if (n <= 3)
		
		return true;
		
		if (n % 2 == 0 || n % 3 == 0)
		
		return false;
		
		
		
		for (int i = 5; i * i <= n; i = i + 6)
		
		if (n % i == 0 || n % (i + 2) == 0)
		
		return false;
		
		
		
		return true;
		
	}
	
	
	public void checkPrimeOrNot(int n){
		if(isPrime(n)){
			System.out.println(n+" is a prime number");
		}else{
			System.out.println(n + " is not a prime number");
		}
	}
}
