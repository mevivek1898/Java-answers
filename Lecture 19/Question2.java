Create a class MountainNamePrinter with a main method. Create an array with the following names: Nanda Devi, Kamet, K12, Dunagiri.

Iterate over the array and print each name on a separate line.


package q10937;

public class MountainNamePrinter {
	
	public static void main(String[] args) {
		
		String[] namesArr = { "Nanda Devi", "Kamet", "K12", "Dunagiri"};
		
		for (String river : namesArr) {
			
			System.out.println(river);
			
		}
	}
}