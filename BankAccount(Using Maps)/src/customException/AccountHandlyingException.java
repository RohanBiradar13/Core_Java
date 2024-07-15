package customException;

@SuppressWarnings("serial")
public class AccountHandlyingException extends Exception{
public AccountHandlyingException(String mesg) {
	super(mesg);
}
}
