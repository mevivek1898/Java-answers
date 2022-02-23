Java collection framework has included a very useful utility class called Arrays.

Please note that the class we are talking about java.util.Arrays is completely different from the class java.lang.reflect.Array.

java.lang.reflect.Array class is part of java.lang.reflect package, and it allows for dynamic creation and manipulation of an array.

Arrays on other hand is a class in java.util package.

Arrays is a utility class. A Utility class is a class which contains static methods and has a private constructor so that it cannot be instantiated.

This class has many useful searching and sorting methods which operate on arrays.

See and retype the below code to know the usage of a few commonly used methods like :
asList(T...arrayElement)
sort(int[] array)
fill(int[] array, int value)
equals(int[] array, int value)
copyOfRange(int[] original, int from, int to)
Note in the below code the main method uses ellipses(...) instead of a String[].


package q11313;
import java.util.*;
public class ArraysDemo {
	public static void main(String ... args) {
		List<Integer> integerList = Arrays.asList(3, 33, 333, 3333);
		System.out.println("integerList : " + integerList);
		Integer[] integerArr = {382, 34, 4, 223, 331};
		System.out.println("Original integerArr : " + Arrays.asList(integerArr));
		Arrays.sort(integerArr);
		System.out.println("After sorting integerArr : " + Arrays.asList(integerArr));
		Integer[] integerArr2 = {4, 34, 223, 331, 382};
		System.out.println("Arrays.equals(integerArr, integerArr2) : " + Arrays.equals(integerArr, integerArr2));
		Integer[] integerArr3 = new Integer[10];
		Arrays.fill(integerArr3, 7);
		System.out.println("After filling integerArr3 with 7 : " + Arrays.asList(integerArr3));
	}
}