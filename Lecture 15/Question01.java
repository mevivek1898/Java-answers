Write a class IsWorkingDay with a main method. The method receives one command line argument which is the name of the weekday.

Write the missing code in the If-else statement such that if the argument passed to the main method is equal to Sunday the program should print Holiday, otherwise it should print Working Day.

For Example:
Cmd Args : Sunday
Holiday
Note: We use public boolean equals(Object anObject) method to check if two strings have the same value. This method will be explained in more detail in later sections.

Note: Please don't change the package name.


package q10844;
public class IsWorkingDay {
	public static void main(String[] args) {
		//Fill in the missing code using if-else statement
		if (args[0].equals("Sunday")){
			System.out.println("Holiday");
		}else{
			System.out.println("Working Day");
		}

		
		
	}
}