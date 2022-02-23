To extract a string from another string, we use public String substring(int beginIndex) method. It returns a substring that starts at the specified index and extends to the end of the string. Examples:
 "toBeOrNot".substring(2) returns "BeOrNot"
 "Summers".substring(3) returns "mers"
 "emptiness".substring(9) returns "" (an empty string)
If beginIndex is negative or larger than the length of the string, the method throws IndexOutOfBoundsException.

If we know at what indices the substring should begin and end in another string, we can use the method public String substring(int beginIndex, int endIndex) to extract the substring. The substring begins at the specified beginIndex and extends up to the character at endIndex - 1. Note: The character at the endIndex is not included in the resulting substring. Examples:
 "hamburger".substring(4, 8) returns "urge"
 "smiles".substring(1, 5) returns "mile"
The method throws IndexOutOfBoundsException if the beginIndex is negative, or endIndex is larger than the length of this String object, or beginIndex is larger than endIndex.

Click on the  button to see live execution of the above mentioned methods. Make sure to provide your custom text and also change the beginIndex and endIndex to see the change in their working.

Retype the code below that demonstrates the usage of these methods.



package q11176;
public class SubString {
	public static void main(String[] args) {
		String str = "An offer that you cannot refuse";
		System.out.println(str.substring(9));
		System.out.println(str.substring(3, 8));
		System.out.println(str.substring(str.indexOf("you")));
		System.out.println(str.substring(str.indexOf("that"), str.indexOf("refuse")));
	}
}