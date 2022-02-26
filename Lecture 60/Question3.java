A properties file is generally used to store configuration properties used by a software program.

The properties file can have any extension, however .properties or .props are commonly used extensions.

A properties file usually stores a single property mapping (propertyName -> propertyValue [also called] key -> value) on a single line.

The mappings can be in any of the formats give below:
key=value
key = value
key:value
key value
If the key contains a space, such a space should be escaped using a backslash \. For more rules on the contents of a properties file click here.

The Properties class in Java is used to hold such key-value pairs in a Map like structure.

Most notable difference between a Map and a Properties object is that, in a Properties object we can store only Strings as keys and values. Where as in a Map any type of Object can be stored as a key and value.

Since Properties class extends Hashtable, it also inherits methods like put(K key, V value) and get(K key). However, extreme care should be taken that we do not use those methods and instead use the methods setProperty(String key, String value) and getProperty(String key)

Some of the commonly used methods in Properties class are given below:
setProperty(String key, String value) - it stores the given key to value mapping in the properties object.
getProperty(String key) - it returns the String value mapped to the given key.
store(Writer writer, String comments) - it stores the contents in Properties object into the Writer object (we will learn more about Writers later).
load(Reader reader) - it loads the contents from the Reader object (we will learn more about Readers later) in to the Properties object.
Note: Using System.getProperty(String propertyName) method one can access properties passed to JVM.
For example, when a class called MyClassName is executed on command line and passed a property as shown below: java -Dmyprop=someValue MyClassName
We can access the value in our code as shown below :
String value = System.getProperty("myprop");

See and retype the below code.

package q11386;
import java.util.*;
public class PropertiesDemo {
	public static void main(String[] args) {
		Properties props = new Properties();
		props.setProperty("OS_NAME", "Linux");
		props.setProperty("RAM", "2 GB");
		props.setProperty("HDD", "1 TB");
		props.setProperty("Monitor", "22 Inch");
		Set propertyNamesSet = props.stringPropertyNames();
		for (Object key : propertyNamesSet) {
			String propertyName = (String)key;
			Object propertyValue = props.getProperty(propertyName);
			System.out.println(propertyName + " : " + propertyValue);
		}
	}
}


