Create a class PrintWorkingHour with a public method checkWorkingHour that takes one parameter hour of type int.

If the hour is in between 9 and 17 (both inclusive) the program should print Working hour, otherwise it should print Non-working hour.

For Example:
Cmd Args : 14
Working hour
Note: Please don't change the package name.


package q10922;

public class PrintWorkingHour {
	
	public void checkWorkingHour(int hour) {
		
		//Nrite your code here
		
		if(hour>=9 && hour<=17){
			
			System.out.println("Working hour");
			
		}else{
			
			System.out.println("Non-working hour");
			
		}
		
	}
	
	
	
}