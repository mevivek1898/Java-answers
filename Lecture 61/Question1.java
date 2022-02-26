In order to understand Generics and its advantages, we need to understand the importance of types.

Java is a strongly typed language. Meaning, Java language mandates that we clearly declare the data type of a variable/reference before it is used for the first time.

For example, in the below code:
int age;
age = 3;
Variable age is declared to be of data type int. Java compiler uses this information to verify and flag an error if some other type value, say, for example a String is being assigned. For example, the below code will not compile.
int age;
age = "Hello"; //Compiler will flag this as an error, saying incompatible types.Until Java 5 (version 1.5), all the collection classes used to work on Object as the data type, so that any kind of object could be stored in Lists, Sets etc.

However, this approach had two disadvantages which were solved by the inclusion of Generics in Java 5.

Prior to generics, an ArrayList could include objects of any type meaning, a developer could store an Integer and a String object in the same ArrayList.

For example:
ArrayList numbersList = new ArrayList();
numbersList.add(new Integer(72));
numbersList.add(new Integer(78));
numbersList.add("Alfa"); // Statement 1In the above code compiler will not flag Statement 1 as an error, since numbersList can accept any type of object.

However, Statement 1 will cause a runtime error during code execution, if the code is trying to calculate the sum of all integers stored in the numbersList.

In such situations, Generics allows us to specify the type of elements that can be stored in the ArrayList during declaration. For example, if we want the ArrayList to only accept Integers, we would declare the ArrayList as given below:
ArrayList<Integer> numbersList = new ArrayList<Integer>();
The first advantage of using the above Generic syntax to specify the type parameter as <Integer> is that compiler will allow only elements of type Integer to be added to numbersList. Compiler will flag an error if an attempt is made to add an object of type String or any other type other than Integer.

The second advantage of using the above syntax is that we need not type cast the elements from Object to Integer when we retrieve them. For example we can directly say:
Integer number1 = numbersList.get(0);
See and retype the below code to gain familiarity with Generic syntax.

Note the usage of < and > to specify the type argument Integer. Note that there should not be any spaces before and after < and >.

Also note that in Java 7 (version 1.7) and later versions the below statement
List<Integer> numbersList = new ArrayList<Integer>();
can also be written as
List<Integer> numbersList = new ArrayList<>();



package q11388;
import java.util.*;
public class GenericListDemo {
	public static void main(String[] args) {
		List<Integer> numbersList = new ArrayList<Integer>();
		numbersList.add(new Integer(72));
		numbersList.add(78);
		numbersList.add(81);
		int total = 0;
		for (int number : numbersList) {
			total = total + number;
		}
		System.out.println("total = " + total);
	}
}
