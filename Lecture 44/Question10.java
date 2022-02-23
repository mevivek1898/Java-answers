Given
public class StringBuilderDemo {
	public static void main(String args[]) {
		String s1 = new String("ABC");
		String s2 = new String("ABC");
		System.out.println(s1.equals(s2));
		StringBuilder sb1 = new StringBuilder("ABC");
		StringBuilder sb2 = new StringBuilder("ABC");
		System.out.println(sb1.equals(sb2));
	}
}
What will be the output for the above program. Choose the correct option form the below.



Answer

true
false