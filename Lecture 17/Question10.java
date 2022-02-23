Create a class Armstrong with a main method to check the given number is an armstrong number or not.

[Hint: An armstrong number is a number that is the sum of its own digits each raised to the power of the number of digits.
For example
9 = 91 = 9
371 = 33 + 73 + 13 = 27 + 343 +1 = 371
8208 = 84 + 24+04 + 84 = 4096 + 16 + 0 + 4096 = 8028
If the input is given as command line arguments to the main() as [153] then the program should print the output as:
Cmd Args : 153
The given number 153 is an armstrong number
If the input is given as command line arguments to the main() as [25] then the program should print the output as:
Cmd Args : 25
The given number 25 is not an armstrong number


Note: Please don't change the package name.

package q10891;
public class Armstrong

{
	
	
	
	static boolean isArmstrong(int n)
	
	{
		
		int temp, digits=0, last=0, sum=0;
		
		
		
		temp=n;
		
		
		
		while(temp>0)
		
		{
			
			temp = temp/10;
			
			digits++;
			
		}
		
		temp = n;
		
		while(temp>0)
		
		{
			
			
			
			last = temp % 10;
			
			
			
			sum +=  (Math.pow(last, digits));
			
			//removes the last digit
			
			temp = temp/10;
			
		}
		
		
		
		if(n==sum)
		
		
		
		return true;
		
		
		
		else return false;
		
	}
	
	//driver code
	
	public static void  main(String args[])
	
	{
		
		int num=Integer.parseInt(args[0]);
		

		
	
		
		
		
	
		
		if(isArmstrong(num))
		
		{
			
			System.out.println("The given number " +num+ " is an armstrong number");
			
		}
		
		else
		
		{
			
			System.out.println("The given number " + num + " is not an armstrong number");
			
		}
		
	}
	
}  

