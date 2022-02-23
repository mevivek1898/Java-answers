Java compiler automatically converts primitive types to their corresponding wrapper classes when needed. This is called Autoboxing.

Similarly, when the conversion is from a wrapper class to its corresponding primitive type, it is called Unboxing.

For example, in the below code, in the expression where total is calculated, num2 is converted (unboxed) from Integer to int and the summation is again converted (autoboxed) from int to Integer before being assigned to total:
int num1 = 20;
Integer num2 = new Integer(10);
Integer total = num1 + num2;
Note: Autoboxing and Unboxing is a concept employed by compiler. The programmer only needs to understand how the compiler employs it.

Understanding the above concept, select all the correct statements for the below code:
public class AutoBoxingExample {	 
	public static void main(String[] args) {
		int num1 = 3; //statement 1
		System.out.println("Square of " + num1 + " is : " + calculateSquare(num1)); //statement 2
	}
	
	public static Integer calculateSquare(Integer number) { //statement 3
		return number * number;  //statement 4
	}
}


Answer

In statement 4, number is first unboxed and later the product is autoboxed gain before being returned.

