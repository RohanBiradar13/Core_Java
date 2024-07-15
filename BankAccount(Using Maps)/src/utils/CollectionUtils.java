package utils;

import static com.app.core.Account.CURRENT;
import static com.app.core.Account.FD;
import static com.app.core.Account.LOAN;
import static com.app.core.Account.SAVING;
import static java.time.LocalDate.parse;

import java.util.HashMap;

import com.app.core.BankAccount;



public class CollectionUtils {

	public static HashMap<Integer, BankAccount> populateData(){
	 HashMap<Integer, BankAccount> accnts = new HashMap<Integer, BankAccount>();
	 //int accountNo, String name, Account type, double balance, LocalDate date) {
	accnts.put(100,new BankAccount(100, "Rohan", SAVING, 90000,parse("2024-09-03")));
	accnts.put(10,new BankAccount(10, "Riya", CURRENT, 5000,parse("2024-05-11")));
	accnts.put(55,new BankAccount(55, "Shubham", FD, 3000,parse("2024-05-03")));
	accnts.put(15,new BankAccount(15, "Rama", LOAN, 2000,parse("2023-12-03")));
	accnts.put(10,new BankAccount(10, "Kirti", SAVING, 55000,parse("2024-09-03")));
	accnts.putIfAbsent(100,new BankAccount(10, "Rucha", SAVING, 60000,parse("2024-09-03")));
	
	
	return accnts;
}
	
}