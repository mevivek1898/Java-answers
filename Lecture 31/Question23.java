Write a program in a class RemovePrefix with a main method. The program receives one command line argument.

The program should remove the first two characters from the argument and print the output, except in one condition. The program should skip removal of x or y if it encounters them in the first two positions.

These are some examples for your understanding:

Sample Input Output 1
Cmd Args : xyz
xyz
Sample Input Output 2
Cmd Args : abTree
Tree
Sample Input Output 3
Cmd Args : ayFlower
yFlower
Note: Make sure to use println and not print method.


package q11213;
public class RemovePrefix {
	
	public static void main(String[] args) {
		
		if((args[0].charAt(0)=='x' && args[0].charAt(1)=='y') || (args[0].charAt(0)=='y' && args[0].charAt(1)=='x'))
		
		System.out.println(args[0]);
		
		else if(args[0].charAt(1)== 'x' || args[0].charAt(1)=='y')
		
		System.out.println(args[0].substring(1));
		
		else if(args[0].charAt(0)=='y' || args[0].charAt(0)=='x')
		
		System.out.println(args[0].substring(0,1) +args[0].substring(2));
		
		else System.out.println(args[0].substring(2));
	}
}


