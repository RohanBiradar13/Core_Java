package utils;
import customException.AccountHandlyingException;
public class AccountValidation {

	public static final double MIN_BALANCE;
	static {
		MIN_BALANCE=1000;
	}
	
	public static double validationAmount(double amount) throws AccountHandlyingException {
		if(amount < MIN_BALANCE) {
			throw new AccountHandlyingException("Insufficient Balance!!!");
		}
		return amount;
	}
}
