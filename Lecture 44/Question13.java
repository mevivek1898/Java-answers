The Java compiler apart from compiling the source code into .class files, at times also performs certain optimizations.
For example, the below code
String text1 = "I ";
String text2 = "AM ";
String text3 = "THAT ";
String text4 = "I AM";
String fullText = text1 + text2 + text3 + text4;
is optimized by the Java compiler as
String text1 = "I ";
String text2 = "AM ";
String text3 = "THAT ";
String text4 = "I AM";
String fullText = new StringBuilder().append(text1).append(text2).append(text3).append(text4).toString();
By doing this the compiler ensured that during the runtime, a single StringBuilder object is created in memory and used to concatenate all the four String objects.

However when we perform concatenation in loops, the optimization may not be as efficient. For example:
String finalText = "";
for (String text : reallyBigStringArr) {
	finalText = finalText + text;
}
will be optimized by the compiler as below code
String finalText = "";
for (String text : reallyBigStringArr) {
	finalText = new StringBuilder().append(finalText).append(text).toString();
}
The above code is not really optimized, since a new StringBuilder object is created in each iteration of the loop (which is eventually discarded).

In such cases we could have used StringBuilder as below:
StringBuilder sb = new StringBuilder();
for (String text : reallyBigStringArr) {
	sb.append(text);
}
String finalText = sb.toString();
See and retype the below code.



package q11308;
public class ConcatenationDemo {
	public static void main(String[] args) {
		String[] wordsArr = {"I", "AM", "THAT", "I AM"};
		StringBuilder sb = new StringBuilder();
		for (String word : wordsArr) {
			sb.append(word).append(" ");
		}
		String theRealMe = sb.toString();
		System.out.println("theRealMe = " + theRealMe);
	}
}
