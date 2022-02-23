The Date class is a simple wrapper over an instance of time, represented as a long, just like the Integer class is a wrapper over an int value.

A Date object can be created using one of the below two constructors:
Date() - creates a new instance of Date object which represents the time at which it is created.
Date(long time) - creates a new instance of Date object which represents the specified number of milliseconds specified by the variable time, starting from the "the epoch", namely January 1, 1970, 00:00:00 GMT
The various methods in the Date class like getDay(), getHour(), getYear() etc., are all deprecated and should not be used.

We should instead use their alternatives provided in the Calendar class. We will learn more about the Calendar class later.

Date class has one useful method called getTime() which returns the number of milliseconds starting from January 1, 1970, 00:00:00 GMT represented by a date object as a long.

Note: System class also has a method called System.currentTimeMillis() which will return the current time as milliseconds from the epoch time (January 1, 1970, 00:00:00 GMT) as a long value.

See and retype the below code.


package q11397;
import java.util.*;
public class DateExample {
	public static void main(String ... args) throws InterruptedException {
		System.out.println("Sleeping for 1 second...");
		Date timeAsDate = new Date();
		long oldTimeInMillis = timeAsDate.getTime();
		Thread.sleep(1000);
		long newCurrentTimeInMillis = System.currentTimeMillis();
		if (newCurrentTimeInMillis - oldTimeInMillis >= 1000) {
			System.out.println("This thread resumed after 1 or more seconds");
		}
	}
}