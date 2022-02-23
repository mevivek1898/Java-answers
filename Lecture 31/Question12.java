Write a class ReverseString with a main method. The method receives one command line argument. Write a logic to reverse it and print the output.

For Example:
Cmd Args : Ram lakshman
namhskal maR

package q11202;
public class ReverseString{
	public static void main(String[] args){
		String s=args[0];
		String ans="";
		for(int i=s.length()-1;i>=0;i--){
			ans+=s.charAt(i);
		}
		System.out.println(ans.trim());
	}
}