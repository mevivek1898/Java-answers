Write a class CompareArrays with a public method compareArrays that takes two parameters arr1 and arr2 are of type int[] and returns true if arr1 and arr2 are of equal length and also have same elements. else returns false

Here are examples for your understanding:
Enter no of elements in the arr1:
3
Enter elements in the arr1 seperated by space:
8 9 7
Enter no of elements in the arr2:
3
Enter elements in the arr2 seperated by space:
8 9 7
true
Enter no of elements in the arr1:
3
Enter elements in the arr1 seperated by space:
3 6 7
Enter no of elements in the arr2:
4
Enter elements in the arr2 seperated by space:
3 6 7 1
false
Hint: Iterate through the first array and compare each element with the corresponding element in the second array.

Note: Please don't change the package name.
Sample Test Cases
Test Case 1:
Expected Output:
Enter·no·of·elements·in·the·arr1:
3
Enter·elements·in·the·arr1·seperated·by·space:
8 9 7
Enter·no·of·elements·in·the·arr2:
3
Enter·elements·in·the·arr2·seperated·by·space:
8 9 7
true

Test Case 2:
Expected Output:
Enter·no·of·elements·in·the·arr1:
3
Enter·elements·in·the·arr1·seperated·by·space:
12 54 36
Enter·no·of·elements·in·the·arr2:
4
Enter·elements·in·the·arr2·seperated·by·space:
54 69 78 52
false

Test Case 3:
Expected Output:
Enter·no·of·elements·in·the·arr1:
3
Enter·elements·in·the·arr1·seperated·by·space:
3 6 7
Enter·no·of·elements·in·the·arr2:
4
Enter·elements·in·the·arr2·seperated·by·space:
3 6 7 1
false

Test Case 4:
Expected Output:
Enter·no·of·elements·in·the·arr1:
0
Enter·elements·in·the·arr1·seperated·by·space:
Enter·no·of·elements·in·the·arr2:
0
Enter·elements·in·the·arr2·seperated·by·space:
true


package q11067;

public class CompareArrays {
	/** Compare lengths and elements of the arr1 and arr2 are equal or not
	 * 
	 * 
	 * 
	 * @return result
	 */ 
	
	public boolean compareArrays(int[] arr1, int[] arr2) {
		
		//Write your code here
		boolean ans=(arr1.length==arr2.length)?true:false;
		int count=0;
		if(ans==true){
		for(int i=0;i<arr1.length;i++){
			if(arr1[i]==arr2[i]){
				count++;
		}
		}
		}
		if(ans==false || count<arr1.length){
			return false;
		}else{
			return true;
		}
		
		
	}
}