Write a class StringLastIndexOf with a main method. The method receives one command line argument. Print the index of the last but one occurrence of the string TX in the given argument.

For example:
Cmd Args : TX12TX3TX4
4
Hint: You may want to store the lastIndex of TX first into a variable. And later explore how to use the method String.lastIndexOf(String str, int fromLastIndex)


package q11175;



public class StringLastIndexOf {
	
	public static void main(String[] args) {
		
		String str = args[0];
		
		int idx=str.lastIndexOf("TX");
		
		String s=str.substring(0,idx);
		
		
		System.out.println(s.lastIndexOf("TX"));
		
		
		
		
	}
}




