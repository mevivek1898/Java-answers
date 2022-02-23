A loop in a programming language is a statement which allows code to be repeatedly executed. A for-each loop is a kind of control statement for iterating over a collection of items.

for (type item: iterableCollection) {
	// code statement 1
	// code statement 2
	...
}
A for-each statement starts with for (type item: iterableCollection)
followed by its body.
It is a good practice to always keep the body which contains the code to be executed within an opening-brace { and a closing-brace }.
It is called a for-each loop because the statements contained in the body are executed once for each item in iterableCollection

Click on  to understand the working of for-each loop.

The class ForEachDemo creates an array of integers named numArr. (We will learn about arrays in later sections.)
The code in the main(...) method should use a for-each loop to iterate over the array numArr.
Fill in the missing code for the for-each statement such that it initializes int i with each element in numArr and executes the code in the for-each statement's body to print i.

Note: Please don't change the package nam

package q10875;
public class ForEachDemo {
	public static void main(String[] args) {
		int[] numArr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		for ( int i: numArr) {
			System.out.println(i);
		}
	}
}