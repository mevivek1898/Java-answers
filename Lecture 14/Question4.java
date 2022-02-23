See the below code which uses a if-then-else statement for calculating AM or PM for a given hour.

The class AmPmCalculator has a method checkAmPm it takes one parameter hour of type int, with value between 0 and 23. The method should use if-then-else statement to display AM or PM.

Fill in the if condition to check if hour is between 0 and 11 (both inclusive) for AM. Fill in the else if condition to check if hour is between 12 and 23 (both inclusive) for PM

Note: Use System.out.println() instead of System.out.print().

package q10849;
public class AmPmCalculator {
	public void checkAmPm(int hour) {
		if (hour>=0 && hour<=11 ) { //fill the condition for AM here 
			System.out.println("AM");
		} else if (hour>=12 && hour<=23) { //fill the condition for PM here
			System.out.println("PM");
		} else { 
			System.out.println("Invalid Hour!!");
		}
	}
}
