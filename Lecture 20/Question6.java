Searching specifies the way to search an element from the list of elements.

Linear search (or) Sequential search is to scan each entry in the list in a sequential manner until the desired element is found. i.e., it means to find a particular key element in a list of elements in a sequential manner.

Linear search is a searching technique in which it sequentially checks each element of the list for the target value until a match is found (or) until all the elements have been searched.

The working procedure for linear search is as follows:

Let us consider an array of n elements and a key element which is going to be search in the list of elements.
Compare the key element with the first element a[0], if it is matched then stop the process and print the index of the key element where it is found, otherwise repeat the same process with a[1].
Compare the key element with the second element a[1], if it is matched then stop the process and print the index of the key element where it is found, otherwise repeat the same process with a[2].
Continue this process until a match is found (or) until all the elements have been searched.
Let us consider an example of array numbers "50 20 40 10 80", and the key element is to find is 10.

Search - 1 : 
Compare 10 with value of a[0] i.e., 50, both are not equal so repeat the same process with a[1].
Search - 2 : 
Compare 10 with value of a[1] i.e., 20, both are not equal so repeat the same process with a[2].
Search - 3 : 
Compare 10 with value of a[2] i.e., 40, both are not equal so repeat the same process with a[3].
Search - 4 : 
Compare 10 with value of a[3] i.e., 10, both are equal so stop the process and print index value where it found, i.e., position 3.
Write a class LinearSearch with a public method linearSearch that takes two parameters an array of type int[] and a key of type int. Write code to search key element within the array elements by using linear search technique.

Examples for your understanding:
Cmd Args : 10 20 30 40 20
Search element 20 is found at position : 1
Cmd Args : 15 25 18 9
Search element 9 is not found



package q11044;

public class LinearSearch{
	
	public static int linearS(int [] array,int key ){
		
		int size=array.length;
		
		for(int i=0;i<size;i++){
			
			if(array[i]==key){
				
				return i;
				
			}
			
		}
		
		return-1;
		
	}
	
	public static void linearSearch(int [] array,int key ){
		
		int lpu=linearS(array,key);
		
		if(lpu== -1){
			
			System.out.println("Search element "+key+" is not found");
			
		} else{
			
			System.out.println("Search element "+key+" is found at position : " +lpu);
			
		}
		
	}
	
}
