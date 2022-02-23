When a Java program is launched, JVM uses the main method in a class as the starting point for code execution. Similarly, the run is the starting point for a Thread.

It is important to note that the run() should not be called directly. If called directly it will executed as any other normal method in the context of the current thread sequentially.

When we want the code in the run() method to be executed in a separate thread simultaneously (asynchronously), we hand over the runnable instance (which contains the run() method) to a thread object and ask the thread object to start executing. The call to the start() method on the thread object triggers the execution of the code in the run() in that thread's context.

Java also provides executors which generally hold a pool of threads to execute runnable instances. These are recommended in large-scale applications for efficient management of threads. Different types of executors can be created by calling the static methods available in the utility class Executors which is present in the java.util.concurrent package.

See and retype the below code to learn the difference between calling run() method directly and executing it in a thread.

You will notice in the output that the thread executing the main method itself is busy executing the c1.run();. And until it complete the run() on c1, main method does not even proceed to create and start threads t1 and t2. However, once the threads t1 and t2 are started, from the output you notice that the CPU time is sliced between both the threads and both of them are executing simultaneously.


package q11347;
public class RunnableDemo {
	public static void main(String[] args) throws InterruptedException {
		Counter c1 = new Counter("Ganga");
		Counter c2 = new Counter("Yamuna");
		Counter c3 = new Counter("Narmada");
		c1.run();
		Thread t1 = new Thread(c2);
		Thread t2 = new Thread(c3);
		t1.start();
		System.out.println("called t1.start()");
		t2.start();
		System.out.println("called t2.start()");
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