Retype and submit the code below.

Write a class IndexFinder with public method printIndex that takes two parameters one is intArr of type int[] and other is an element of type int and print all indices of the elements in intArr which are equal to the given element.

Assumptions:
arr is never null
Here is an example:
Cmd Args : 2 2 2 42 2
Indices of the elments matched with the given element 2 is : 
0
1
2

package q10940;
public class IndexFinder {
	public void printIndex(int[] intArr, int element) {
		for (int i = 0; i < intArr.length; i++) {
			if (intArr[i] == element) {
				System.out.println(i);
			}
		}
	}
}

