DateFormat is an abstract class which provides methods for parsing text to Date objects and formating Date objects to text.

DateFormat class has static methods to create instance of DateFormat objects.
DateFormat df1 = DateFormat.getInstance(); 
// the above code creates a date and time formatter instance which uses the SHORT style

DateFormat df2 = DateFormat.getDateInstance(); 
// the above line creates a date foramatter instance with system's Locale  

DateFormat df3 = DateFormat.getDateInstance(DateFormat.LONG, Locale.FRANCE);
// the above line creates a date formatter instance with French Locale in long format
A Locale object represents a specific geographical, political, or cultural region and their attributes. For example, the month August is called August in English and Août in French.

The Locale class allows for displaying numbers, currencies, date and time information according to user's native language, country and cultural settings.

SimpleDateFormat is one of the most useful implementation sub-class of DateFormat class.

Note that the formatting classes like DateFormat and SimpleDateFormat are present in the java.text package.


Write a class named DateFormatInJapan with a static method getJapaneseShortDate(). The method should accept one parameter of type Date. It should return a formatted date as String from the passed parameter using JAPAN locale in SHORT format.

Sample Output:
Oct 2, 1869 in Japan is: 1869/10/02


package q11398;
import java.util.*;
import java.text.*;
public class DateFormatInJapan {
	public static String getJapaneseShortDate(Date date) {
		Format f=new SimpleDateFormat("yyyy/MM/dd");
		String ans=f.format(date);
		return ans;
		
	}
}