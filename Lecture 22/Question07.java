Write a class FindCenteredAverage with a public method findCenteredAverage that takes one parameter arr of type int[] and returns the centered average of the elements in the arr

Hint: exclude the biggest and smallest numbers from the array and compute the average of the remaining numbers. If there is more than one smallest value excludes only one of those. Similarly for biggest also.

Here is an example:
Enter no of elements in the array:
9
Enter elements in the array separated by space:
1 5 1 1 9 9 1 9 2
4


package q11092;
public class FindCenteredAverage {
	
	public int findCenteredAverage(int[] arr) {
		
		int sum = 0, avg=0;
		
		for (int t=0; t<arr.length-1; t++){
			
			for (int j=0; j<arr.length-t-1; j++){
				
				if(arr[j]>arr[j+1]){
					
					int tt =arr[j];
					
					arr[j] = arr[j+1];
					
					arr[j+1] = tt;
					
				}
			}
		}		
				for (int i=1; i<arr.length-1; i++){
					
					sum = sum + arr[i];
					
					avg = sum / (arr.length-2);
				}		
					return avg;
					
		
	}
}