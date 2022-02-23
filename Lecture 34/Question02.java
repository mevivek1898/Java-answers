  
Close100%00:05 Secs
L34
Method Overloading
Q. No : 11266
Write a Java program to implement Method overloading 
Write a Java program with a class name Addition with the methods add(int, int), add(int, float), add(float, float) and add(float, double, double) to add values of different argument types.

Write the main(String[]) method within the class and assume that it will always receive a total of 6 command line arguments at least, such that the first 2 are int, next 2 are float and the last 2 are of type double.

If the main() is provided with arguments : 1, 2, 1.5f, 2.5f, 1.0, 2.0 then the program should print the output as:
Sum of 1 and 2 : 3
Sum of 1.5 and 2.5 : 4.0
Sum of 2 and 2.5 : 4.5
Sum of 1.5, 1.0 and 2.0 : 4.5


package q11266;
public class Addition {
	static void add(int x,int y){
		System.out.println("Sum of "+x+" and "+y+" : "+(x+y));
	}
	static void add(int x,float y){
		System.out.println("Sum of "+x+" and "+y+" : "+(x+y));
	}
	static void add(float x,float y){
		System.out.println("Sum of "+x+" and "+y+" : "+(x+y));
	}
	static void add(float x,double y, double z){
		System.out.println("Sum of "+x+", "+y+" and "+z+" : "+(x+y+z));
	}
	public static void main(String[] args){
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		Float c = Float.parseFloat(args[2]);
		Float d = Float.parseFloat(args[3]);
		double e = Double.parseDouble(args[4]);
		double f = Double.parseDouble(args[5]);
		add(a,b);
		add(c,d);
		add(b,d);
		add(c,e,f);
	}
}