The word Multitasking is applied to the operating system performing multiple tasks simultaneously. These tasks are called processes.

A process is a running instance of a program code, which uses resources like Memory, CPU cycles etc.

While you are reading this text, you already have many tasks (processes) being simultaneously run by your OS (operating system) like the browser instance, clock.. etc.

When we execute a Java class, a JVM (Java Virtual Machine) instance is created and launched as a separate program, which in turn executes the code in our Java class.

Java language has support for multithreading. Meaning we can write code which will create multiple threads. A thread is an independent execution flow that can run simultaneously along with its parent which launched it.

Click on the  button to see live threads in action. Make sure to fiddle around with pause and resume options.

The way processes are scheduled and managed by the operating system, threads that are created and run in a JVM have a one-to-one mapping to a corresponding OS threads (called native threads). For more details click here and read the Threading Model section..

In Java, threads have a priority which can be set. When a new thread is created, by default it receives the priority of its parent thread. This priority is used in thread scheduling.

Individual processes in an operating system have their own memory space. While the threads launched in a JVM, share the same context and the memory space used by the JVM. For this reason threads are also considered light-weight when compared to processes. though such a statement is debatable.

Until Java version 1.3, Java used to have Green Threads which were light-weight and were scheduled by the JVM. Green threads were not taking advantage of multiple processors available in a multi-processor machine. From Java version 1.3 and later versions we only have native threads, which are scheduled by the native OS and provide performance benefits by taking advantage of the multiple processors available on a multi-processor machine.

See and retype the below example which creates two threads in Java. We will learn more about the details of this code in the later sections.

Note Thread.sleep(1000); statement causes the execution to pause for 1000 milliseconds (a second).




package q11340;
public class SimpleThreadDemo {
	public static void main(String[] args) throws InterruptedException {
		Counter c1 = new Counter("Ganga");
		Counter c2 = new Counter("Yamuna");
		Thread t1 = new Thread(c1);
		Thread t2 = new Thread(c2);
		t1.start();
		t2.start();
		System.out.println("started t1 and t2 threads");
		t1.join();
		System.out.println("t1 has completed. t1.isAlive() = " + t1.isAlive());
		t2.join();
		System.out.println("t2 has completed. t2.isAlive() = " + t2.isAlive());
	}
}
class Counter implements Runnable {
	private String name;
	public Counter(String name) {
		this.name = name;
	}
	public void run() {
		for (int i = 0; i < 3; i++) {
			System.out.println(name + " : " + i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}