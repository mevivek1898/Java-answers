In memory management terminology, garbage means that portion of memory which was once occupied by objects and is currently no longer used by the program.

Garbage collection (GC) means reclaiming such memory so that, that space can be used for allocation to other objects.

In Java programming language, the JVM (Java Virtual Machine) which is responsible for running the Java application performs automatic garbage collections.

The automatic garbage collection in Java is performed by a special thread called Garbage Collector, which is a part of JVM.

Garbage Collector does not reclaim the memory of objects that are still in use. It only reclaims the memory of objects which are no longer in use.

An object is created and assigned memory when we use the new keyword followed by a constructor call.

The reference  holds the address of the object in the memory.

That portion of memory in which the Java objects reside is called heap.

When the program no longer uses an object, such an object is called unreferenced object.

For example:
public class A {
	private String text1 = "Bali Islands";		// statement 1
	public String haveSomeFun() {
		String text2 = "Fly to " + text1;	// statement 2
		System.out.println(text2);		// statement 3
	}
}
public class ATest {
	public static void main(String[] args) {
		A a = new A();				// statement 4
		a.haveSomeFun();			// statement 5
		System.out.println("Happy holidays!");	// statement 6
	}
}
In the above code, after statement 4 is executed, we have reference a pointing to an object created in the heap.

Similarly, inside the instance pointed by a, we have another reference text1 (which is declared in statement 1) also pointing to a String object in memory.

However, note that the object referenced by text2 declared in the statement 2 is not yet created in memory.

The reference text2 will become alive only during the execution of the method invocation on reference a in statement 5.

After executing the statement 5, when the JVM is executing statement 6, the reference text2, whose scope was local to the method haveSomeFun() is no longer alive even though the object is in the memory. Such objects are called unreferenced objects.

Garbage collector identifies such objects (which are there in memory but are no longer referenced) and reclaims their memory.



Answer
Object a1 = new Object(); //statement 1
Object a2 = new Object(); //statement 2
a2 = a1;
In the above code, the initial object referred by a2 in statement 2 will be available for GC after the statement a2 = a1; is executed.