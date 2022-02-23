package q10776;
public class HolidaysCalculator {
	public static void main(String[] args) {
		short nationalHolidays =Short.parseShort(args[0]) ;
		short companyHolidays =Short.parseShort(args[1]) ;
		short totalHolidays = (short)(nationalHolidays + companyHolidays);
		System.out.println("totalHolidays = " + totalHolidays);
	}
}