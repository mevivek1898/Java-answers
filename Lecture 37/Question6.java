values():

We can obtain an array of all the possible values of a Java enum type by calling its static method values(). All enum types get a static values() method automatically by the Java compiler. Here is an example of iterating all values of an enum:
enum Subject{
JAVA, C, PYTHON
}
Iteration can be done for the above enum class using the method value() can be done by
for(Subject sub : Subject.values()) {
	System.out.println(sub);
}



package q24199;
public class Test {
	public static void main(String args[]) {
		
		// Iterate over the elements in enum and print them
		for(Languages v:Languages.values()) System.out.println(v);
	}
}
enum Languages {
	JAVA,
	PYTHON,
	C,
	CPP,
	DBMS
}