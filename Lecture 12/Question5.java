The class PrinHello is created with a main method. The method receives river names as arguments.

See and retype the below code to see the result.

Note: Please don't change the package name.

package q10839;
public class PrintHello {
	public static void main(String[] args) {
		String suffix = "River";
		for (String riverName : args) {
			System.out.println(riverName + suffix);
		}
	}
}