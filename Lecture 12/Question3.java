Understanding the usage of instanceof Operator

package q10836;
public class InstanceOfOperatorDemo {
	public static void main(String[] args) {
		if (args instanceof String[]) {
			System.out.println("args instanceof String[] is true");
		}
		if (args instanceof Object) {
			System.out.println("args instanceof Object is true");
		}
	}
}