Write code which uses if-then-else statement to check if a given account balance is greater or lesser than the minimum balance.

Write a class BalanceCheck with public method checkBalance that takes one parameter balance of type double.

Use if-then-else statement and print Balance is low if balance is less than 1000. Otherwise, print Sufficient balance.

Note: You need not write the main method. You can directly write the checkBalance(double balance) method in the BalanceCheck class.

Use System.out.println() instead of System.out.print().

Note: Please don't change the package name.

package q10850;

class BalanceCheck{
	public void checkBalance(double bal){
		if(bal<1000){
			System.out.println("Balance is low");
		}else
		System.out.println("Sufficient balance");
	}
	
}