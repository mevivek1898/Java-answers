Create a class CityNameFinder with a public method findElement that takes one parameter index of type int.

The findElement method should create an array namesArr containing these city names: Mumbai, Delhi, Kolkata, Chennai, Hyderabad, Bangalore.
Write code in the method to print the element that is present at the index passed to the method.

The program should print Wrong Index if the value of index is not in the range of valid indices of the array.

For example:
Cmd Args : 99
Wrong Index

package q10939;
public class CityNameFinder {
	/**
	 * Create an array which contains given names
	 * 
	 * 
	 * @print the index element
	 * 
	 */ 
	
	public void findElement(int index) {
		//Write your code here
		
		
		String[] namesArr = { "Mumbai", "Delhi", "Kolkata", "Chennai", "Hyderabad", "Bangalore"};
		
		if(index>=0 && index<namesArr.length) {
			
			System.out.println(namesArr[index]);
			
		}else{
			
			System.out.println("Wrong Index");
			
		}
		
	
		
	}
}