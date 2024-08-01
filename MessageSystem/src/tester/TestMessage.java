package tester;

import static utils.CollectionUtils.populateData;
import static utils.Validation.*;
import java.text.ParseException;
import java.util.HashMap;
import java.util.Scanner;
import static utils.IOUtils.*;
import com.app.core.Message;

import Custom_Exception.MessageHandalyingException;
public class TestMessage {

	public static void main(String[] args) throws ParseException {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter the file name");
			String fileName = sc.next();
			HashMap<String, Message> messages = restoreMessage(fileName);
			boolean exit = false;
			while (!exit) {
				System.out.println("1.Add a message");
				System.out.println("2.Remove a message");
				System.out.println("3.Update a message");
				System.out.println("4.Get message by id");
				System.out.println("5.All messages");
				try {
					switch (sc.nextInt()) {
					case 1:
						//String messageId, String sender, String recipient, Date date, String content
                        System.out.println("Enter the messageId, sender, recipientent name, message");
                        String messageId = sc.next();

                        String sender = sc.next();
                        String recipinet = sc.next();
                        validateSenderRecipient(sender, recipinet);
                        messages.put(messageId, new Message(messageId, sender, recipinet, validateContent(sc.nextLine())));
						break;
					case 2:
                        System.out.println("Enter the messageId you want to delete");
                         messageId = sc.next();
                        messages.remove(messageId);
                        System.out.println("Message removed");
						break;
					case 3:
                        System.out.println("Enter the messageId whose message you want to update");
                        messageId=sc.next();
                        Message m = messages.get(messageId);
                        if(m!=null) {
                        	m.setContent(sc.nextLine());
                        }else {
                        	throw new MessageHandalyingException("Invalid messageId");
                        }
						break;
					case 4:
                        System.out.println("Enter the messsageId you want to get the details");
                        messageId=sc.next();
                        if(messages.get(messageId) != null) {
                        	System.out.println(messages.get(messageId));
                        }else
                        	throw new MessageHandalyingException("Invalid messageId");
						break;
					case 5:
                        System.out.println("All messages history..");
                        messages.values().stream().forEach(System.out::println);
						break;

					case 6:
						exit = true;
						writeMessage(messages, fileName);
						break;
					default:
						System.out.println("Invalid Choice");
						break;
					}

				} catch (Exception e) {
					e.printStackTrace();
					sc.nextLine();
				}
			}
		}

	}

}
