The below code is used to understand the difference between String and StringBuilder objects. When we try to concatenate two strings using string operations a new object is created without changing the old one. In StringBuilder existing object is modified. In the below program this can be illustrated by comparing Hash Code for String object after every concat operation. Fill the missing code in the below program and observe the output.

Sample Input and Output:
In Strings before concatenation Hash Code is: 2081
In Strings after concatenation Hash Code is: 64578
In StringBuilder before concatenation Hash Code is: 321001045
In StringBuilder after concatenation Hash Code is: 321001045



package q24216;
public class StringBuilderDemo {
	public static void main(String args[]) {
		String s = new String("AB");
		System.out.print("In Strings before concatenation Hash Code is: ");
		System.out.println(s.hashCode());
		s += "C";
		// print hash code after concatenating
		System.out.println(s.hashCode());
		StringBuilder sb = new StringBuilder("AB");
		// print hash code before concatenating
		System.out.println(sb.hashCode());
		// add string C to AB 
		s+="C";
		// print hash code after concatenating
		System.out.println(sb.hashCode());
		
		// and observe the output
		
	}
}