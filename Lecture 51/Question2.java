Given:
class SequenceGenerator {
	synchronized void sequence(long n) {
		for (int i = 1; i < 3; i++)
			System.out.print(n + "-" + i + " ");
	}
}

public class Tester implements Runnable {
	static SequenceGenerator sg = new SequenceGenerator ();

	public static void main(String[] args) {
		new Thread(new Tester()).start();
		new Thread(new Tester()).start();
	}

	public void run() {
		sg.sequence(Thread.currentThread().getId());
	}
}
Which of the following statements are true?


Answer 

The output could be 6-1 6-2 5-1 5-2
