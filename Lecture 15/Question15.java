Create a class FindMax with a public method findMax that takes three parameters arg1, arg2, and arg3 are of type int. The program should print the largest of the given numbers.

For example:
Cmd Args : 10 20 5
20
Note: Please don't change the package name.

package q10930;

public class FindMax{
	
	public void findMax(int a1, int a2, int a3){
		
		if(a1>a2 && a1>a3){
			
			System.out.println(a1);
			
		}else if(a2>a1 && a2>a3){
			
			System.out.println(a2);
			
		}else{
			
			System.out.println(a3);
			
		}
		
		}
	
}