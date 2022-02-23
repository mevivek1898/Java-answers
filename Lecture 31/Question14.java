Write a class EndsWith with a main method. The method receives one command line argument. Print true if the argument ends with bad, else print false.

For Example:
Cmd Args : Hyderabad
true
Note: Make sure to use println and not print method.

package q11204;
public class EndsWith{
	
	public static void main(String args[]){
		
		String s1=args[0];
		
		if(s1.endsWith("bad")) System.out.println("true") ;
		
		else System.out.println("false"); 
		

	
	}
}