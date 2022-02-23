Write a class ConcatenateArrays with a public method concatenate that takes two parameters arr1 and arr2 are of type int[]. Create a new array that has the elements of both arr1 and arr2 in the same order and print the elements.

Example:
Enter no of elements in the arr1:
3
Enter elements in the arr1 separated by space:
1 2 3
Enter no of elements in the arr2:
3
Enter elements in the arr2 separated by space:
4 5 6
The resultant array is : 
1
2
3
4
5
6

package q11070;
public class ConcatenateArrays {
	
	
	
	
	
	public void concatenate(int[] arr1,int[] arr2) {
		
		
		
		for(int i=0;i<arr1.length;i++){
			
			System.out.println(arr1[i]);
			
			
			
		}
		
		for(int i=0;i<arr2.length;i++){
			
			System.out.println(arr2[i]);
			
			
			
		}
		

		}
	}


