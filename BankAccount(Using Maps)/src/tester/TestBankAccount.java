package tester;

import static com.app.core.Account.valueOf;
import static java.time.LocalDate.parse;
import static utils.AccountValidation.validationAmount;
import static utils.CollectionUtils.populateData;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Scanner;
import java.util.TreeMap;

import com.app.core.Account;
import com.app.core.BankAccount;

import customException.AccountHandlyingException;

public class TestBankAccount {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			HashMap<Integer, BankAccount> accountsMap = populateData();
			boolean exit = false;
			while (!exit) {
				System.out.println("1.Create A/C 2.Display all A/C details 3.Get A/C details by A/C number "
						+ "4.Fund Tranfer 5.Close A/C 6. Display bank accounts for a specific type "
						+ "7.Sort bank accounts as per " + "ascending A/C number 8.Sort bank accounts"
						+ " as per descending A/C numbere " + "100.Exit");
				try {
					switch (sc.nextInt()) {
					case 1:
						System.out.println("Enter the A/C details: accountNo, name, type, balance, date");
						int accountNo = sc.nextInt();
						if (accountsMap.containsKey(accountNo))
							throw new AccountHandlyingException("Duplicate A/C number");
						accountsMap.put(accountNo, new BankAccount(accountNo, sc.next(),
								valueOf(sc.next().toUpperCase()), validationAmount(sc.nextDouble()), parse(sc.next())));
						break;

					case 2:
						for (BankAccount a : accountsMap.values()) {
							System.out.println(a);
						}
						break;
					case 3:
						System.out.println("Enter the A/C number which you want to fetch details");
						accountNo = sc.nextInt();
						if (accountsMap.get(accountNo) == null) {
							throw new AccountHandlyingException("Invalid A/C Number");
						}
						System.out.println(accountsMap.get(accountNo));

						break;
					case 4:
						System.out.println("Enter the source A/C number and destination A/C number & amount ");
						int srcNo = sc.nextInt();
						int destNo = sc.nextInt();
						double amount = sc.nextDouble();
						if (accountsMap.get(srcNo) == null) {
							throw new AccountHandlyingException("Invalid Source A/C number");
						}
						if (accountsMap.get(destNo) == null) {
							throw new AccountHandlyingException("Invalid Destination A/C number");
						}

						accountsMap.get(srcNo).transferFunds(accountsMap.get(destNo), amount);
						System.out.println("Funds transfered..");

						break;
					case 5:
						System.out.println("Enter the A/C  which you want to remove");
						accountNo = sc.nextInt();
						BankAccount a = accountsMap.remove(accountNo);
						if (a == null) {
							throw new AccountHandlyingException("Can't close A/C Invalid A/C number");
						}
						System.out.println("Closed A/C  " + a);

						break;
					case 6:
						System.out.println("Enter the A/C type ");
						Account acType = valueOf(sc.next().toUpperCase());
						System.out.println("Printing balance of all " + acType + " types of A/C");
						for (BankAccount b : accountsMap.values()) {
							if (b.getType().equals(acType)) {
								System.out.println(b);
							}

						}
						break;

					case 7:
						// sorted map : TreeMap(Map<? extends K, ? extends V> map) => this constructor
						// we are using
						// HashMap doesn't support any sorting method so we are using TreeMap which
						// supports Sort method
						TreeMap<Integer, BankAccount> accnts = new TreeMap<>(accountsMap);
						// this below code is => for loop only
						Collection<BankAccount> allaccnts = accnts.values();
						BankAccount[] accArray = allaccnts.toArray(new BankAccount[0]);
						System.out.println("Sorted as per A/C number");
						for (int i = 0; i < allaccnts.size(); i++) {
							System.out.println(accArray[i]);
						}
						// there is shortcut for above code i.e for each loop
						/*
						 * for (BankAccount a : allaccnts.values()) { System.out.println(a); }
						 * 
						 */

						break;
					case 8:
						/*
						 * sort acctns as per descending order of accnts no n display thenm Since
						 * sorting criteria is Key based : can be done using TreeMap Descending : custom
						 * ordering : Comparator TreeMap(Comparator< ? super K> comp)
						 */

						TreeMap<Integer, BankAccount> acntsByDescAcctNo = new TreeMap<Integer, BankAccount>(
								new Comparator<Integer>() {
									@Override
									public int compare(Integer accntNo1, Integer accntNo2) {
										return accntNo2.compareTo(accntNo1);
									}
								});
						System.out.println(acntsByDescAcctNo);// {} : empty TreeMap
						acntsByDescAcctNo.putAll(accountsMap);// invokes internally : anonymous inner class compare
																// method
						System.out.println("A/Cs sorted as per descending order");
						for (BankAccount a1 : acntsByDescAcctNo.values()) {
							System.out.println(a1);
						}

						break;
					case 9:
						/*
						 * sort accnts as per balance amount Can you solve using a TreeMap : No(Since
						 * it's balance : value based criteria) Map ---> Collection<V>
						 */
						Collection<BankAccount> list = accountsMap.values();
						ArrayList<BankAccount> list2 = new ArrayList<BankAccount>(list);
						Collections.sort(list2, new Comparator<BankAccount>() {
							@Override
							public int compare(BankAccount b1, BankAccount b2) {
								return ((Double) b1.getBalance()).compareTo(b2.getBalance());
							}
						});
						System.out.println(" A/C details sorted as per balance");
						for (BankAccount b : list2) {
							System.out.println(b);
						}

						break;
					case 10:

						Collection<BankAccount> list3 = accountsMap.values();
						ArrayList<BankAccount> list4 = new ArrayList<BankAccount>(list3);

						Collections.sort(list4, new Comparator<BankAccount>() {
							@Override
							public int compare(BankAccount b1, BankAccount b2) {
								return b1.getDate().compareTo(b2.getDate());
							}
						});
						System.out.println(" A/C details sorted as per creation date");
						for (BankAccount b : list4) {
							System.out.println(b);
						}

						break;

					case 100:
						exit = true;
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
