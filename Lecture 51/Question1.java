Threads in Java can be assigned priorities. The priority of a thread determines how it will behave with regards to other threads. For example if a low priority thread is hogging too much of CPU time and is not voluntarily surrendering CPU by sleeping or going into a wait, the system could pre-empt it and transfer the control to a thread with higher priority.

There can arise scenarios where multiple threads may want to access a shared resource. For example, let us consider two threads trying to add elements into an ArrayList. It is very likely that during the add operation call from a thread, while the ArrayList's internal data structure is being modified, the second thread can also invoke the add method. This could result in possible data corruption or even worse can mess up the internal state of the ArrayList.

Whenever a common resource is manipulated by multiple threads, it is important to endure that the manipulations happen in isolation of each other. Mean while one thread is performing the manipulation on the shared resource, the other threads are made to wait until the former completes. This is called synchronization.

Java allows us to write code which can build such synchronization between multiple threads by using the synchronized keyword.

In legacy collection classes like Vector, Stack and Hashtable all methods were synchronized.

A method is called synchronized when the synchronized keyword is used in the method declaration statement as shown below:
// Below code is from isEmpty() method in java.util.Vector class:
public synchronized boolean isEmpty() {
	return elementCount == 0;
}
The synchronized keyword ensured that when one thread is calling this method it obtains the Vector object's intrinsic lock and this intrinsic lock is not released until the thread finishes execution of this method. And while the first thread is inside executing such a method, if another thread attempts to enter the method, it will have to wait till the initial thread which has obtained the lock comes out of the method and makes the lock available for the second thread to obtain it and enter.

This is how using an object's intrinsic lock (also called monitor) the synchronization is achieved.

In Java, every object has an intrinsic lock associated with it, meaning every object can be used for synchronization. The intrinsic lock acts as a gate-pass. Just like a visitor while entering into a secure building or a facility is given a visitor pass and is asked to surrender it back while leaving, similarly the thread entering into a synchronized block gains the intrinsic lock associated with the object on which it is synchronized and release it while exiting.

The above synchronized method can also be written as :
public boolean isEmpty() {
	synchronized (this) { // this is also called the synchronized statement
		return elementCount == 0;
	}
}
In both the above code snippets, the intrinsic lock is on the this reference.

In the second way, i.e, while using a synchronized statement synchronizing can be done on few lines of code which is usually called the critical block that should not be executed simultaneously by more than one thread.

Java also provides a keyword called volatile which when applied to fields the JVM will ensure that all threads see a consistent value for the fields while they are being updated by multiple threads.

See and retype the below code.

Note how the ArrayList instance which is not thread-safe by default is made thread-safe by using the utility method in Collections.synchronizedList() class. Similarly we can obtain a thread-safe instance of HashSet, LinkedHashSet, HashMap, LinkedHashMap and other non-thread-safe collection classes using corresponding methods in the Collections.synchronizedSet() class.




'

package q11343;
import java.util.*;
public class SimpleThreadDemo3 {
	public static void main(String[] args) throws InterruptedException {
		List<String> entriesList = Collections.synchronizedList(new ArrayList<String>());
		Counter c1 = new Counter("Ganga", entriesList);
		Counter c2 = new Counter("Yamuna", entriesList);
		Thread t1 = new Thread(c1);
		Thread t2 = new Thread(c2);
		t1.start();
		t2.start();
		System.out.println("started t1 and t2 threads");
		t1.join();
		System.out.println("t1 has completed. t1.isAlive() = " + t1.isAlive());
		t2.join();
		System.out.println("t2 has completed. t2.isAlive() = " + t2.isAlive());
		System.out.println("At the end entriesList = " + entriesList);
	}
}
class Counter implements Runnable {
	private String name;
	private List<String> entriesList;
	public Counter(String name, List<String> entriesList) {
		this.name = name;
		this.entriesList = entriesList;
	}
	public void run() {
		for (int i = 0; i < 10; i++) {
			entriesList.add(name + " : " + i);
			try {
				Thread.sleep(50);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}