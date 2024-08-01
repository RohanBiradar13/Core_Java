package utils;

import static utils.CollectionUtils.populateData;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.text.ParseException;
import java.util.HashMap;
import java.util.Map;

import com.app.core.Message;

public interface  IOUtils {

	static void writeMessage(HashMap<String,Message> msg,String fileName) throws FileNotFoundException, IOException {
	ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(fileName));
	System.out.println("in write message method");
	out.writeObject(msg);
	}


	@SuppressWarnings("unchecked")
	static HashMap<String,Message> restoreMessage(String fileName) throws  ParseException{
		System.out.println("in restore books method");
		try {
			ObjectInputStream in = new ObjectInputStream(new FileInputStream(fileName));
				return (HashMap<String, Message>) in.readObject();
			} catch (Exception e) {
				return populateData();
			}
		}
}
		
		
	
