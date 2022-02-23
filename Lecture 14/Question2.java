The if-else-if construct extends the if-else construct by allowing to chain multiple if constructs as shown below:
if (expression_1) {
	statement_1;
} else if (expression_2) {
	statement_2;
} else if (expression_3) {
	statement_3;
} else if (expression_4) {
	statement_4;
} else {
	statement_5;
}
As shown in the above syntax, multiple if constructs can be chained to any length. The else construct which appears at the end is optional, and if it is to be included it has to be only at the end.

The if-else-if construct is used whenever we have multiple mutually exclusive if conditions which work on the same input.

In a if-else-if construct the conditions are evaluated from top to bottom. Whenever a condition evaluates to true (1), the control enters into that if-block and after that the control comes out of the complete if-else-if construct ignoring all the remaining if and else constructs that may exist below the currently satisfied if-block.

For example, if the condition in the expression_2 is the first condition to evaluate to true after executing statement_2 the control comes out of the complete if-else-if construct.

The below program TicketPrice has a method printTicketPrice it takes one parameter age of type int .

Write the missing lines of code inside the method which employs if-else-if statement to check the age and print appropriate ticket price according to the given age groups:
The price is 0 for an infant (less than or equal to 3 years) and a centenarian (greater than or equal to 100 years).
The price is 5 for an children (less than or equal to 13 years) and for senior citizens (greater than or equal to 60 years).
The price is 10 for all the remaining age groups.
Do no remove or change the existing values or print statements, fill in the missing conditions using the if-else-if statement.

Do use a the System.out.println() instead of System.out.print().

Note: Please don't change the package name.'



package q10847;
public class TicketPrice {
	int ia = 3;
	int c = 13;
	int s = 60;
	int ca = 100;
	
	public void printTicketPrice(int age) {
		
			//fill the appropriate if condition
			if(age<=3 || age>=100){
			System.out.println("Ticket Price: 0");
			}else if(age<=13 || age>=s){
			System.out.println("Ticket Price: 5");
		}else{	//fill the appropriate else condition
			System.out.println("Ticket Price: 10");
		}
	}
}
