package p7;

public class HDFC implements Bank {
	public static final double MIN_BALANCE;
	static {
		MIN_BALANCE=5000;
	}
	@Override
	public boolean createAccount(int accountNo, String name, double initialBalance) {
		if(initialBalance >MIN_BALANCE) {
			System.out.println("Account created successfully in HDFC Bank");
			return true;
		}
		System.out.println("Insufficient balance");
		return false;
	}

	@Override
	public void withDraw(int accountNo, double amount) {
		System.out.println("withdrawing from HDFC Account");

	}
	public void payBills() {
		System.out.println("Paying bills to HDFC Bank..");
	}
			
}
