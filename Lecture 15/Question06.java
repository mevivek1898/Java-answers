Create a class PrintDiff with a public method computeDiff that takes two parameters firstNo and secondNo are of type int.

Calculate the difference between firstNo and secondNo. If the value of the difference is in between -25 and 25, the program should double the value and print the output, otherwise it should print the difference as it is.

For example:
Cmd Args : 15 7
16


Note: Please don't change the package name.

package q10921;

public class PrintDiff {
	
	public void computeDiff(int firstNo, int secondNo) {
		
		int diff = firstNo -secondNo;
		
		if(diff>-25 && diff<25){
			
			System.out.println(diff+diff);
			
		}	
			
			else{
				
				System.out.println(diff);
				
			}
			
		}
		
	
}