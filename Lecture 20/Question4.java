The working procedure for selection sort smallest element method is as follows:

Let us consider an array of n elements (i.e., a[n]) to be sorted.
In the first step, the smallest element in the list is searched. Once the smallest element is found, it is exchanged with the element which is placed at the first position. This completes the first pass.
In the next step, it searches for the second smallest element in the list and it is interchanged with the element placed at second position. This is done in second pass.
This process is repeated for n - 1 passes to sort all the elements.
Let us consider an example of array numbers "80 10 50 20 40", and sort the array from lowest number to greatest number using selection sort smallest element method.

Pass - 1 : 
( 80 10 50 20 40 ) -> ( 10 80 50 20 40 ) // First finds the smallest element and it is exchanged with the first position element.After completion of Pass - 1, the smallest element is moved to the starting position of the array.

Now, Pass - 2 can find the next smallest element with out considering the first position element.
Pass - 2 : 
( 10 80 50 20 40 ) -> ( 10 20 50 80 40 ) // Smallest in 80 50 20 40 is 20 and it is replaced with next first position of the array.After completion of Pass - 2 the second smallest element is moved to the second position of the array.

Now, Pass - 3 can find the next smallest element with out considering the first two position elements because they are already sorted.
Pass - 3 : 
( 10 20 50 80 40 ) -> ( 10 20 40 80 50 ) // Smallest in 50 80 40 is 40 and it is replaced with next position of the array.After completion of Pass - 3 the third smallest element is moved to the third position of the array.

Now, Pass - 4 can find the next smallest element with out considering the first three position elements because they are already sorted.
Pass - 4 : 
( 10 20 40 80 50 ) -> ( 10 20 40 50 80 ) // Smallest in 80 50 is 50 and it is replaced with next position of the array.After completion of Pass - 4 all the elements of the array are sorted. So, the result is 10 20 40 50 80.

Write a class SelectionSortingSmallestElement with a public method selectionSortSmallestEle. The method receives one parameter array of type int. Write code to sort the array elements by using selection sort - smallest element method.

For example:
Cmd Args : 35 25 45 65
25
35
45
65
Note: Make sure to use the println() method and not the print() method.

package q11042;

public class SelectionSortingSmallestElement{
	
	public static void selectionSortSmallestEle(int[] array){
		
		int small;
		
		int size=array.length;
		
		for(int i=0;i<size-1;i++){
			
			small=i;
			
			for(int j=i+1;j<size;j++){
				
				if(array[j]<array[small]){
					
					small=j;
					
				}
				
			}
			
			int temp = array[small];
			
			array[small]=array[i];
			
			array[i]=temp;
			
			
			
		}
		
		for(int k=0;k<size;k++){
			
			System.out.println(array[k]);
			
		}
		
	}
	
}


