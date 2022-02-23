Write a class SequenceCheck with a public method sequenceCheck that takes one parameter arr of type int[] and returns true if the elements 1,2,3 are present in the arr.The returen type of sequenceCheck should be boolean.

Assumptions:
arr is never null
The elements need not be in consecutive order
Here are examples:
Cmd Args : 1 6 3 2
true
Cmd Args : 3 6 4 7 8
false

package q11060;

public class SequenceCheck {
	/**
	 * check if the given array contains the elements 1,2,3 
	 * 
	 * 
	 * 
	 * @return true if contain else return false
	 */
	public static boolean isSorted(int[] a)
	
	{
		
	
	
		
		boolean aa=false,bb=false,cc=false;
		
		for (int i = 0; i < a.length ; i++)
		
		{
	//	bool a=false,b=false,c=false;	
			if (a[i] == 1 ) {
				
				aa=true;
				
			}else if(a[i]==2){
				bb=true;
			}else if(a[i]==3){
				cc=true;
			}
			
		}
		
		if(aa && bb && cc){
			return true;
		}else
		
		return false;
		
	}
	
			

	
	
	
	public boolean sequenceCheck(int[] arr) {
		
		//Write your code here
		boolean ans=isSorted(arr);
		return ans;
		
	}
}