In many situations we would like to measure the time taken to perform a certain operation. Below is an example which uses the methods present in the System class to measure the time taken.

See and retype the below code to understand the usage of System.currentTimeMillis() and System.nanoTime()



package q11312;
public class TimingExample {
	public static void main(String[] args) {
		long startTime = System.currentTimeMillis();
		int total = 0;
		for (int i = 0; i < 10000; i++) {
			total = total + i;
		}
		long endTime = System.currentTimeMillis();
		System.out.println("Time taken in milliseconds = " + (endTime - startTime));
	}
}