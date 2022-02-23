The central classes in Java for working with Date and Time are Date, DateFormat and Calendar.

Date and Calendar classes are present in java.util package, while DateFormat is present in java.text package.

Starting with Java version 8, many new classes and enhancements were introduced for handling date and time, these are bundled in a new package named java.time.

We will learn about the new classes introduced in Java version 8 later.

Since a lot of code written before Java 8, heavily use Date, DateFormat and Calendar classes, we will first learn about them.
Date - represents an instance in time (stored as a primitive long). For example this moment. Though the name might suggest that it represents only a calendar date, like 7th July 1977, we should also remember that it actually has the time component to the precision of a millisecond.
DateFormat - provides the formating for dates and times on an given Locale
Calendar - provides methods to work with the instance of time represented by Date.
It is important to note that earlier Unix systems used a 32-bit signed integer to store time. They started counting time with the value 0 representing 1970-1-1 00:00:00. This is referred as the epoch time.

The time component represented by the Date object counts the milliseconds passed from the above mentioned epoch time.

See and retype the below code.


package q11315;
import java.util.*;
public class DateDemo {
	public static void main(String ... args) {
		Date thisMoment = new Date();
		long millisecondsSinceEpochStart = thisMoment.getTime();
		System.out.println("This Moment : " + thisMoment);
		System.out.println("Total milli seconds from epoch to this moment : " + millisecondsSinceEpochStart);
	}
}