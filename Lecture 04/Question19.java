Among the various print methods in Java (about which we will learn later),
System.out.println and
System.out.print are the most commonly used ones.

As the name suggests println method prints the text passed to it and also prints a new line char (\n) at the end.
However, the print method prints only the text passed, without appending the new line char as in the case of println.

As programmers we mostly use the println method when we want to see the output on separate lines.

However, there may be situations when we want to produce output in chunks and also want all the output to be on the same line. In such situations we have to use print.

Click on  to understand the difference between print and println methods.

In the code given, use the appropriate print methods such that the below output is produced.
Ganga Nile
Amazon
END
Note that we are printing a space " " between text1 and text2 so that in the output also there is a space between Ganga and Nile.

package q10765;
public class PrintMe {
	public static void main(String[] args) {
		String text1 = "Ganga";
		String text2 = "Nile";
		String text3 = "Amazon";
		System.out.print(text1);
		System.out.print(" ");
		System.out.println(text2);
		System.out.println(text3);
		System.out.println("END");

	}
}