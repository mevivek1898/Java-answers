If we consider a vehicle, say a car, we would immediately think of its model, colour, maximum speed etc. These are the various attributes also called properties of an instance of a car whose values could vary from model to model.

Similarly, when we consider a class say, Student, we can list the most common attributes/properties of a Student class as id, name, age, gender.

Note the spellings of id, name, age and gender they are written using camel-case convention and they all start with a lower case letter.

private is an access modifier like public and it is a Java keyword written in lower case.

int and char are primitive types written in lower case.
String is a class name and hence is written with the starting letter in upper case.

See the code and retype the same.

Note: Please don't change the package name.


package q11154;
public class Student {
	private String id;
	private String name;
	private int age;
	private char gender;
}