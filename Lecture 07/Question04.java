Create a class HolidaysCalculator with a main method. The method receives two command line arguments the first argument contains the count of national holidays declared in that country and the second argument contains a count of company specific holidays. Write a code to print the total number of holidays as the sum of both national and company holidays.

For example:
Cmd Args : 3 4
totalHolidays = 7


Note: Please don't change the package name.



Answer 

package q10780;
public class HolidaysCalculator {
	public static void main(String[] args) {
		byte nationalHolidays = Byte.parseByte(args[0]);
		byte companyHolidays = Byte.parseByte(args[1]);
		byte totalHolidays =(byte)(nationalHolidays + companyHolidays);
		System.out.println("totalHolidays = " + totalHolidays);
	}
}