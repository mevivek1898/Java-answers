In Java, we can write a class inside another class. Such classes are called nested classes.

We can classify the nested classes into four types :
Inner classes
Static nested classes
Local classes
Anonymous classes
We will learn about inner classes here and the rest in the later sections.

Nested classes which are not declared as static are called Inner classes.

For example:
class A { //this is called a top-level class
	class B { //this is an inner class
	}
}
Let us consider two top-level classes A and B such that class B needs access to private members of class A and class B is not used by any other class. In such a scenario it makes sense to make B as an inner class of A as given in the above example. By making it an inner class, class B will gain access to all the private members of class A, since B has also become an member of A.

Since inner classes are similar to instance fields, create an instance of an inner class we need to first have an instance of the outer class.

See and retype the below code. Note how we are able to access the private field name inside the method getCompleteName() of the inner class Prefixer.

Also note how the instance of the inner class is created by using the new keyword on an instance of the outer class in the line:
Namer.Prefixer prefixer = namer.new Prefixer("Mr.");


package q11294;
public class Namer {
	private String name;
	public Namer(String name) {
		this.name = name;
	}
	class Prefixer {
		private String prefix;
		private Prefixer(String prefix) {
			this.prefix = prefix;
		}
		public String getCompleteName() {
			return prefix + " " + name;
		}
	}
	public static void main(String[] args) {
		Namer namer = new Namer("Doodle");
		Namer.Prefixer prefixer = namer.new Prefixer("Mr.");
		System.out.println(prefixer.getCompleteName());
	}
}