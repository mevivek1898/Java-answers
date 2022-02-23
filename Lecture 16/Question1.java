A switch statement allows the value of a variable or expression to change the control flow of program execution through multiple paths.
Let us consider that for a given random number between 1 and 10, we want to print the corresponding English word i.e. if 2 is given we print Two, 5 is given we print Five and so on.
One way is to write a long nested if-else-if for the 10 numbers, the other way is to use a switch statement.
Below is the basic syntax of a switch statement:

	int value = 4;
	switch (value) { // start of switch-block
		case 1:
			System.out.println("One");
			break; // this ensures that we exit the switch block after printing One
		case 2:
			System.out.println("Two");
			break;		
		case 3: 
		...
		...
		default: 
			System.out.println("Number " + value + " is not between 1 and 10");
	} // end of switch-block
The switch (aValue) statement takes a variable/reference or an expression as the aValue and always has a switch-block.
The switch-block starts with an opening-brace { and concludes with a closing-brace }.
The case 1:, case 2: and default : are called labels.
The code below a case aValue: label is executed whose aValue matches the value passed into the switch (aValue) statement.
If no case matches the aValue passed in the the switch (aValue) statement, then the code under default: label is executed if it exists.
The switch block can contain any number of case : labels and one default: label.
The break; statement is a branching statement. It causes transfer of execution immediately to the end switch block, skipping all other cases if any below the break;.


Click on  to understand the working of switch-case construct.

Note: char, byte, short, int, Character, Byte, Short, Integer, String, or an enum type are the valid types whose values can be passed into a switch(aValue) statement.

In the below program the class PrintTextForm is passed a number as argument into its main(...) method. The code in the main(...) method converts the first argument it receives from String into an int and employs a switch statement to print the text form of the number.

Fill in the missing code to handle and print the missing numbers between 1 to 10.

Note: Make sure to use println(...) method and not print(...). Ensure that the spelling of the number starts with a capital letter.

Note: Please don't change the package name.


package q10870;
public class PrintTextForm {
	public static void main(String[] args) {
		int value = Integer.parseInt(args[0]);
		switch (value) {
			case 1:
				System.out.println("One");
				break;
			case 2:
				System.out.println("Two");
				break;
			// Fill in the missing code below for the remaining cases
		  
		    	
		    	case 3:
		    		
		    		System.out.println("Three");
		    		
		    		break;
		    		
		    		case 4:
		    			
		    			System.out.println("Four");
		    			
		    			break;
		    			
		    			case 5:
		    				
		    				System.out.println("Five");
		    				
		    				break;
		    				
		    				case 6:
		    					
		    					System.out.println("Six");
		    					
		    					break;
		    					
		    					case 7:
		    						
		    						System.out.println("Seven");
		    						
		    						break;
		    						
		    						case 8:
		    							
		    							System.out.println("Eight");
		    							
		    							break;
		    							
		    							case 9:
		    								
		    								System.out.println("Nine");
		    								
		    								break;
		    								
		
			case 10:
				System.out.println("Ten");
				break;
			default:
				System.out.println("Number " + value + " is not in the range 1 to 10");
		}
	}
}