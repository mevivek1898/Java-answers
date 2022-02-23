The syntax for executing common code on similar conditions in a switch statement is given below:
switch (val) {
	case 1: 
	case 2:
		statement_1; //do something
		break;
	case 3:
	case 4:
		statement_2; //do something else
		break;
	default:
		statement_3; //do yet another thing
}
In the above switch statement, when the val is 1 or 2, statement_1 will be executed.

Similarly, when the val is 3 or 4, statement_2 will be executed. And for all other values statement_3 under the default: case will be executed.

The below program with class named HappyDays is passed a String argument into its main(...) method.

The code in the main(...) method uses the switch statement to mark the type of day.

Fill in the missing code in the switch statement such that it prints saying the given day :
is a Working Day - when the arg[0] is equal to Monday or Tuesday or Wednesday or Thursday
is a Semi-Working Day - when the arg[0] is equal to Friday
is a Happy Day! - when the arg[0] is equal to either Saturday or a Sunday
is not a valid day of week - when the text in arg[0] does not represent a day in a week


Note: Please don't change the package name.

package q10871;
public class HappyDays {
	public static void main(String[] args) {
		// Fill in the missing code inside the switch statement
		switch (args[0]) {
		case "Monday":
			
			case "Tuesday":
				
				case "Wednesday":
					
					case "Thursday":
						
						System.out.println(args[0] + " is a Working Day");
						
						break;
						
						case "Friday":
							
							System.out.println(args[0] + " is a Semi-Working Day");
							
							break;
							
							case "Saturday":
								
								case "Sunday":
									
									System.out.println(args[0] + " is a Happy Day!");
									
									break;
									
									default :
									
									
									
									System.out.println(args[0] + " is not a valid day of week");
		}						
	}
}