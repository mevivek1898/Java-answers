Sorting specifies the way to arrange data in a particular order either in ascending or descending.

Bubble sort is an internal sorting technique in which adjacent elements are compared and exchanged if necessary.

The working procedure for bubble sort is as follows:

Let us consider an array of n elements (i.e., a[n]) to be sorted.
Compare the first two elements in the array i.e., a[0] and a[1], if a[1] is less than a[0] then interchange the two values.
Next compare a[1] and a[2], if a[2] is less than a[1] then interchange the values.
Continue this process till the last two elements are compared and interchanged.
Repeat the above steps for n - 1 passes.
Let us consider an example of array numbers "50 20 40 10 80", and sort the array from lowest number to greatest number using bubble sort.

In each step, elements written in bold are being compared. Number of elements in the array are 5, so 4 passes will be required.
Pass - 1 : 
( 50 20 40 10 80 ) -> ( 20 50 40 10 80 ) // Compared the first two elements, and swaps since 50 > 20.
( 20 50 40 10 80 ) -> ( 20 40 50 10 80 ) // Swap since 50 > 40.
( 20 40 50 10 80 ) -> ( 20 40 10 50 80 ) // Swap since 50 > 10.
( 20 40 10 50 80 ) -> ( 20 40 10 50 80 ) // Since the elements are already in order (50 < 80), algorithm does not swap them.Total number of elements in the given array are 5, so in Pass - 1 total numbers compared are 4. After completion of Pass - 1 the largest element is moved to the last position of the array.

Now, Pass - 2 can compare the elements of the array from first position to second last position.
Pass - 2 : 
( 20 40 10 50 80 ) -> ( 20 40 10 50 80 ) // Since the elements are already in order (20 < 50), algorithm does not swap them.
( 20 40 10 50 80 ) -> ( 20 10 40 50 80 ) // Swap since 40 > 10.
( 20 10 40 5080 ) -> ( 20 10 40 50 80 ) // Since the elements are already in order (40 < 50), algorithm does not swap them.In Pass - 2 total numbers compared are 3. After completion of Pass - 2 the second largest element is moved to the second last position of the array.

Now, Pass - 3 can compare the elements of the array from first position to third last position.
Pass - 3 : 
( 20 10 40 50 80 ) -> ( 10 20 40 50 80 ) // Swap since 20 > 10.
( 10 20 4050 80 ) -> ( 10 20 40 50 80 ) // Since these elements are already in order (20 < 40), algorithm does not swap them.In Pass - 3 total numbers compared are 2. After completion of Pass - 3 the third largest element is moved to the third last position of the array.

Now, Pass - 4 can compare the first and second elements of the array.
Pass - 4 : 
( 10 2040 50 80 ) -> ( 10 20 40 50 80 ) // Since these elements are already in order (10 < 20), algorithm does not swap them.In Pass - 4 total numbers compared are 1. After completion of Pass - 4 all the elements of the array are sorted. So, the result is 10 20 40 50 80.

Write code to sort the array elements by using bubble sort technique.

Write a class BubbleSorting with a method bubbleSort(int[] array). The method receives an array of int type.

For example, if the array of elements 11, 15, 12, 10 are passed as arguments to the bubbleSort(..) method, then the output should be:
10
11
12
15
Note: Make sure to use the println() method and not the print() method.


package q11039;

public class BubbleSorting{
	
	public static void bubbleSort(int[] array){
		
		int arrsize= array.length;
		
		int temp;
		
		for(int i=0;i<arrsize-1;i++){
			
			for(int j=0;j<arrsize-i-1;j++){
				
				if(array[j]>array[j+1]){
					
					temp=array[j];
					
					array[j]=array[j+1];
					
					array[j+1]=temp;
					
				}
				
			}
			
		}
		
		for(int k=0;k<arrsize;k++){
			
			System.out.println(array[k]);
			
		}
		
	}
	
}

