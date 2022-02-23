Insertion sort is one that sorts a set of elements by inserting an element into the existing sorted elements.

The working procedure for insertion sort is as follows:

Let us consider an array of n elements (i.e., a[n]) to be sorted.
The first element a[0] in the array is itself trivially sorted.
The second element a[1] is compared with first element a[0] and it will be inserted either before or after first element, so that first and second elements are sorted.
The third element a[2] is compared with a[0] and a[1] and it will be inserted into its proper place by checking conditions, so that first three elements are sorted.
Repeat the same process for n - 1 passes.
Let us consider an example of array numbers "50 20 40 10 30", and sort the array from lowest number to greatest number using insertion sort.

In each step, elements written in color is compared with elements written in bold. Number of elements in the array are 5, so 4 passes will be required.
Pass - 1 : 
( 5020 40 10 30 ) -> ( 20 50 40 10 30 ) // The second element a[1] is compared with the first element a[0] and swaps since 50 > 20, so first 2 elements are sorted.Now, Pass - 2 can compare a[2] with a[0] and a[1].
Pass - 2 : 
( 20 5040 10 30 ) -> ( 20 40 50 10 30 ) // Since 40 > 20 and 40 < 50, so 40 is inserted in between 20 and 50.Now, Pass - 3 can compare a[3] with a[0], a[1] and a[2].
Pass - 3 : 
( 20 40 5010 30 ) -> ( 10 20 40 50 30 ) // Since 10 < 20, so it is inserted before 20.Now, Pass - 4 can compare a[4] with a[0], a[1], a[2] and a[3].
Pass - 4 : 
( 10 20 40 5030  ) -> ( 10 20 30 40 50 ) // Since 30 > 10, 30 > 20 but 30 < 40, so 30 is inserted in between 20 and 40 .After completion of Pass - 4 all the elements of the array are sorted. So, the result is 10 20 30 40 50.

Write a class InsertionSorting with a public method insertionSort. The method receives one parameter array of int type. Write a code to sort the array elements using insertion sort technique.

For example:
Cmd Args : 10 23 15 8 5
5
8
10
15
23
Note: Make sure to use the println() method and not the print() method.

package q11040;

public class InsertionSorting{
	
	public static void insertionSort(int[] array){
		
		
		
		int size =array.length;
		
		for(int i=1;i<size;i++){
			
			int key = array[i];
			
			int j=i-1;
			
			
			
			while(j >=0 && key < array[j]){
				
				array[j+1]=array[j];
				
				--j;
				
			}
			
			array[j+1]=key;
			
		}
		
		for(int k=0;k<size;k++){
			
			System.out.println(array[k]);
			
		}
		
	}
	
}


