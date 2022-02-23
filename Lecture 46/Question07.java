Calendar is an abstract class, which means we cannot create an instance of a Calendar class directly.

The Calendar class provides a static method called Calendar.getInstance(), which returns an object of type Calendar.
Calendar currentTime = Calendar.getInstance();
The above getInstance() method creates a Calendar object which is initialized with the current system time at that moment.

In most cases getInstance() returns an instance of GregorianCalendar which is a subclass of Calendar.

Also note that the above method uses the system's default locale, we can use another method Calendar.getInstance(Locale locale) to create a Calendar object with a specific locale. (We will learn about Locale when we learn about DateFormat)

Calendar also has two methods to reset the time component it represents, after a calendar instance is created.
setTime(Date newTime) - (note it has a corresponding getTime() method which returns a Date object for the Calendar's time component.)
setTimeInMillis(long timeInMilliSeconds)
Calendar has a generic method called get(int field). The field value can be any of the fields declared in the Calendar class like: Calendar.YEAR, Calendar.MONTH, Calendar.DAY_OF_MONTH, Calendar.WEEK_OF_MONTH, Calendar.DAY_OF_YEAR, Calendar.HOUR, Calendar.HOUR_OF_DAY, Calendar.MINUTE, Calendar.SECOND, Calendar.MILLISECOND, etc.

Similar to the get(int field) method, Calendar also has a set(int field, int value) method which is used to reset any of the above mentioned fields in a Calendar object.

(Note that the value returned for MONTH field starts with 0. For example - value for January is 0, February is 1 ...)

Write the missing code in the below program. A calendarDemo class is created with a setTime method which passes one argument. SimpleDateFormat is used to parse the string and produce the date. Calendar setTime method is used to set time to the value of date.



package q11589;
import java.util.*;
import java.text.SimpleDateFormat;
import java.text.ParseException;
public class CalendarDemo {
	public String setTime(String dateString) throws ParseException {
		// use the correct format string as argument for the constructor
		SimpleDateFormat sd = new SimpleDateFormat("MMM-dd-yyyy");
		
		// parses text from the beginning of the given string to produce a date
		Date date =  sd.parse(dateString);
		
		
		Calendar currentTime = Calendar.getInstance();
		
		//// configuring the current object to the value of date
    	currentTime.setTime(date);
    	
    	// format method on SimpleDateFormat returns a string representation of the passed date
    	return sd.format(currentTime.getTime());
	}
}
		