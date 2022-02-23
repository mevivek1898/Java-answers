In Java, a class when declared with abstract keyword becomes an abstract class. For example:
public abstract class A {
}
As per the dictionary, abstract means not concrete. In object oriented languages also, when a class is marked with abstract keyword, it indicates that the class is not concrete. It cannot be instantiated. Meaning, the Java compiler will given an error, saying abstract class A cannot be instantiated, if we write a statement like A a = new A();.

Abstract classes like normal (concrete) classes can have fields, constructors and methods.

Abstract classes can also have one or more abstract methods. An abstract method should have the keyword abstract in its signature and it should not have a method body. For example:
public abstract int sum(int num1, num2);
A concrete class is not allowed to have a method declared as abstract. Java compiler will throw an compilation error if an attempt is made to declare an abstract method in a concrete class.

In interfaces, the method declarations with signatures and without method bodies are by default marked abstract. However, in a abstract class we have to mark a method explicitly with abstract keyword.

Abstract classes are present so only to be inherited by other classes. Abstract classes usually contain common code that can be shared by the subclasses.

See and retype the below code to understand how to write and use abstract classes.

After executing, from the output you will realize that the classes EnglishGreeting and SpanishGreeting have inherited the implementation of getStandardMessage method from the abstract class AbstractGreeting.

If the classes EnglishGreeting and SpanishGreeting were written such that they did not extend from the abstract class and have instead implemented the Greeting interface directly, they would have been forced to individually provide the implementation for getStandardMessage method, resulting in duplication of code.

Note: Please don't change the package name.


package q11285;
public class AbstractDemo {
	public static void main(String[] args) {
		Greeting english = new EnglishGreeting();
		Greeting spanish = new SpanishGreeting();
		System.out.println(english.getStandardMessage("Winston"));
		System.out.println(english.getCustomMessage("Winston"));
		System.out.println(spanish.getStandardMessage("Martin"));
		System.out.println(spanish.getCustomMessage("Martin"));
	}
}
interface Greeting {
	public String getStandardMessage(String name);
	public String getCustomMessage(String name);
}
abstract class AbstractGreeting implements Greeting {
	public String getStandardMessage(String name) {
		return "Hi " + name;
	}
	public abstract String getCustomMessage(String name);
}
class EnglishGreeting extends AbstractGreeting {
	public String getCustomMessage(String name) {
		return "Hello " + name;
	}
}
class SpanishGreeting extends AbstractGreeting {
	public String getCustomMessage(String name) {
		return "Holla " + name;
	}
}