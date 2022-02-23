Write a class SequenceCount with a public method sequenceCount that takes one parameter arr of type int[] and returns the count of sequences present in the arr. The return type of sequenceCount should be int.

Assumptions:
arr is never null
arr may contain zero or more sequences
A sequence is defined as a combination of three numbers in continuous sequence which are of values: 1x, 2x, 3x.

Here are some examples for your understanding:
Cmd Args : 9 7 3 6 9
1
Cmd Args : 2 6 8 2 1
0
Cmd Args : 10 20 30 1 2 3
2


package q11064;

public class SequenceCount {
	/**
	 * Find the count of sequences present in the given arry.
	 * 
	 * 
	 * 
	 * 
	 * @return count
	 */ 
	
	
	
	public int sequenceCount(int[] arr) {
		int count=0,i=0;
		//Write your code here
		while(arr!=null && i<arr.length-2){
			if((arr[i+1]== 2*arr[i])  && (arr[i+2] == 3*arr[i]) ){
				count++;
			}
			i++;
		}
		return count;
		
	}
}