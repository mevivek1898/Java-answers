Write a Java program to illustrate the abstract class concept.

Create an abstract class Shape, which contains an empty method numberOfSides().

Define three classes named Trapezoid, Triangle and Hexagon extends the class Shape, such that each one of the classes contains only the method numberOfSides(), that contains the number of sides in the given geometrical figure.

Write a class AbstractExample with the main() method, declare an object to the class Shape, create instances of each class and call numberOfSides() methods of each class.

Sample Input and Output:
Number of sides in a trapezoid are 4
Number of sides in a triangle are 3
Number of sides in a hexagon are 6



package q11287;

//Write the code

public class AbstractExample {
	public static void main(String[] args) {
		Shape s;
		s = new Trapezoid();
		s.numberofsides();
		s = new Triangle();
		s.numberofsides();
		s = new Hexagon();
		s.numberofsides();
	}
}

abstract class Shape

{
	
	abstract void numberofsides();
	
}

class Trapezoid extends Shape

{
	
	void numberofsides()
	
	{
		
		System.out.println("Number of sides in a trapezoid are 4");
		
	}
	
}

class Triangle extends Shape

{
	
	void numberofsides()
	
	{
		
		System.out.println("Number of sides in a triangle are 3");
		
	}
	
}

class Hexagon extends Shape

{
	
	void numberofsides()
	
	{
		
		System.out.println("Number of sides in a hexagon are 6");
		
	}
	
}

