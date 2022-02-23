Create a class RangeCheck with a public method checkRange that takes two parameters first and second are of type int. If one of the numbers is within the range of 25 to 35 (both inclusive) the program should print Within range, otherwise it should print Out of range.

For example:
Cmd Args : 25 79
Within range
Note: Please don't change the package name.

package q10927;

public class RangeCheck{
	
	public static void checkRange(int f, int s){
		
		if((f>=25 && f<=35) || (s>=25 && s<=35)){
			
			System.out.println("Within range");
			
		}else{
			
			System.out.println("Out of range");
			
		}
		

	}
}