Write a class MultiplesInArray with a public method findMultiples that takes three parameters arr of type int[] and other two are m1 and m2 are of type int. Print all the elements in the array, but if any element in the array is a multiple of m1, print multiple of (actual value of m1 should be printed instead of ). If it is a multiple of m2, print multiple of . If it is a multiple of both m1 and m2, print multiple of m1 and m2.

For example:
Enter no of elements in the array:
6
Enter elements in the array separated by space:
1 2 34 5 6 7
Enter the first multiple element:
2
Enter the second multiple element:
3
1
2 is multiple of 2
34 is multiple of 2
5
6 is multiple of 2 and 3
7


package q11091;
public class MultiplesInArray {
	
	public void findMultiples(int[] arr, int m1, int m2) {
		
		for(int i=0; i<arr.length; i++){
			
			if(arr[i]%m1==0 && arr[i]%m2==0) {
				
				System.out.println(arr[i] + " is multiple of " + m1 + " and "+ m2);
			}
				else if(arr[i]%m2==0){
					
					System.out.println(arr[i] +" is multiple of " + m2);
				}
					else if (arr[i]%m1==0){
						
						System.out.println(arr[i]+" is multiple of " + m1);
					}
						else
						
						System.out.println(arr[i]);
					
		
		}
	}
}