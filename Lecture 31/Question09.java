Write a class ExtractTag with a main method. The method receives one command line argument in between tags like [ ], extract the argument between the tags and print the output.

For Example:
Cmd Args : [Independent]
Independent


package q11199;



public class  ExtractTag{
	
	public static void main(String[] args) {
		
		String str=args[0].replace("[","").replace("]","");
		
		System.out.println(str);
		
		
	}
}

