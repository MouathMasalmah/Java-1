package project1;

import java.util.*;

public class Driver {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		Bank bank = new Bank();

		System.out
				.println("1- Add Account \n" + "2- View All Accounts \n" + "3- Add Amount \n" + "4- Withdraw Amount \n"
						+ "5- View Account Details \n" + "6- Modify Account \n" + "7- Close an Account \n" + "8- Exit");
		System.out.println("Choose one of the following options:");
		int options = scan.nextInt();
		bank.addAccount(11, "mouath",5977, 40000, 's');
		while (options != 8) {
			switch (options) {
			case 1:
				System.out.println("Enter your name:");
				String name = scan.next();
				System.out.println("Enter your id:");

				int id = scan.nextInt();

				System.out.println("Enter your phone number:");
				long phone = scan.nextLong();
				System.out.println("Select your account type (if saving -> Enter s,others Enter -> o):");
				char choice = scan.next().charAt(0);

				System.out.println("Enter the amount you wish to deposit:");
				Double balance = scan.nextDouble();
				bank.addAccount(id, name, phone, balance, choice);
				break;
			case 2:
				System.out.println("enter the name ");
				name = scan.next();

				System.out.println("enter the id account");
				id = scan.nextInt();
				bank.displayAccounts(name,id);
				break;
			case 3:
				System.out.println("enter the name ");
				name = scan.next();

				System.out.println("enter the id account");
				id = scan.nextInt();

				System.out.println(" Enter the amount of money you want to deposit into the account ");
				double add = scan.nextDouble();
				bank.addAmount(id, name, add);

				break;
			case 4:
				System.out.println("enter the id account");
				int id2 = scan.nextInt();
				System.out.println("enter the name ");
				String name2 = scan.next();
				System.out.println(" Enter the amount of money you want to deposit into the account ");
				Double balance2 = scan.nextDouble();
				bank.withdrawAmount(id2, name2, balance2);
				break;
			case 5:
				break;
			case 6:
				break;
			case 7:
				break;
			default: {
				System.out.println("\nErorr!!\nEnter a valid number\n");
			}
			}

			displayMainMenu(options);
			options = scan.nextInt();

			if (options == 8) {

				System.out.println("<Thank you for visiting our site>");
			}
		}
	}

	public static void displayMainMenu(int options) {
		while (options != 8) {
			System.out.println("1- Add Account \n" + "2- View All Accounts \n" + "3- Add Amount \n"
					+ "4- Withdraw Amount \n" + "5- View Account Details \n" + "6- Modify Account \n"
					+ "7- Close an Account \n" + "8- Exit");
			System.out.println("Choose one of the following options:");
			break;
		}
	}

}
