  
Close120%00:11 Secs
L46
Date, DateFormat and Calendar
Q. No : 11592
Understanding classes in java.time package 
The java.time package introduced in Java 8 contains many new classes apart from replacements for the existing Date, DateFormat and Calendar classes.

For a complete list of new classes in java.time package click here.

Below are list of a few important classes:
Instant - represents a moment on the time-scale. Unlike the java.util.Date which measures till milliseconds, an Instant records even nanoseconds.
LocalDate - represents a date without the time component
LocalTime - represents a time without the date component
LocalDateTime - represents an object with both date and time components
ZonedDateTime - represents a complete date-time object with time-zone
See and retype the below code.



package q11592;
import java.time.*;
import java.time.temporal.*;
public class LocalDateDemo {
	public static void main(String ... args) {
		LocalDate javaBirthday = LocalDate.of(1995, Month.MAY, 23);
		TemporalAdjuster adjuster = TemporalAdjusters.next(DayOfWeek.SUNDAY);
		LocalDate nextSunday = javaBirthday.with(adjuster);
		System.out.printf("Java's birthday was on %s, and the cake was cut on next Sunday : %s.%n", javaBirthday, nextSunday);
	}
}