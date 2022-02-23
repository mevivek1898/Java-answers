In a switch statement when a break; is not used under a case, a fall-through happens.

Meaning when the value matches such a case, the control flow will execute the statements under that case and will continue to execute other cases present under it until it encounters a break; statement.

For example, click on the Submit without making any changes to the below code to observe the fall-through. Observe the output when 1, 2, 3, 4 or 10 is passed.

In the below program, class FallThroughDemo is passed an integer argument into its main(...) method.

The code in the main(...) method converts the first argument available in args[0] into an integer value and uses it in the switch statement.

In the program given below, add break; statements appropriately inside the switch statement such that when :
 1 is passed, the code should print
One
Two
Three
 2 is passed, the code should print
Two
Three
 3 is passed, the code should print
Three
 4 is passed, the code should print
Four
 10 is passed, the code should print
Ten
 any other number except 1, 2, 3, 4 and 10 is passed, the code should print
Some other number


Note: Please don't change the package name.

package q10872;
public class FallThroughDemo {
public static void main(String[] args) {
int value = Integer.parseInt(args[0]);
switch (value) {
      case 1:	
      	System.out.println("One");
		System.out.println("Two");
		System.out.println("Three");
		break;
	case 2:
		System.out.println("Two");
		System.out.println("Three");
		break;
    case 3:
		System.out.println("Three");
		break;
	case 4:
		System.out.println("Four");
		break;
	case 10:
		System.out.println("Ten");
		break;
	default:
	     System.out.println("Some other number");
    }
  }
}