Calendar class provides many useful methods for date and time manipulations.
roll(int field, int amount)
add(int field, int amount)
compareTo(Calendar anotherCalendar) - returns 1 if greater, 0 if equal and -1 if lesser


Write the missing code in the below program.

In this program CalendarAddition class is created with a method name addDays which passes two arguments to add the specified amount of time to the given calendar field. Parse the string using simpleDateFormate. In add method add the number of days to the calendar field.

Consider the following example for your understanding.
Adding (10) days to Feb-19-2005 gives Mar-01-2005
 


package q11590;
import java.util.*;
import java.text.SimpleDateFormat;
import java.text.ParseException;
public class CalendarAddition {
	public String addDays(String dateString, int days) throws ParseException {
		// use the correct format string as argument for the constructor
		SimpleDateFormat sd = new SimpleDateFormat("MMM-dd-yyyy");
		
		// parses text from the beginning of the given string to produce a date
		Date date =  sd.parse(dateString);

		Calendar cal = Calendar.getInstance();
		
		// configuring the cal object to the value of date
		cal.setTime(date);

		// supply the correct arguments to the add method below
		cal.add(Calendar.DATE,days);

		// format method on SimpleDateFormat returns a string representation of the passed date
		return sd.format(cal.getTime());
	}
}