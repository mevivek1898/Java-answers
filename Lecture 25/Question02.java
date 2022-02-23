toString() is a special method used to convert an object's state information into a human readable text.

Note the spelling of toString()

The toString() method does not take any parameters and will always return a String.

See the code and retype the below code.'


package q11126;
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
		return "Student [id = " + id + ", name = " + name + ", age = " + age + ", gender = " + gender + "]";
	}
}