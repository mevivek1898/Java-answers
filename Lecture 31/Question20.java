Write a class AppendChars with a main method. The method receives one commmand line argument. If the argument length is less than 10, append '*' at the end to make the length 10.

For example:
Cmd Args : Smile
Smile*****


package q11210;
public class AppendChars {
	public static void main(String args[]){
	String ans=args[0].substring(0);
		if(args[0].length()<10) {
		while(ans.length()<10)
		ans+="*";
		}
		System.out.println(ans);
		
		
		
	}
	
	
	
}


