valueOf():

The valueOf() method can be used to obtain an instance of the enum class for a given String value. Here is an example.
enum Subject{
JAVA, C, PYTHON
}
Iteration can be done for the above enum class using the method value() can be done by
Subject sub = Subject.valueOf("JAVA");
}

package q24200;
public class Test {
	public static void main(String args[]) {
		
		Languages a = Languages.valueOf("JAVA");
		
		Languages b = Languages.valueOf("PYTHON");
		
		Languages c= Languages.valueOf("C");
		
		Languages d = Languages.valueOf("CPP");
		
		Languages eee = Languages.valueOf("DBMS");
		System.out.println(a);
		
		System.out.println(b);
		
		System.out.println(c);
		
		System.out.println(d);
		
		System.out.println(eee);
	
		
		// print the instances of all enumeration constants in enum class Languages
		
	}
}
enum Languages {
	JAVA,
	PYTHON,
	C,
	CPP,
	DBMS
}