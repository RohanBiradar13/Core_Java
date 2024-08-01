package utils;

import Custom_Exception.MessageHandalyingException;

public class Validation {
	public static void validateSenderRecipient(String sender, String recipient) throws MessageHandalyingException {
		
		String[] allowedNames = { "Rohit", "Rohan", "Aniket", "Aman", "Kishor" };
		if (!containsIgnoreCase(allowedNames, sender) || !containsIgnoreCase(allowedNames, recipient)) {
			throw new MessageHandalyingException(
					"Only these names (Rohit, Rohan, Aniket, Aman, Kishor) are allowed.");
		}
	}

	public static String validateContent(String content) throws MessageHandalyingException {
		if (content.toLowerCase().contains("fuck")) {
			throw new MessageHandalyingException("Grow up man, what is this fuck bro. Use some standard words as Chakke like my friend Rohit Chunge");
		}
		return content;
	}

	public static boolean containsIgnoreCase(String[] array, String target) {
		for (String s : array) {
			if (s.equalsIgnoreCase(target)) {
				return true;
			}
		}
		return false;
	}
}
