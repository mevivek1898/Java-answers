The toString() method like the constructor of a class is part of the class body. It must be written inside a class scope (inside the opening and closing brace of the class).

Hint: You can select some code and press ALT + Up key or ALT + Down key to move the selected code up and down. (Note: This works only in Windows and not in MAC and Linux)

Identify and correct the error.



package q11128;
public class Student {
	private String id;
	private String name;
	private int age;
	private char gender;
	
	public Student(String name, String id, int age, char gender) {
		this.id = id;
		this.name = name;
		this.age = age;
		this.gender = gender;
	}
	

	
	public String toString() {
		return "Student [name = " + name + ", id = " + id + ", age = " + age + ", gender = " + gender + "]";
	}
}