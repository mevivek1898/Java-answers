magine a variable or a reference to be a cup (something like a coffee cup ).

We have 2 types of cups. We will call the cups which are of type primitive as variables and the cups which are of type classes or arrays as references.

Meaning
int age; 		// age		 primitive 
String firstName; 	// firstName	 reference 
int[] marksArr; 	// marksArr	 reference 
String[] cityNamesArr;	// cityNamesArr	 reference Once we mark one of the cups  as final, they can be assigned a value only once. For example:

final int age;
age = 20; // this is a valid statement
age = 30; // compiler will give an error on this line stating the final variable age is already assigned a valueThe same applies to cups  which are of type references.

In case of references, the cup  once assigned a reference cannot be assigned a new reference. However, the object which the reference points to (or refers to) can undergo changes by operations (method calls) on the object.

Same is the case with arrays, since arrays are also objects. For example:
final int[] marksArr1 = {20, 30, 40};
final int[] marksArr2 = {10, 20, 30};
marksArr1[0] = 70;	// this is a valid statement, // since we are not changing the value in the cup  marksArr1// we are changing the value inside the object pointed by the cup  marksArr1
marksArr1 = marksArr2;	 // compiler will throw an error on this line// stating final variable marksArr1 cannot be reassignedSelect all the correct statements from the below code:
class A {
	private final int id;
	private final String name;
	private String comments;
	public A(int id, String name, String comments) {
		this.id = id;			// statement 1
		this.name = name;		// statement 2
		this.comments = comments;	// statement 3
	}
	public void setComments(String comments) {
		this.comments = comments;	// statement 4
	}
}
public class TestA {
	public static void main(String[] args) {
		A a1 = new A(3, "Car", "Red Car");
		final A a2 = new A(4, "Jeep", "Green Jeep");
		a2.setComments("Black Jeep");	// statement 5
		a2 = a1;			// statement 6
	}
}


Answer 
Statement 4 will not result in a compilation error, since field comments is not declared as
Statement 6 will result in a compilation error.
