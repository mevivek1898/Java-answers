package q10771;
public class CalculateDifference {
	public static void main(String[] args) {
		// In the below two lines write code to convert
		// the string value passed in args[0] and args[1] into int values using Integer.parseInt method
		// convert the value in args[0] to int and store in firstValue
		// convert the value in args[1] to int and store in secondValue
		int firstValue = Integer.parseInt(args[0]);
		int secondValue =Integer.parseInt(args[1]);
		System.out.println("The difference of args[0] and args[1] is : " + (firstValue - secondValue));
	}
}