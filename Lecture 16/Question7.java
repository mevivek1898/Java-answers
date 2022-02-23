Write a class PrintEvenNumbers with a public method printEvenNumbers that takes one parameter arr of type int[].

Write code using for-each loop to iterate over the arr if the number is even the program should print is even otherwise, it should print is not even.

Here is an example:
Cmd Args : 13 14 15
13 is not even
14 is even
15 is not even
Hint: You can use value % 2 == 0. Meaning, you can use the modulus operator (%) to divide a number by 2 and get the remainder, to verify if the reminder is equal to 0.



Note: Please don't change the package name.

package q10878;
public class PrintEvenNumbers {
	
	public void printEvenNumbers(int[] arr) {
		for(int i : arr){
			if(i%2 ==0){
				System.out.println(i+" is even");
			}else{
				System.out.println(i+" is not even");
			}
		}
	}	
}