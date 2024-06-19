package p7;

public interface Bank {
	boolean createAccount(int accountNo, String name, double initialBalance);
	void withDraw(int accountNo,double amount);

}
