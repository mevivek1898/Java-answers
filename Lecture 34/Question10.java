Write a Java program to access the class members using super Keyword.

Create a class called SuperClass with the below members:
declare two member fields value1 and value2 of type int
a parameterized constructor with two arguments, which assigns two arguments to the members respectively
a method called show() which will print This is super class show() method as well as the value of value1.
Create another class called SubClass which is derived from the class SuperClass, and has the below members:
declare two member fields value3 and value4 of type int
a parameterized constructor with four arguments, which assigns the first two arguments with SuperClass members and next two values with SubClass members
a method called show() which
will print This is sub class show() method
will call show() of SuperClass
will print value2 from SuperClass
will print value3 of SubClass
will print value4 of SubClass
Write a class AccessUsingSuper with the main() method, create an object to SubClass which calls the method show().

For example, if the input is given as [10, 20, 30, 40] then the output should be:
This is sub class show() method
This is super class show() method
value1 = 10
value2 from super class = 20
value3 = 30
value4 = 40


package q11274;
class SuperClass {
	int value1, value2;
	// Write the code
	SuperClass(int v1,int v2){
		value1=v1;
		value2=v2;
	}
	public void show(){
		System.out.println("This is super class show() method");
		System.out.println("value1 = "+value1);
	}
}

class SubClass extends SuperClass {
	int value3, value4;
	// Write the code
	SubClass(int v1,int v2,int v3,int v4){
		super(v1,v2);
		
		value3 = v3;
		value4 = v4;
	}
	public void show(){
		
		System.out.println("This is sub class show() method");
		super.show();
		System.out.println("value2 from super class = "+value2);
		System.out.println("value3 = "+value3);
		System.out.println("value4 = "+value4);
	}
}

public class AccessUsingSuper {
	public static void main(String[] args) {
		SubClass obj = new SubClass(Integer.parseInt(args[0]), Integer.parseInt(args[1]), Integer.parseInt(args[2]), Integer.parseInt(args[3]));
		obj.show();
	}
}