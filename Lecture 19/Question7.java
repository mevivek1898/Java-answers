Retype the code below and submit.

Write a class ArrayElementCounter with a public method countElement that takes two parameters one is arr of type int[] and the other is element of type int and returns the count of the element that occures in the arr. The return type of countElement should be int.

Here is an example:
Cmd Args : 3 2 3 3 3 3
The element 3 presents 4 times in the arry 


package q10942;
public class ArrayElementCounter {
	public int countElement(int[] arr, int element) {
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == element) {
				count++;
			}
		}
		return count;
	}
}