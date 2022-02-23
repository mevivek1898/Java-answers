The input and output streams represent sources and destinations from where data can be read and written to. The sources and destinations can be files on a storage device or network sockets or in memory arrays.

The java.io package contains all the main classes related to different kinds of streams which can work on raw bytes, characters and even objects.

The streams which work on bytes are called byte streams. The one which work on character data are called readers and writers. Java also provides streams which are capable of reading and writing Java objects from and to a persistent storage.

The abstract classes InputStream and OutputStream are the super classes for all byte streams.

InputStream provides the below three methods to read input:
read() - it reads the next byte of data from the input stream and returns the value of that byte as an int.
read(byte[] byteArr) - it reads some number of bytes from the input stream and stores them into the byte array byteArr and returns the count of bytes read.
read(byte[] byteArr, int startOffsetInByteArr, int length) - it tries to reads a maximum of length bytes of data from the input stream into an array of byteArr and returns the actual count of bytes it read.
Among the above three methods we should remember that the count of bytes returned by the 2nd and 3rd methods depend on the bytes available and were read.

Similarly there are three corresponding write methods in the OutputStream:
write(int singleByte) - it writes the singleByte of data provided as an int value into the method.
write(byte[] byteArr) - it writes all the bytes in the byte array byteArr into the output stream.
write(byte[] byteArr, int startOffsetInByteArr, int length) - it writes the length bytes stored in byteArr from startOffsetInByteArr into the output stream.
Both the Input and output streams implement Closeable interface, which contains a close() method.

Closing streams after use is very important to free up resources.

See retype the below code which demonstrates how to use the above mentioned read and write methods.

The code first creates dummy text in a StringBuilder. It then uses a ByteArrayInputStream instance, which wraps the byte array containing the content in the StringBuilder instance and presents it as an input stream. The code uses a FileOutputStream to write to a file.

The contents of the newly written file are once again read and printed to console to verify.


package q11354;
import java.util.*;
import java.io.*;
import java.nio.file.*;
public class ByteStreamsDemo {
	public static void main(String[] args) throws IOException {
		StringBuilder sb = new StringBuilder();
		sb.append("This text was written at 1 time\n");
		for (int i = 2; i <= 10; i++) {
			sb.append("This text was written at " + i + " times\n");
		}
		InputStream bais = new ByteArrayInputStream(sb.toString().getBytes());
		OutputStream fos = null;
		String outputFileName = "ByteStreamsDemo.txt";
		try {
			fos = new FileOutputStream(outputFileName);
			byte[] byteArr = new byte[512];
			int bytesRead = 0;
			while ((bytesRead = bais.read(byteArr)) != -1) {
				fos.write(byteArr, 0, bytesRead);
			}
		} finally {
			if (fos != null) {
				fos.close();
			}
		}
		Path outputFilePath = Paths.get(outputFileName);
		byte[] contentArr = Files.readAllBytes(outputFilePath);
		System.out.println(new String(contentArr));
	}
}