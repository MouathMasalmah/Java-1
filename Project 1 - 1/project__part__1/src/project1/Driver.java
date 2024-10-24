
//stubent 1:Mouath Sami Abdallah Masalmah ,1220179
//stubent 2:abdalrahman moayed hussein ,1220699
package project1;

import java.util.*;

public class Driver {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Account account = new Account();
		Bank bank = new Bank(); /* make object from class Bank */
		if (Bank.uploadDataFile() == true) {
			System.out.println("Accounts upload successfully");
		} else {
			System.out.println("uploading files failed");
			System.exit(0);

		}

		System.out
				.println("1- Add Account \n" + "2- View All Accounts \n" + "3- Add Amount \n" + "4- Withdraw Amount \n"
						+ "5- View Account Details \n" + "6- Modify Account \n" + "7- Close an Account \n" + "8- Exit");
		// print the options
		int options = 0;

		boolean validInput = false;
		do {

			try {

				if (options == 0) {
					System.out.println("Choose one of the following options:");
					options = scan.nextInt();
				} else {
					validInput = true;
				}
			} catch (InputMismatchException ex) {
				System.out.println("Error: Invalid input. Please enter a valid integer:");
				scan.next();
			}
		} while (!validInput);

		while (options != 8) {
			/*
			 * Use Wile loop to repeat the operations until entering the number 8 to get out
			 * of the loop
			 */
			switch (options) {
			case 1:
				String name = " ";

				int hasSpace = 0;
				name = scan.nextLine();
				do {
					System.out.println("Enter a name without spaces or number:");
					name = scan.nextLine();
					hasSpace = 0;

					for (int i = 0; i < name.length(); i++) {
						if (name.charAt(i) == ' ' || Character.isDigit(name.charAt(i))) {

							hasSpace++;
							break;
						} else if (name.charAt(i) == '_') {
							continue;
						}
					}

					if (hasSpace == 1) {
						System.out.println("Error: Please enter a name without spaces or number:");
					} else {
						break;
					}

				} while (hasSpace != 0);

				System.out.println("Enter your ID:");
				int id = 0;
				boolean validInput1 = false;

				do {
					try {
						id = scan.nextInt();
						if (id > 9999 || id <= 999) {
							System.out.println("Error: Please enter a 4-digit number.");
						} else {
							validInput1 = true;
						}
					} catch (InputMismatchException ex) {
						System.out.println("Error: Please enter a valid number.");
						scan.next();
					}
				} while (!validInput1);
				int AccountCounter2 = bank.AccountCounter - 1;
				for (int i = 0; i < Bank.account.length; i++) {
					if (id == Bank.account[i].getID() && Bank.account[i] != null) {

						System.out.println("The number you entered already exists, enter another number:");
						id = 0;
						validInput1 = false;

						do {
							try {

								id = scan.nextInt();
								if (id == Bank.account[i].getID()) {
									System.out.println("The number you entered already exists, enter another number:");
								} else if (id > 9999 || id <= 999) {
									System.out.println("Error: Please enter a 4-digit number.");
								} else {
									validInput1 = true;
									break;
								}
							} catch (InputMismatchException ex) {
								System.out.println("Error: Please enter a valid number.");
								scan.next();
							}
						} while (!validInput1);
					} else if (i == AccountCounter2) {
						break;
					}
				}

				int phone = 0;
				validInput1 = false;

				do {
					try {

						if (phone <= 0) {
							System.out.println("Enter your phone number:");
							phone = scan.nextInt();
						} else {
							validInput1 = true;
						}

					} catch (InputMismatchException ex) {
						System.out.println("try again");
						scan.next();
					}
				} while (!validInput1);

				char AccountType = 0;
				char save = 's';
				char other = 'o';
				validInput1 = false;

				scan.nextLine();

				do {
					try {
						System.out.println("Enter the account type [ s ---> Save and o ---> Others] :");

						AccountType = scan.nextLine().charAt(0);
						if (AccountType != save && AccountType != other) {
							System.out.println("The character you entered is wrong, please enter a valid character:");
						} else if (AccountType == save || AccountType == other) {
							validInput1 = true;
						}
					} catch (InputMismatchException ex) {
						System.out.println("Error, please enter a valid character:");
						scan.nextLine();
					}
				} while (!validInput1);

				double balance = 0;
				validInput1 = false;

				do {
					try {
						System.out.println("Enter the value of the balance that you want to save:");
						if (balance <= 0) {
							balance = scan.nextDouble();
						} else {
							validInput1 = true;
						}
					} catch (InputMismatchException ex) {
						System.out.println("Error, please enter a valid number:");
						scan.next();
					}
				} while (!validInput1);
				account = new Account(id, name, phone, balance, AccountType);
				if (bank.addAccount(account) == true) {
					System.out.println("The account has been added successfully");
				} else {
					System.out.println("Sorry, you cannot enter an account due to lack of space in the bank :( ");
				}

				break;
			case 2:
				bank.displayAccounts();
				break;
			case 3:

				balance = 0;
				validInput1 = false;

				do {
					try {
						System.out.println("Enter the amount you wish to deposit:");
						if (balance <= 0) {
							balance = scan.nextDouble();
						} else {
							validInput1 = true;
						}
					} catch (InputMismatchException ex) {
						System.out.println("Error, please enter a valid number:");
						scan.next();
					}
				} while (!validInput1);
				bank.addAmount(balance); /* add the money for the total balance */

				break;
			case 4:
				balance = 0;
				validInput1 = false;

				do {
					try {
						if (balance <= 0) {
							System.out.println("Enter the amount you wish to deposit:");
							balance = scan.nextDouble();
						} else {
							validInput1 = true;
						}
					} catch (InputMismatchException ex) {
						System.out.println("Error, please enter a valid number:");
						scan.next();
					}
				} while (!validInput1);

				if (bank.withdrawAmount(balance) == true) {
					System.out.println("operation accomplished successfully");
				} else {
					System.out.println("The operation failed");
				}
				break;
			case 5:
				options = 0;
				System.out.println("\n" + "1:ID \n" + "2:Account holder name or part of the name ");// print the options
				validInput1 = false;

				do {
					try {
						if (options == 1 || options == 2) {
							account = bank.viewAccountDetails(options);
							if (account == null) {
								System.out.println("Sorry, your account does not exist :(");
								validInput1 = true;
							} else {
								validInput1 = true;
							}

						} else {
							System.out.println("Enter a valid number from the options:\n");
							options = scan.nextInt();
						}

					} catch (InputMismatchException ex) {
						System.out.println("Error, please enter a valid number:");
						scan.next();
					}
				} while (!validInput1);

				break;
			case 6:
				options = 0;
				System.out.println("Choose one of the following options:\n" + "1:ID \n"
						+ "2:Account holder name or part of the name ");// print the options
				validInput1 = false;

				do {
					try {
						options = scan.nextInt();
						if (options == 1 || options == 2) {

							bank.modifyAccountDetails(options);
							validInput1 = true;
						} else {
							System.out.println("Erorr!!\nEnter a valid number\n");
							options = scan.nextInt();
						}

					} catch (InputMismatchException ex) {
						System.out.println("Error, please enter a valid number:");
						scan.next();
					}
				} while (!validInput1);

				break;
			case 7:

				id = 0;
				validInput1 = false;
				boolean willClose = false;
				do {
					try {
						if (id <= 0) {
							System.out.println("Enter your ID:");
							id = scan.nextInt();
						} else {
							validInput1 = true;
						}
					} catch (InputMismatchException ex) {
						System.out.println("Error, please enter a valid number:");
						scan.next();
					}
				} while (!validInput1);
				int i = 0;
				while (Bank.account[i] != null) {
					if (id == Bank.account[i].getID()) {
						account = new Account();
						account = bank.account[i];
						willClose = bank.closeAccount(account);
						break;
					} else {
						i++;
					}
				}
				if (willClose == true) {
					System.out.println("The account has been closed successfully");
				} else {
					System.out.println("Sorry, your account does not exist :( ");
				}
				break;
			default: {
				/*
				 * When the user enters values ​​different from eight cases, an error is printed
				 */
				System.out.println("Erorr!!\nEnter a valid number\n");
			}
			}
			displayMainMenu(options);
			/* Continue to print for operations if the number 8 is not included */
			validInput = false;
			options = 0;
			do {

				try {
					if (options <= 0) {
						System.out.println("Choose one of the following options:");
						options = scan.nextInt();
					} else {

						validInput = true; // Set the flag to true if the input is a valid integer
					}
				} catch (InputMismatchException ex) {
					System.out.println("Error: Invalid input. Please enter a valid integer:");
					scan.next(); // Clear invalid input from the scanner
				}
			} while (!validInput);
		}
		if (options == 8)

		{
			/* If the value of 8 is entered, the program will be terminated */
			if (bank.updateDataFile() == true) {
				System.out.println("Accounts saved successfully");
			} else {
				System.out.println("Saving files failed");

			}
			System.out.println("<Thank you for visiting our site>");
			System.exit(0);
		}
	}

	public static void displayMainMenu(int options) {

		while (options != 8) {
			System.out.println("1- Add Account \n" + "2- View All Accounts \n" + "3- Add Amount \n"
					+ "4- Withdraw Amount \n" + "5- View Account Details \n" + "6- Modify Account \n"
					+ "7- Close an Account \n" + "8- Exit");
			break;
		}
	}

}
