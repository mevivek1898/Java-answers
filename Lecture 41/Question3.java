See and retype the below code. It has two examples of anonymous classes. One is created by implementing an interface Printer and the other by extending a class named Prefixer.

Note that when an anonymous class is implementing an interface, the new keyword is prefixed to the interface name, which is followed by empty parenthesis.

And note that when an anonymous class is extending a class, the new keyword is prefixed to one of the existing constructors in that class.

package q11298;
interface Printer {
	public void printMe();
}
class Prefixer {
	protected String prefix;
	public Prefixer(String prefix) {
		this.prefix = prefix;
	}
	public String getPrefixedName(String name) {
		return prefix + " " + name;
	}
}
class AnonymousExample {
	public static void main(String[] args) {
		Printer printer = new Printer() {
			public void printMe() {
				System.out.println("printMe is called!");
			}
		};
		Prefixer doublePrefixer = new Prefixer("Hello") {
			public String getPrefixedName(String name) {
				return prefix + " " + prefix + " " + name;
			}
		};
		printer.printMe();
		System.out.println(doublePrefixer.getPrefixedName("James"));
	}
}