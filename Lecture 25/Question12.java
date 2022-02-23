In the below you will find that some of the getter and setter methods have wrong return types.

Use the declared type of the field to correct the return types of getter methods and ponder upon what should be the return types of the setter methods to correct them.

Identify the errors and correct them. Hint: Press Submit to see the errors.

package q11137;
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
	
	public void setId(String id) {
		this.id = id;
	}
	
	public String  getId() {
		return id;
	}
	
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
	
	public void setGender(char gender) {
		this.gender = gender;
	}
	
	public char getGender() {
		return gender;
	}
	
	public String toString() {
		return "Student [id = " + id + ", name = " + name + ", age = " + age + ", gender = " + gender + "]";
	}
}