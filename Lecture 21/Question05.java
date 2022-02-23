package q11050;
public class ElementCheck {
	/**
	 * check if first or last elements of the arr1 and arr2 are same or not
	 * 
	 * 
	 * @return result
	 */
	 
	public boolean checkFirstOrLast(int[] arr1, int[] arr2) {
		//Write your code here
		if(arr1[0]==arr2[0] || arr1[arr1.length-1]==arr2[arr2.length-1]){
			return true;
		}else{
			return false;
		}
	}
}

