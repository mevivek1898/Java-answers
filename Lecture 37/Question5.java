In Java, along with primitives, classes, interfaces and abstract classes, there is yet another type called enum.

An enum is essentially a set of named values called as members or elements. Like a class, an enum can also have fields and methods.

For example, let us consider the four directions East, West, North and South. We can represent them as primitive int constants or as String literals. Below example uses int constants:
final int EAST = 1;
final int WEST = 2;
final int NORTH = 3;
final int SOUTH = 4;
int direction = SOUTH;
switch (direction) {
	case EAST:
		System.out.println("East stands for Light!");
		break;
	case WEST:
		System.out.println("West stands for Strength!");
		break;
	case NORTH:
		System.out.println("North stands for Silence!");
		break;
	case SOUTH:
		System.out.println("South stands for Love!");
		break;
	default:
		System.out.println("Unknown direction value : " + direction);
}
In the above example there is no restriction on a value like 5 or 6 being assigned to variable direction. There is no way for the compiler to syntactically enforce the bounds, saying we can assign only values between 1 and 4.

In such situations a more appropriate way to represent directions would be using enums. Enums are used when we are dealing with a known finite set of elements.

See and retype the below code to understand the usage of enum. Enums facilitate type checking during compile type, where the compiler will flag an error if one of the enum elements are not used where that enum type is specified.


package q11288;
public class EnumDemo {
	public static void main(String[] args) {
		System.out.println(printDirectionMessage(Direction.EAST));
		System.out.println(printDirectionMessage(Direction.WEST));
		System.out.println(printDirectionMessage(Direction.NORTH));
		System.out.println(printDirectionMessage(Direction.SOUTH));
	}
	public static String printDirectionMessage(Direction direction) {
		switch (direction) {
			case EAST:
				return "East stands for Light!";
			case WEST:
				return "West stands for Strength!";
			case NORTH:
				return "North stands for Silence!";
			case SOUTH:
				return "South stands for Love!";
		}
		return "Unknown direction. This case will never occur when we use enums.";
	}
}
enum Direction {
	EAST, WEST, NORTH, SOUTH;
}