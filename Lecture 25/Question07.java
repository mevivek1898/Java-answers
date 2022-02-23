You will notice that the line public class Student { is indented to the left most column.

    At the same time you will also notice that the lines inside the class body are indented by one level.
    
    Indenting code is indented to make code easily readable. It helps clearly identify the start and end of independent code blocks, like classes, methods loops etc.
    
    One can either place the opening brace ({) in a new line or at the end of the statement, In all our examples we will place them at the end of the statement so that we can see more lines on the screen.
    
    The general rules for indentation are as follows:
    Press the tab key to indent and not space bar.
    Indent the line which immediately follows the opening brace.
    Indent the closing brace (}) to match with the beginning of the line which has the opening brace ({).
    Identify the error and correct it.
    
    Hint: Press the Submit button to find the error. Note if the correct operator is used for String concatenation.


    package q11131;
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
	
	public String toString() {
		return "Student [name = " + name + ", id = " + id + ", age = " + age + ", gender = " + gender + "]";
	}
}