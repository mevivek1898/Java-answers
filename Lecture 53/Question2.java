The Files utility class contains many static methods which work on files and directories represented by Path objects.

Files class provides two easy to use methods for copying and moving. Their method signatures are given below:
copy(Path source, Path target, CopyOption... options) - copies the contents represented by source path to the (target) destination path.
move(Path source, Path target, CopyOption... options) - moves the contents represented by source path to the (target) destination path.
The class named Files also provides a convenient method to write bytes to small files write(Path path, byte[] bytes, OpenOption... option), it is suggested to be used only for small files. We will later learn efficient ways of reading and writing data to large files. It also has a corresponding method for reading all bytes, which should be used only for small files.

The StandardOpenOption.CREATE when passed to the above mentioned Files.write as the OpenOption, the write method creates the file if the file does not exists and will not throw an exception if it already exists. StandardOpenOption.TRUNCATE_EXISTING option will make sure that if the file exists, the old content is deleted.

See and retype the below code.



package q11353;
import java.util.*;
import java.io.*;
import java.nio.file.*;
public class FilesDemoSample {
	public static void main(String[] args) {
		Path currentWorkingDirPath = Paths.get("");
		System.out.println("currentWorkingDirPath.toAbsolutePath() : " + currentWorkingDirPath.toAbsolutePath());
		Path path = Paths.get("FilesDemoSample.txt");
		Path pathCopy = Paths.get("FilesDemoSampleCopy.txt");
		Path pathMoved = Paths.get("FilesDemoSampleMoved.txt");
		System.out.println("Files.exists(path) : " + Files.exists(path));
		System.out.println("Files.exists(pathCopy) : " + Files.exists(pathCopy));
		System.out.println("Files.exists(pathMoved) : " + Files.exists(pathMoved));
		String text = "Current time is : " + new Date();
		byte[] contentArr = text.getBytes();
		try {
			Files.write(path, contentArr, StandardOpenOption.CREATE, StandardOpenOption.TRUNCATE_EXISTING);
			Files.copy(path, pathCopy, StandardCopyOption.REPLACE_EXISTING);
			Files.move(path, pathMoved, StandardCopyOption.REPLACE_EXISTING);
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("After writing, copying and moving");
		System.out.println("path.toAbsolutePath() : " + path.toAbsolutePath());
		System.out.println("Files.exists(path) : " + Files.exists(path));
		System.out.println("pathCopy.toAbsolutePath() : " + pathCopy.toAbsolutePath());
		System.out.println("Files.exists(pathCopy) : " + Files.exists(pathCopy));
		System.out.println("pathMoved.toAbsolutePath() : " + pathMoved.toAbsolutePath());
		System.out.println("Files.exists(pathMoved) : " + Files.exists(pathMoved));
	}
}