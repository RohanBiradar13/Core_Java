package utils;

import static utils.CollectionUtils.populateData;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.util.Map;

import com.app.core.Book;

public interface SerIOUtils {

	// add a static method to store book details to bin file
	static void storeBooks(Map<String, Book> books, String fileName) throws IOException {
		ObjectOutput out = new ObjectOutputStream(new FileOutputStream(fileName));
		out.writeObject(books);
		System.out.println("in store book details");
	}

//add a static method to restore books : from bin file
//in case of any excecution -- return map popluated with sample data
//in case of no error -- return map populated with the data from the bin file.

	@SuppressWarnings("unchecked")
	static Map<String, Book> restoreBooks(String fileName) {
		try {
			ObjectInput in = new ObjectInputStream(new FileInputStream(fileName));
			System.out.println("in restore method");
			return (Map<String, Book>) in.readObject();
			
		} catch (Exception e) {
			return populateData();

		}

	}
}