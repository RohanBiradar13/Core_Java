package customException;

@SuppressWarnings("serial")
public class CustomerHandlingException extends Exception {
public CustomerHandlingException(String mesg) {
	super(mesg);
}
}
