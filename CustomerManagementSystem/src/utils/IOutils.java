package utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Map;
import static utils.CollectionUtils.populateData;
import com.app.core.Customer;

public interface IOutils {

	static Map<String, Customer> readData(String fileName) throws FileNotFoundException, IOException {
		try {
			@SuppressWarnings("resource")
			ObjectInputStream in = new ObjectInputStream(new FileInputStream(fileName));
			@SuppressWarnings("unchecked")
			Map<String, Customer> customers = (Map<String, Customer>) in.readObject();
			return customers;
		} catch (Exception e) {
			return populateData();
		}
	}

	static void writeData(String fileName, Map<String, Customer> customers) throws FileNotFoundException, IOException {
		@SuppressWarnings("resource")
		ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(fileName));
		out.writeObject(customers);

	}
}
