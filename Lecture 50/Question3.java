A thread can be in one of the below mentioned states:
NEW - when a thread is just created and is not started yet (meaning the start() method is not yet called on it).
RUNNABLE - when the start method is called and the thread is executing the code in run() method.
BLOCKED - when a thread is unable to proceed with execution because it is waiting for a monitor lock (we will learn more about locks later.)
WAITING - when a thread is waiting indefinitely for another thread to perform a particular action.
TIMED_WAITING - when a thread that is waiting for another thread to perform an action for a specified waiting time, after which it will resume.
TERMINATED - when a thread finishes its execution.
Note that when a new Thread is created it does not start automatically. At that moment it is in the NEW state. And after a thread's state changes to TERMINATED, it cannot be started again.

Note: We should never use the stop() method provided in the Thread class as it is deprecated and can lead to unexpected results. Instead we should manually write the code to stop a running thread.

Click on the  button to learn how to use a simple boolean flag to manually implement stop() feature in a thread.

Click on the  button to understand the working of stop() method in multiple threads.

See and retype the below code.

We should always remember that the main method is also executed in a thread by the JVM.

The t1.join() statement causes the thread which is executing the main method to wait till the thread t1 terminates, meaning completes its execution.




package q11342;
public class SimpleThreadDemo2 {
	public static void main(String[] args) throws InterruptedException {
		Counter c1 = new Counter("Ganga");
		Thread t1 = new Thread(c1);
		System.out.println("Before start() method call t1.getState() = " + t1.getState());
		System.out.println("Before start() method call t1.isAlive() = " + t1.isAlive());
		t1.start();
		System.out.println("After start() method call t1.getState() = " + t1.getState());
		System.out.println("After start() method call t1.isAlive() = " + t1.isAlive());
		t1.join();
		System.out.println("After t1 has terminated t1.getState() = " + t1.getState());
		System.out.println("After t1 has terminated t1.isAlive() = " + t1.isAlive());
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


