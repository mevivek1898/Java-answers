To check if two strings have the same content or not, we can use public boolean equals(Object anObject) method. The method returns true if and only if the argument is not null and is a String object that represents the same sequence of characters as the string.

Click on the  button to see live execution of the equals method. Make sure to provide your custom text to see the change in its working.

To compare two strings ignoring the case, there is a public boolean equalsIgnoreCase(String aStr) method. The method returns true if and only if the argument is not null and is a String object that represents the same sequence of characters as the string, ignoring the case.

Click on the  button to see live execution of the equalsIgnoreCase method. Make sure to provide your custom text to see the change in its working.

To check if a string starts with a certain prefix, the method public boolean startsWith(String prefix) can be used.

Click on the  button to see live execution of the startsWith method. Make sure to provide your custom text and also change the startsWith text to see the change in its working.

Similarly, we can use public boolean endsWith(String suffix) to check if a string ends with the specified suffix.

Click on the  button to see live execution of the endsWith method. Make sure to provide your custom text and also change the endsWith text to see the change in its working.

Retype the code below that shows the usage of the above methods.


package q11164;
public class StringMethods {
	public static void main(String[] args) {
		String str1 = "Jurassic";
		String str2 = "juraSSic";
		System.out.println("equals : " + str1.equals(str2));
		System.out.println("equalsIgnoreCase: " + str1.equalsIgnoreCase(str2));
		System.out.println("startsWith " + str1.startsWith("Jur"));
		System.out.println("endsWith " + str2.endsWith("Sic"));
	}
}

