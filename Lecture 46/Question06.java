SimpleDateFormat is a concrete implementation of the abstract class DateFormat.

An instance of SimpleDateFormat class can be created using one of the below four constructors:
SimpleDateFormat() - creates default SimpleDateFormat object with default locale.
SimpleDateFormat(String pattern) - creates a SimpleDateFormat object with the given pattern.
SimpleDateFormat(String pattern, DateFormatSymbols formatSymbols) - creates a SimpleDateFormat object with the given pattern and custom date format symbols.
SimpleDateFormat(String pattern, Locale locale) - creates a SimpleDateFormat object with the given pattern and locale.
The pattern string is a sequence of characters which have special meanings. Click here to view all the pattern characters with their meanings under the section titled Date and Time Patterns.

After a SimpleDateFormat object is created applyPattern(String pattern) method can be used to modify the pattern.

Below are the two important methods of DateFormat that can be called on a SimpleDateFormat instance:
format(Date date) - formats the Date object as text.
parse(String dateText) - creates a Date object by parsing the dateText.


Note that if text has to be included as it is in the pattern, the text has to be surrounded in single quotes.

Write a class with name SimpleDateFormateDemo. In the main method create a Date object by parsing the given dateText 15-08-1947 and print the same.

The output should be
parsedDate : Fri Aug 15 00:00:00 GMT 1947


package q11399;
import java.util.*;
import java.text.*;
public class SimpleDateFormatDemo {
	public static void main(String ... args) throws ParseException {
		String dateText = " ";
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MM-yyyy");
		// parse the dateText here and print.
		Date Nashe = simpleDateFormat.parse("15-08-1947");
		System.out.println("parsedDate : "+ Nashe);
	}
}