A constructor is a special method (block of code) which is used to create instances of a class.

A constructor is also used to initialize the fields of a class, which you will notice in the below code.

A constructor's name must always be the same as the class name, which in this case is Student.

A constructor is a special method which does not have a return type.

It is a good practice to provide the arguments in the same order as they are declared in the class, if they happen to be the fields of the class.

In the below code note the usage of this to differentiate the identifiers with same names in different scopes.

For example, in the statement this.id = id;, this.id refers to the instance field private String id;, and the id, which is after the assignment operator (=) refers to the String id passed as parameter into the constructor.

See the code and retype the same code.


'


package q11142;
public class Student {
	private String id;
	private String name;
	private int age;
	private char gender;
	
	public Student(String id, String name, int age, char gender) {
		this.id = id;
		this.name = name;
		this.age = age;
		this.gender = gender;
	}
}

