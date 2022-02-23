Thread class, Runnable Interface
©
  
Close120%
L52
Thread class, Runnable Interface
Q. No : 11349
Write a Java program demonstrating the usage of Threads 
Write a Java program that uses three threads to perform the below actions:
First thread should print "Good morning" for every 1 second for 2 times
Second thread should print "Hello" for every 1 seconds for 2 times
Third thread should print "Welcome" for every 3 seconds for 1 times
Write appropriate constructor in the Printer class which implements Runnable interface to take three arguments : message, delay and count of types String, int and int respectively.

Write code in the Printer.run() method to print the message with appropriate delay and for number of times mentioned in count.

Write a class called ThreadDemo with the main() method which instantiates and executes three instances of the above mentioned Printer class as threads to produce the desired output.

[Note: If you want to sleep for 2 seconds you should call Thread.sleep(2000); as the Thread.sleep(...) method takes milliseconds as argument.]



package q11349;
public class ThreadDemo {
	public static void main(String[] args) throws Exception {
		Thread t1 = new Thread(new Printer("Good morning", 1, 2));
		Thread t2 = new Thread(new Printer("Hello", 1, 2));
		Thread t3 = new Thread(new Printer("Welcome", 3, 1));
		t1.start();
		t2.start();
		t3.start();
		t1.join();
		t2.join();
		t3.join();
		System.out.println("All the three threads t1, t2 and t3 have completed execution.");
    }
}
class Printer implements Runnable {
	private String message;
	
	private int delay,count;
	
	public Printer(String message,int delay,int count) {
		
		this.message = message;
		
		this.delay=delay;
		
		this.count=count;
		
	}
	
	public void run() {
	//	long value =delay*1000;
		
		for (int i = 0; i < count; i++) {
			
		//	Thread.sleep(value);
			
			System.out.println(message);
			
		}
		
	}
	
	
}