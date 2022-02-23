Byte streams are not the correct choice to work on character data, when such data has to be read for parsing. We use byte streams mainly to carry content without interpretation.

java.io package has two abstract classes called Reader and Writer which are very similar to InputStream and OutputStream.

These two classes are the super classes for all character streams. Unlike byte streams which work on raw bytes, the readers and writers perform automatic conversion from bytes to characters using the system's local character sets.

The abstract classes InputStream and OutputStream are the super classes for all byte streams.

Reader provides the below three methods to read input:
read() - it reads the next char of data from the reader and returns the value of that char as an int.
read(char[] charArr) - it reads some number of characters from the reader and stores them into the character array charArr and returns the count of characters read.
read(char[] charArr, int startOffsetInByteArr, int length) - it tries to reads a maximum of length characters from the reader into charArr and returns the actual count of characters it read.
In the above methods we should remember that in the second and third methods the count of characters returned depends on the characters available and were read.

Similarly there are three corresponding write methods in the Writer:
write(int singleChar) - it writes the singleChar provided as an int value into the method.
write(char[] charArr) - it writes all the characters in the character array charArr into the output stream.
write(char[] charArr, int startOffsetInByteArr, int length) - it writes the length characters stored in charArr from startOffsetInByteArr into the writer.


Both the Input and output streams implement Closeable interface, which contains a close() method.

Closing streams after use is very important to free up resources. The below code demonstrates the try-with-resources syntax which automatically closes the resources that implement the inteface java.lang.AutoCloseable.

See and retype the below code which demonstrates how to use the above mentioned read and write methods.

The code first creates dummy text in a StringBuilder. It then uses a StringReader instance, which wraps the string containing the content in the StringBuilder instance and presents it as a reader. The code uses a FileWriter to write to a file.

The contents of the newly written file are once again read and printed to console to verify.


package q11355;
import java.util.*;
import java.io.*;
import java.nio.file.*;
public class ReaderWriterDemo {
	public static void main(String[] args) throws IOException {
		StringBuilder sb = new StringBuilder();
		sb.append("This text was written at 1 time\n");
		for (int i = 2; i <= 10; i++) {
			sb.append("This text was written at " + i + " times\n");
		}
		Reader reader = new StringReader(sb.toString());
		String outputFileName = "CharStreamsDemo.txt";
		try (FileWriter fw = new FileWriter(outputFileName)) {
			char[] charsArr = new char[512];
			int charsRead = 0;
			while ((charsRead = reader.read(charsArr)) != -1) {
				fw.write(charsArr, 0, charsRead);
			}
		}
		Path outputFilePath = Paths.get(outputFileName);
		byte[] contentArr = Files.readAllBytes(outputFilePath);
		System.out.println(new String(contentArr));
	}
}
