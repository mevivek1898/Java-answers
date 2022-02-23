Write a Java program with a class name OverloadArea with overload methods area(float) and area(float, float) to find area of square and rectangle.

Write the main method within the class and assume that it will receive a total of 2 command line arguments of type float.

If the main() is provided with arguments : 1.34, 1.98 then the program should print the output as:
Area of square for side in meters 1.34 : 1.7956
Area of rectangle for length and breadth in meters 1.34, 1.98 : 2.6532001


package q11268;
public class OverloadArea {
	// Write the overload methods
	static float area(float a){
		return a*a;
	}
	static float area(float a,float b){
		return a*b;
	}
	public static void main (String[] args) {
		// Write the code
		Float f1 = Float.parseFloat(args[0]);
		Float f2 = Float.parseFloat(args[1]);
		System.out.println("Area of square for side in meters " + f1 + " : " +area(f1) ); // Fill in the missing code
		System.out.println("Area of rectangle for length and breadth in meters " + f1 + ", " + f2 + " : " +area(f1,f2) ); // Fill in the missing code
	}
}