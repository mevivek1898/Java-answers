As the meaning of the word interface suggests, it is the point where two systems or subjects meet to interact.

Interface holds the same meaning in object oriented programming languages too. An interface defines a contract using which two classes/programs/systems can interact with each other.

In Java, interface is like a class, it is a reference type. It can have constants (they are not called fields), method signatures and nested members (we will learn more about nested members later).

The methods declared in interfaces should not contain the method body.
[Note: In Java 8 and later versions, interfaces can contain default and static methods which can contain method body. We will learn more about them in later sections.]
Only the method signature should be present with a semicolon as terminator. For example:
interface Person {
	public static final int RETIREMENT_AGE = 60;  // example of a constant 
	void setName(String name);  // only method signature without method body
	String getName();
	void setAge(int age);
	int getAge();
}
All methods declared in an interface are by default public and hence, we did not use the keyword public in the method signatures.

Interfaces cannot be instantiated. Meaning, Java compiler will throw out an error for a statement like : Person p = new Person();.

We can instantiate classes that implement the interface. Meaning, we can instantiate classes that provide the implementation for all the methods declared in the interface. For example:
public class Teacher implements Person {
	private String name;
	private int age;
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getAge() {
		return age;
	}
}
Now, we can say Teacher t = new Teacher(); or
Person p = new Teacher();

Note: An interface can extend another interface, whereas a class implements one or more interfaces.

Select all the correct statements from below code:
interface Citizen {
	String getNationality();	
}
interface Person {
	public static final int RETIREMENT_AGE = 60;
	void setName(String name);  // only method signature without method body
	String getName();
	void setAge(int age);
	int getAge();
}
public class Teacher implements Person, Citizen {  // statement 1
	private String name;
	private int age;
	private int nationality;
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getAge() {
		return age;
	}
	public void setNationality(String nationality) {
		this.nationality = nationality;
	}
	public String getNationality() {
		return nationality;
	}
}

Citizen c = new Citizen();  // statement 2
Citizen c = new Person();  // statement 3
Citizen c = new Teacher();  // statement 4
Person p = new Teacher();  // statement 5


Answer

Statement 2 will result in a compilation error because we cannot instantiate an interface.

Statements 4 and 5 do not result in compilation errors.