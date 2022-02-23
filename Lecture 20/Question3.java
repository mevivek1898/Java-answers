Selection sort process can be done in two ways, one is the largest element method and the other is smallest element method.

The working procedure for selection sort using the largest element method is as follows:

Let us consider an array of n elements (i.e., a[n]) to be sorted.
In the first step, the largest element in the list is searched. Once the largest element is found, it is exchanged with the element which is placed at the last position. This completes the first pass.
In the next step, it searches for the second largest element in the list and it is interchanged with the element placed at second last position. This is done in second pass.
This process is repeated for n - 1 passes to sort all the elements.
Let us consider an example of array numbers "80 10 50 20 40", and sort the array from lowest number to greatest number using selection sort by the largest element.

Pass - 1 : 
( 80 10 50 20 40 ) -> ( 40 10 50 20 80 ) // First finds the largest element and it is exchanged with the last position element.After completion of Pass - 1, the largest element is moved to the end of the array.

Now, Pass - 2 can find the next largest element with out considering the last position element.
Pass - 2 : 
( 40 10 50 20 80 ) -> ( 40 10 20 50 80 ) // Largest in 40 10 50 20 is 50 and it is replaced with next last position of the array.After completion of Pass - 2 the second largest element is moved to the second last position of the array.

Now, Pass - 3 can find the next largest element with out considering the last two position elements because they are already sorted.
Pass - 3 : 
( 40 10 20 50 80 ) -> ( 20 10 40 50 80 ) // Largest in 40 10 20 is 40 and it is replaced with next last position of the array.After completion of Pass - 3 the third largest element is moved to the third last position of the array.

Now, Pass - 4 can find the next largest element with out considering the last three position elements because they are already sorted.
Pass - 4 : 
( 20 10 40 50 80 ) -> ( 10 20 40 50 80 ) // Largest in 20 10 is 20 and it is replaced with next last position of the array.After completion of Pass - 4 all the elements of the array are sorted. So, the result is 10 20 40 50 80.

Write a class SelectionSortingLargestElement with a public method selectionSortLargestEle. The method receives one parameter array of type int. Write a code to sort the array elements by using selection sort - largest element method.

For example:
Cmd Args : 63 83 33 53
33
53
63
83
Note: Make sure to use the println() method and not the print() method.

Note: Please don't change the package name.

package q11041;

public class SelectionSortingLargestElement{
	
	public static  void selectionSortLargestEle(int[] array){
		
		int  size = array.length;
		
		
		
		for(int i=0;i<size-1;i++){
			
			int lowest = i;
			
			
			
			for(int j= i+1;j<size;j++){
				
				if(array[j]<array[lowest]){
					
					lowest = j;
					
					
					
				}
				
			}
			
			int temp = array[i];
			
			array[i]=array[lowest];
			
			array[lowest]=temp;
			
			
			
		}
		
		for(int k=0;k<size;k++){
			
			System.out.println(array[k]);
			
		}
		
	}
	
}

