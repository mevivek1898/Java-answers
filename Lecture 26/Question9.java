In Java, the void keyword is a placeholder to indicate that there is no return type for a method.

For example, the below method adds num1 and num2 and returns the result.
public int sum(int num1, int num2) {
	return num1 + num2;
}
Since the type of the result being returned is also int, the method's return type is marked int.

In the below example, you will notice that the method printSum does not return but prints the summation to the System's console.
public void printSum(int num1, int num2) {
	System.out.println( num1 + num2);
}
Since the method printSum does not return any value, the return type of the method is void. By this the compiler understands that this method does not return any.

Considering the above two methods are available, select all the correct statements from the below code:
int total1 = printSum(4, 5); //Statement 1
int total2 = sum(4, 5); //Statement 2
System.out.println(printSum(1, 2)); //Statement 3
System.out.println(sum(1, 2)); //Statement 4


Answers

In Statement 2, the value of total2 = 9.

Statement 4 prints a value of 3 to console.