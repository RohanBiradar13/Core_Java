package utils;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.stream.Stream;

public interface IOUtils {

	static void writeData(Stream students,String fileName) throws FileNotFoundException {
		//Java app --> printWriter(Buffer)--->FileSystem---->File
		PrintWriter pw = new PrintWriter(new File(fileName));
		students.forEach(pw::println);
		pw.close();
	}
}
