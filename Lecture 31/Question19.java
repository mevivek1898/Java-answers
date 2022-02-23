Write a class CheckChars with a main method. The method receives one command line argument and prints true if the argument has the characters w, e and b.

For Example:
Cmd Args : westbengal
true


package q11209;

public class CheckChars{
	
	public static void main(String args[]){
		int cnt=0;
		for(int i=0;i<args[0].length();i++){
			
			char check=args[0].charAt(i);
			
			if(check=='w' || check=='e' || check=='b') cnt++;
			
		}
		
		String ans=(cnt>3)?"true":"false";
		
		System.out.println(ans);
		
		
		
	}
}


