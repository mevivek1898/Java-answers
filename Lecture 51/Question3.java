Let us consider a scenario where we have two threads, one thread downloads the files from the Internet and the other thread reads those downloaded files and extracts their content. In such a scenario, until the first thread has finished downloading the file completely from the Internet the second thread should not start reading it.

Java provides a way to solve such a problem by providing a means for the first thread to signal the second thread through wait and notify mechanism.

The Object class which is the root call of all classes in Java, has the below to facilitate wait and notify between threads:
wait() - it causes the current thread to wait until another thread invokes the notify() or notifyAll() on this object.
wait(long timeoutInMilliSeconds) - it causes the current thread to wait until another thread invokes the notify() or notifyAll() on this object or the specified timeout happend.
wait(long timeoutInMilliSeconds, int additionalNanoSeconds) - it causes the current thread to wait until another thread invokes the notify() or notifyAll() on this object or the specified timeout happend.
notify() - it causes one of the threads waiting on this object's intrinsic lock to wake up.
notifyAll() - it causes all the threads waiting on this object's intrinsic lock to wake up, while only one thread gets a chance to obtain the lock to proceed.
If any thread is waiting using any of the above mentioned wait methods, it will come out of its wait, if an Thread.interrupt() is called on that thread.

The wait or an notify call can be made on a object only after obtaining the intrinsic lock (also called monitor) on that object by synchronizing over it.

If we try to call wait or notify on a object without synchronizing on that object an IllegalMonitorStateException is thrown.

Note: We should never use the suspend() and resume() methods provided in the Thread class as they are depricated. Instead we should manually write their code.

Click on the  button to learn how to use wait() and notify() methods to implement pause and resume feature manually in threads.

Click on the  button to understand the working of pause and resume in multiple threads.

See and retype the below code. In the below code thread t1 waits after it prints 5, until t2 signals t1 to resume using the notify.

Note how the wait and notify calls are made inside the synchronized statements over the monitor.



package q11345;
public class WaitNotifyDemo {
	public static void main(String[] args) throws InterruptedException {
		Object sharedLock = new Object();
		Waiter waiter = new Waiter(sharedLock);
		Notifier notifier = new Notifier(sharedLock);
		Thread t1 = new Thread(waiter);
		Thread t2 = new Thread(notifier);
		t1.start();
		t2.start();
		t2.join();
		t1.join();
	}
}
class Waiter implements Runnable {
	private Object sharedLock;
	public Waiter(Object sharedLock) {
		this.sharedLock = sharedLock;
	}
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("Waiter : " + i);
			if (i == 5) {
				System.out.println("Waiter will wait now until notified by Notifier");
				synchronized (sharedLock) {
					try {
						sharedLock.wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				System.out.println("Waiter has come out of wait.");
			}
		}
	}
}
class Notifier implements Runnable {
	private Object sharedLock;
	public Notifier(Object sharedLock) {
		this.sharedLock = sharedLock;
	}
	public void run() {
		System.out.println("Notifier is busy taking a nap to 7 secs.");
		try {
			Thread.sleep(200);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Hurray! Notifier is awake and is about to call notify().");
		synchronized (sharedLock) {
			sharedLock.notify();
		}
	}
}