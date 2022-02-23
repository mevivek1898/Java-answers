The class MultiDimArrayPrinter prints a multidimensional array of integers.

The code in the main method uses for loops with loop counters to iterate over the multidimensional array int2DArr and print the values.

Understand and retype the code below:

package q10947;
public class MultiDimArrayPrinter {
	public static void main(String[] args) {
		int[][] int2DArr = {
							{1},
							{2, 3},
							{4, 5, 6},
							{7, 8, 9, 10}
						};
		for (int i = 0; i < int2DArr.length; i++) {
			for (int j = 0; j < int2DArr[i].length; j++) {
				System.out.print(int2DArr[i][j] + " ");
			}
			System.out.println();
		}
	}
}