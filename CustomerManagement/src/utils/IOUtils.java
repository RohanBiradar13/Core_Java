package utils;

import static utils.CustomersUtility.populateData;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.text.ParseException;
import java.util.HashMap;

import com.app.core.Customer;

public interface IOUtils {

	static void writeData(HashMap<String, Customer> customers, String fileName)
			throws FileNotFoundException, IOException {
		@SuppressWarnings("resource")
		ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(fileName));
		out.writeObject(customers);

	}

	@SuppressWarnings("unchecked")
	static HashMap<String, Customer> readData(String fileName) throws ParseException {
		System.out.println("in readData method");
		try {
			ObjectInputStream in = new ObjectInputStream(new FileInputStream(fileName));
			return (HashMap<String, Customer>) in.readObject();
		} catch (Exception e) {
			return populateData();

		}

	}
}
