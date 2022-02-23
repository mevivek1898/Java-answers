Binary search is faster than linear search, as it uses divide and conquer technique and it works on the sorted list either in ascending or descending order.

Binary search (or) Half-interval search (or) Logarithmic search is a search algorithm that finds the position of a key element within a sorted array.

Binary search compares the key element to the middle element of the array; if they are unequal, the half in which the key element cannot lie is eliminated and the search continues on the remaining half until it is successful.

The working procedure for binary search is as follows:

Let us consider an array of n elements and a key element which is going to be search in the list of elements.
The main principle of binary search has first divided the list of elements into two halves.
Compare the key element with the middle element.
If the comparison result is true the print the index position where the key element has found and stop the process.
If the key element is greater than the middle element then search the key element in the second half.
If the key element is less than the middle element then search the key element in the first half.
Repeat the same process for the sub lists depending upon whether key is in the first half or second half of the list until a match is found (or) until all the elements in that half have been searched.
Let us consider an example of array numbers "50 20 40 10 80", and the key element is to find is 10.

Search - 1 : 
First Sort the given array elements by using any one of the sorting technique.
After sorting the elements in the array are 10 20 40 50 80 and initially low = 0, high = 4.
Search - 2 : 
Compare 10 with middle element i.e., (low + high) / 2 = (0 + 4) / 2 = 4 / 2 = 2, a[2] is 40.
Here 10 < 40 so search the element in the left half of the element 40. So low = 0, high = mid - 1 = 2 - 1 = 1.
Search - 3 : 
Compare 10 with middle element i.e., (low + high) / 2 = (0 + 1) / 2 = 1 / 2 = 0, a[0] is 10.
Here 10 == 10 so print the index 0 where the element has found and stop the process
Write a class BinarySearch with a public method binarySearch that takes two parameters an array of type int[] and a key of type int. Write a code to search the key element within the array elements by using binary search technique.

Examples for your understanding:
Cmd Args : 10 1 2 3 4 5 4
Search element 4 is found at position : 4
Cmd Args : 10 8 12 11 9
Search element 9 is not found


package q11045;

public class BinarySearch{
	
	public static int binaryS(int[] array,int key){
		
		int low = 0;
		
		int high = array.length-1;
		
		while(low<=high){
			
			int mid = low +(high-low)/2;
			
			if(array[mid] == key ){
				
				return mid;
				
			}
			
			
			
			if(array[mid] <key ){
				
				low = mid-1;
				
			}else{
				
				high = mid -1;
				
			}
			
		}
		
		return-1;
		
		
		
	}
	
	public static void binarySearch(int[] array,int key){
		
		int lpu = binaryS(array,key);
		
		if(lpu==-1){
			
			System.out.println("Search element "+key+" is not found");
			
		}else{
			
			System.out.println("Search element "+key+" is found at position : "+lpu);
			
		}
		
	}
	
}

