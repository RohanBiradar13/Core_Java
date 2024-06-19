package p7;

import java.util.Scanner;

public class TestBank {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean exit = false;
		Bank ref = null;
		while (!exit) {
			System.out.println("1.create account of BOB 2.create account of HDFC 3.withdraw 4.paybills 5.exit");
			switch (sc.nextInt()) {
			case 1:
				if (ref == null) {
					ref = new BankOfBaroda();
					System.out.println("Enter acoount no, name, initial balance");
					ref.createAccount(sc.nextInt(), sc.next(), sc.nextDouble());
				} else {
					System.out.println("You have chosen a bank");
				}
				break;

			case 2:
				if (ref == null) {
					ref = new HDFC();
					System.out.println("Enter acoount no, name, initial balance");
					ref.createAccount(sc.nextInt(), sc.next(), sc.nextDouble());
				} else {
					System.out.println("You have chosen a bank");
				}

				break;

			case 3:
				if (ref != null) {
					
					ref.withDraw(sc.nextInt(), sc.nextDouble());
				} else {
					System.out.println("You have not chosen a bank");
				}

				break;
			case 4:
				if(ref!=null) {
					if(ref instanceof HDFC) {
						((HDFC)ref).payBills();
					}else {
						System.out.println("You have not chosen a HDFC bank for paying bills");
					}
				}

				break;
			case 5:
				exit = true;

				break;
			}
		}
		sc.close();
	}
}
