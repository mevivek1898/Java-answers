Java provides ObjectInputStream and ObjectOutputStream to read and write Java objects. This process writing is called serialization and the process of reading an open back is called deserialization.

An object of any class which implements an interface called Serializable can participate in serialization.

Serializable does not have any methods to implement. Such an interface is called a marker interface.

Almost all the container classes like those present in collections and also String, StringBuilder, the wrapper classes for primitives, Date related classes etc implement this interface to facilitate serialization. Both the ObjectInputStream and ObjectOutputStream store and retrieve objects from an underlying byte stream.

Among the various methods the main method in ObjectInputStream to read an object is readObject().

Similarly, the main method in ObjectOutputStream to write an object is writeObject().

See and retype the below code.

Please note that if we do not want a field of a class to be persisted we should mark that field with the transient keyword. For example in the below code you will notice that the fields seatingPosiiton and comments will not have their original values once stored and retrieved.

If a class does not implement Serializable and it is attempted to be persisted using writeObject method, the method throws NotSerializableException, which is a runtime exception.



package q11356;
import java.io.*;
public class SerializationDemo {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		Student st1 = new Student("CT1007", "Ganga", 25, 71, "Hard-Working");
		Student st2 = new Student("CT1008", "Yamuna", 26, 51, "Absent-Minded");
		String outputFileName = "ObjectStreamsDemo.txt";
		Student restoredSt1 = null;
		Student restoredSt2 = null;
		try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(outputFileName));
				ObjectInputStream ois = new ObjectInputStream(new FileInputStream(outputFileName))) {
			System.out.println("Before serialization st1 : " + st1);
			System.out.println("Before serialization st2 : " + st2);
			oos.writeObject(st1);
			oos.writeObject(st2);
			restoredSt1 = (Student) ois.readObject();
			restoredSt2 = (Student) ois.readObject();
		}
		System.out.println("After deserialization st1 : " + restoredSt1);
		System.out.println("After deserialization st2 : " + restoredSt2);
	}
}
class Student implements Serializable {
	private String id;
	private String name;
	private int age;
	private transient int seatingPosition;
	private transient String comments;
	public Student(String id, String name, int age, int seatingPosition, String comments) {
		this.id = id;
		this.name = name;
		this.age = age;
		this.seatingPosition = seatingPosition;
		this.comments = comments;
	}
	public String toString() {
		return "Student[ id=" + id + ", name=" + name + ", age=" + age + ", seatingPosition=" + seatingPosition + ", comments=" + comments + " ]";
	}
}