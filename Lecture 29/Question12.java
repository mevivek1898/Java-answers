Suppose we have a string that contains a list of comma separated items like, "Apples, Oranges, Peaches, Bananas". We want to split the string extract all the items into an array. String class provides a method for doing this, called public String[] split(String regex).

The above string can be split using split method like this :
"Apples, Oranges, Peaches, Bananas".split(","). 
It returns an array containing the items in the list. 
When we print the array, it prints the following:
Apples
 Oranges
 Peaches
 Bananas
Note the extra space before each item (except Apples).
The argument for the split method should be a regular expression. You will learn about using regular expressions in Java in some other section.

Retype the code below that demonstrates the usage of split method.


package q11182;
public class StringMethods {
	public static void main(String[] args) {
		String str = "http://docs.oracle.com/javase/7/docs/api/";
		String[] splits = str.split("/");
		for (String s : splits) {
			System.out.println(s);
		}
	}
}
