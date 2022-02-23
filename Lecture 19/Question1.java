Retype the code below. The class RiverNamePrinter prints an array containing the names of Indian rivers.

The code in the main method uses a for-each loop to iterate over the array namesArr and prints each name.

package q10936;
public class RiverNamePrinter {
	public static void main(String[] args) {
		String[] namesArr = { "Ganga", "Yamuna", "Godavari", "Krishna", "Narmada", "Kaveri" };
		for (String river : namesArr) {
			System.out.println(river);
		}
	}
}


