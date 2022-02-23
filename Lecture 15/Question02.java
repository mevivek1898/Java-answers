Create a class IsWorkingDay with a main method. The method receives one command line argument which is the name of the weekday. If the argument is equal to Sunday or Saturday the program should print Holiday, otherwise it should print Working Day.

For Example:
Cmd Args : Monday
Working Day
Note: Please don't change the package name.

package q10845;
class IsWorkingDay{
	public static void main(String[] args){
		if(args[0].equals("Sunday") || args[0].equals("Saturday")){
			System.out.println("Holiday");
		}else{
			System.out.println("Working Day");
		}
	}
}