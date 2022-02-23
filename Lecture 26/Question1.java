An instance of a class in memory during program execution is called an object. It encapsulates state information using fields and behaviour using methods.

Instances of a class are created by using the new keyword followed by the constructor. For example:
String name = new String("Albert Einstien");
Date today = new Date();
Integer luckyNumber = new Integer(7);
In the above code name, today and luckyNumber are called references which store the address of the objects created in memory during execution.

In Java, dot . is used to access a member (field or a method) of an object. For example:
name.toLowerCase();
name.substring(6);
See and retype the below code, where two instances of Person class are created and stored in references named p1 and p2. Also notice the way we call the method getName() using the dot . on the references



package q11119;
public class Person {
	private String name;
	private int age;
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public String toString() {
		return "Person [name = " + name + ", age = " + age + "]";
	}
	public static void main(String[] args) {
		Person p1 = new Person("Albert Einstein", 25);
		Person p2 = new Person("Niels Bohr", 24);
		System.out.println("p1 = " + p1);
		System.out.println("p2 = " + p2);
		System.out.println("name of p1 is : " + p1.getName());
		System.out.println("name of p2 is : " + p2.getName());
	}
}

