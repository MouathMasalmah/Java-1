//Mouath_Sami_Masalmah,1220179,Section:6,Saadeddin_Hroub.

import java.util.*;

public class SpecialPrimes {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("1-Print primes between a and b"); // Print the options to the user and get the value of the
																// option from him.
		System.out.println("2-Print special primes between a and b");
		System.out.println("3-Print special primes (reverse numbers) between a and b using recursion");
		System.out.println("4-Exit");
		System.out.print("Enter your choice:");
		int the_num = input.nextInt();
		int i, num1, num2, display; // a=num1,b=num2, display= A variable for swapping the values of a and b,i=The
									// number that takes the value of a and is inserted into the loop and then
									// examined in the method.

		while (the_num != 4) { // A loop containing the condition not to enter the number 4
			switch (the_num) {
			case 1:
				System.out.print("Enter a:");
				num1 = input.nextInt();
				System.out.print("Enter b:");
				num2 = input.nextInt();
				if (num1 > num2) { // The process of switching values between a and b.
					display = num1;
					num1 = num2;
					num2 = display;
				}
				for (i = num1; i <= num2; i++) {

					if (isPrime(i) == true) { // The process of calling method( isPrime ) and checking it (if the result
												// is true, then the number is prime)
						if (i <= 1) // The process of avoiding printing the number zero and negative numbers because
									// they are not considered prime
							continue;
						System.out.println(i);
					}
				}
				break;

			case 2:
				System.out.print("Enter a:");
				num1 = input.nextInt();
				System.out.print("Enter b:");
				num2 = input.nextInt();
				if (num1 > num2) { // The process of switching values between a and b.
					display = num1;
					num1 = num2;
					num2 = display;
				}
				for (i = num1; i <= num2; i++) {
					if (isPrime(i) == true && containsTwo(i) == true) {// The process of calling method ( isPrime and
																		// containsTwo )and checking it (If the result
																		// is true, the number is prime and one of its
																		// digits is 2.)
						if (i <= 1) // The process of avoiding printing the number zero and negative numbers because
									// they are not considered prime
							continue;
						System.out.println(i);
					}
				}
				break;
			case 3:
				System.out.print("Enter a:");
				num1 = input.nextInt();
				System.out.print("Enter b:");
				num2 = input.nextInt();
				if (num1 > num2) { // The process of switching values between a and b.
					display = num1;
					num1 = num2;
					num2 = display;
				}
				for (i = num1; i <= num2; i++) {
					if (isPrime(i) == true && containsTwo(i) == true) {// The process of calling method ( isPrime and
																		// containsTwo )and checking it (If the result
																		// is true, the number is prime and one of its
																		// digits is 2.)
						if (i <= 1)
							continue;
						printReverse(i);// The process of calling method ( printReverse ),The prime numbers are printed
										// in reverse.
					}
				}
				break;

			default: // If the user chooses a number other than the numbers in the list, he will be
						// asked to re-enter again.
				System.out.println("\n\n......Erorr......try again......\n\n");
			}
			System.out.println("1-Print primes between a and b");
			System.out.println("2-Print special primes between a and b");
			System.out.println("3-Print special primes (reverse numbers) between a and b using recursion");
			System.out.println("4-Exit");
			System.out.print("Enter your choice:");
			the_num = input.nextInt();
		}
		if (the_num == 4) { // If he enters the number 4, the program will stop.
			System.out.println("Good Bye…");
		}
	}

	public static boolean isPrime(int i) {
		int count = 0;
		for (int j = 1; j <= i / 2; j++) {
			if (i % j == 0) { // If the condition is met (the remainder of the division is greater than 0), it
								// is added to the variable(count).
				count++;
			}
		}
		if (count > 1) {
			return false; // If value(count) is greater than 1, it returns false (number is not prime).
		}
		return true; // If value(count) is less than or equal 1, it returns true (number is prime).
	}

	public static boolean containsTwo(int i) {
		int count = 0;
		while (i > 1) {
			int b = i % 10; // We take the remainder of the number divided by 10 to get the digit
							// separately.
			if (b == 2) { // If the digit value is 2 add to (count).
				count++;
			}
			i = i / 10; // Divide the number by 10 to get rid of the checked digit.
		}
		if (count >= 1)
			return true; // If value(count) is greater than or equal 1, it returns true (The number
							// contains the digit 2).

		return false; // If value(count) is less than 1, it returns false (The number does not contain
						// digit 2).
	}

	public static void printReverse(int i) {
		if (i <= 0) { // When the value of the variable is less than or equal to zero, this means that
						// the number has been inverted, so it is separated by printing a space, and
						// then starting with a new line to print the next number
			System.out.println("");
		} else {
			int b = i % 10; // After the prime number is found, the remainder of the division is taken by
							// 10.
			System.out.print(b); // Print the remainder of the division.
			printReverse(i / 10);// The method calls itself and puts inside it the prime number divided by 10 to
									// get rid of the printed digit.
		}
	}
}