Write a class PrintOddNumbers with a public method printOddNumbers that takes one parameter arr of type int[].

Use for-each loop to iterate over the arr and the program should print is odd if the element is odd otherwise, it should print is not odd.

For example:
Cmd Args : 1 2 3 4 5 6
1 is odd
2 is not odd
3 is odd
4 is not odd
5 is odd
6 is not odd


Note: Please don't change the package name.

package q10879;
public class PrintOddNumbers{
	
	public static void printOddNumbers(int arr[]){
		
		for (int i:arr){
			
			if(i%2==0){
				
				System.out.println(i+" is not odd");
				
				}else{
					
					System.out.println(i+" is odd");
				}
			
		}	
}
}