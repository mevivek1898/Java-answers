In Java a thread can be created and executed in two ways. One is by writing a class which extends the Thread class and calling the start() method.
Approach #1
public class MyClass extends Thread {
	public void run() {
   ...
	}
}
execute the thread by calling:
new MyThread().start();The second approach is by writing a class which implements the Runnable interface. Then we create a Thread object by passing an instance of our class into the Thread's constructor and call the start() method.

Approach #2
public class MyClass implements Runnable {
	public void run() {
   ...
	}
}
execute the thread by calling:
MyClass mc =  new MyClass();
new Thread(mc).start();Among the two, the second approach which implements a Runnable interface is recommended.

Click on the  button to see a live thread in action. Make sure to fiddle around with pause and resume options.

Click on the  button to see live threads in action. Make sure to pause and resume different threads while they are running.

See and retype the below code.

A call to Thread.sleep(long milliseconds) method causes the current execution to pause for the given duration in milliseconds. The sleep method throws an InterruptedException if it is interrupted by any other thread. Since InterruptedException is a checked exception, we have to handle the exception using a try-catch block.


package q11341;
public class SleepDemo {
	public static void main(String[] args) {
		try {
			System.out.println("About to take a short nap. Start counting from 1 to 2.");
			Thread.sleep(1000);
			System.out.println("Fresh after 2 seconds of good sleep!");
			Thread.sleep(1000);
			System.out.println("Very fresh after sleeping for 2 more seconds!!");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
