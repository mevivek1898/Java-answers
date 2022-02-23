Create a class CheckSum100 with a public method checkSum that takes two parameters first and second are of type int. If one of the numbers is 100 or the sum of the numbers is 100 the program should print true, otherwise it should print false.

For example:
Cmd Args : 15 100
true
Note: Make sure to use println and not print method.

Note: Please don't change the package name.

package q10923;

public class CheckSum100{
	
	public static void checkSum( int first ,int second){
		
		if(first==100 || second==100 || first+second==100){
			
			System.out.println("true");
			
		}else{
			
			System.out.println("false");
			
		}
		}
	}
