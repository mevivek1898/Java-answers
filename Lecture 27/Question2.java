A string object can also be created using any of the constructors of the String class. For example:
String aStr = new String("Lemuria");
char charArr[] = {'A', 't', 'l', 'a', 'n', 't', 'i', 's'}; 
String anotherStr = new String(charArr);
Instances of String class are immutable, meaning their values cannot be changed after they are created. If any alteration has to be made to a string instance, a new string object with the required content must be created.

In the below example, you will find the correct way of comparing two strings:
String aString = "abc";
String bString = new String("abc");
System.out.println(aString == bString); //This prints false
System.out.println(aString.equals(bString)); //This prints true
In the above code, when we use == comparison operator, we are comparing the address stored in aString with the address stored in bString. Since bString is created using the constructor, it creates a new object which has similar content as that of aString. Since bString points to a new object, its address is different from the address stored in aString. Hence, when we compare addresses, it returns false.

There is a equals method in String class which is used to compare the contents stored in two string objects. This returns true if the contents are the same and false if they differ. In our example, since the contents are same, we get true as the output.

Hence, the correct way of comparing contents of two strings is to use equals method.

See and reproduce the below code



package q11145;
public class StringLiterals {
	public static void main(String[] args) {
		String str1 = "Encyclopedia";
		String str2 = new String("Encyclopedia");
		System.out.println("str1 == str2 : " + (str1 == str2));
		System.out.println("str1.equals(str2) : " + (str1.equals(str2)));
	}
}