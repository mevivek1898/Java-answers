The below program explains different StringBuffer constructors. Follow the comments given below and write the missing code.

The below program has a class StringbufferExample with main method. The program takes input from the command line arguments. Print the output as follows.

Sample Input and Output:
Cmd Args : Hello World
Initial capacity is: 16
Capacity after passing parameter is: 27
Creating a StringBuffer object with the given capacity: 50


package q24215;
public class StringbufferExample {
	public static void main (String args[]) {
		// create instance of StringBuffer
		// find the initial capacity
		//find the capactiy after passing a parameter args[0] using command line argument
		// find the capatity by intializing capatity to 50
		StringBuffer Initial=new StringBuffer();
		
		System.out.println("Initial capacity is: "+ Initial.capacity());
		
		Initial=new StringBuffer(args[0]);
		
		System.out.println("Capacity after passing parameter is: "+Initial.capacity());
		
		Initial=new StringBuffer(50);
		
		System.out.println("Creating a StringBuffer object with the given capacity: "+Initial.capacity());
		
	}
}


