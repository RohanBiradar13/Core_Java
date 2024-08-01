package utils;

import java.text.ParseException;
import java.util.HashMap;

import com.app.core.Message;

public interface CollectionUtils {

	static HashMap<String,Message> populateData() throws ParseException{
		HashMap<String, Message> messages = new HashMap<String, Message>();
		messages.put("someone1", new Message("someone1", "Rohan", "Rohit","Hi, Lavdu Gyan Chodu..."));
		messages.put("someone2", new Message("someone2", "Rohit", "Rohan","Hi, Bhaiya..."));
		messages.put("someone3", new Message("someone3", "Aniket", "Rohit",  "Hey, Rohit Chodu"));
		messages.put("someone4", new Message("someone4", "Kishor", "Rohit", "Hey, Rohit brother"));
		return messages;
	}
}
