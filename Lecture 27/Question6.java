Fix the text in the main method using escape characters to produce the below output.

insert into Employee(id, name) values("10","Meka");
insert into Employee(id, name) values("11","Reka");


package q11149;
public class EscapeSequence {
	public static void main(String[] args) {
		String text1 = "insert into Employee(id, name) values(\"10\",\"Meka\");";
		String text2 = "insert into Employee(id, name) values(\"11\",\"Reka\");";
		System.out.println(text1);
		System.out.println(text2);
	}
}

