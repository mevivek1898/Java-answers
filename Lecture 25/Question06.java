Whenever on compilation, you see an error saying: xyz cannot be resolved, it means that the compiler is unable to resolve the symbol xyz to a type.

On such errors first verify if the symbol xyz is spelt correctly.

Identify the error and correct it.


package q11130;
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

