  
Close100%00:04 Secs
L34
Method Overloading
Q. No : 11267
Write a Java program to implement Constructor overloading 
Write a class Box which contains the data members width, height and depth all of type double.

Write the implementation for the below 3 overloaded constructors in the class Box :
Box() - default constructor which initializes all the members with -1
Box(length) - parameterized constructor with one argument and initialize all the members with the value in length
the members with the corresponding arguments
Box(width, height, depth) - parameterized constructor with three arguments and initialize
Write a method public double volume() in the class Box to find out the volume of the given box.

Write the main method within the Box class and assume that it will receive either zero arguments, or one argument or three arguments.

For example, if the main() method is passed zero arguments then the program should print the output as:
Volume of Box() is : -1.0
Similarly, if the main() method is passed one argument : 2.34, then the program should print the output as:
Volume of Box(2.34) is : 12.812903999999998
then the program should print the output as: Likewise, if the main() method is passed three arguments : 2.34, 3.45, 1.59, then the program should print the output as:
Volume of Box(2.34, 3.45, 1.59) is : 12.836070000000001




package q11267;
public class Box{
	double width , height , depth;
	
	Box(){
		width = -1;
		height = -1;
		depth = -1;
	}
	
	Box(double L){
		width = L;
		height = L;
		depth = L;
	}
	
	Box(double w ,double h , double d){
		width = w;
		height = h;
		depth = d;
	}
	
	public double volume(){
		return width*height*depth;
	}
	
	public static void main(String...args){
		double a,b,c;
		if(args.length==0){
			Box obj = new Box();
			System.out.println("Volume of Box() is : "+obj.volume());
		}
		if(args.length==1){
			a = Double.parseDouble(args[0]);
			Box obj = new Box(a);
			System.out.println("Volume of Box("+a+") is : "+obj.volume());
		} 
		else if(args.length==3){
			
			a = Double.parseDouble(args[0]);
			b = Double.parseDouble(args[1]);
			c = Double.parseDouble(args[2]);
			Box obj = new Box(a,b,c);
			System.out.println("Volume of Box("+a+", "+b+", "+c+")"+" is : "+obj.volume());
		}
	}
}