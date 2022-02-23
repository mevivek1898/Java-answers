The super keyword in java is used to refer/access either a member field, method or a constructor present in the super class hierarchy of the current class where the super keyword is used.

The super keyword can be used to :
access the member fields of parent class when both parent and child class have member fields with same name
explicitly call the default or parameterized constructors of parent class
access the method of parent class when child class has overridden that method
When both the child and parent class contain variables with same names, we can access the member field of parent class inside the child class by using the syntax:
super.variableName
When an instance of subclass is created, the new keyword invokes the constructor of child class. This invocation of constructor in the subclass implicitly invokes the constructor of the parent class, if we do not explicitly write code to invoke the constructor of super class using super.

Hence, we should always remember that when we create an object of child class, the parent class constructor is executed first and then the child class constructor is executed.

Supposing we do not write code to call the super class constructor in the child class constructor, then the compiler implicitly adds super() (this invokes the no argument constructor of parent class) as the first statement in the constructor of child class. If the parent class does not have a default constructor (constructor with no parameters), then the programmer should explicitly call the parameterized constructor else the compiler will flag and error saying there is no default constructor in the super class.

Below is the syntax for calling the parameterized constructor of a parent class :
super(parameter-list);
The call to the parent class constructor must be the first statement inside the child class constructor.

The super keyword can also be used to invoke parent class method. It is used in case of method overriding.

In other words super keyword is used when the base class method name and the derived class method name is same.

The syntax of calling a method of the super class using super keyword is:
super.methodName();
See and retype the below code to understand the usage of super keyword.


Answer

package q11272;
class SuperClass {
	int num;
	public SuperClass(int value) {
		num = value;
	}
	public void printHello() {
		System.out.println("Hello from SuperClass");
	}
}
class SubClass extends SuperClass {
	int num;
	public SubClass(int value) {
		super(value);
		num = value + 5;
		System.out.println("SuperClass number = " + super.num);
		System.out.println("SubClass number = " + num);
	}
	public void printHello() {
		super.printHello();
		System.out.println("Hello from SubClass");
	}
}
public class SuperKeyword {
	public static void main(String[] args) {
		SubClass obj = new SubClass(10);
		obj.printHello();
	}
}