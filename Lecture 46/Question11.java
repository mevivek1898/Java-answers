The Random class in java.util package can be used to generate pseudo random numbers.

See and retype the below code which generates 5 random numbers below 100. Click on the class Random to know more about the available methods.



package q11316;
import java.util.*;
public class RandomDemo {
	public static void main(String[] args) {
		Random rand = new Random(10);
		for (int i = 0; i < 5; i++) {
			System.out.println(rand.nextInt(100));
		}
	}
}