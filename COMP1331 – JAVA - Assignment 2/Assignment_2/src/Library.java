//Mouath Sami Masalmah,1220179,section: 11,section lab: 6,D. Saadeddin Hroub.
public class Library {
	boolean[] borrowAndReturn = new boolean[30];// Array by which books are classified (available or borrowed)
	Book[] book = new Book[30];// Array of Object All books are stored in it (30 books maximum)
	int Index = 0;// Define a parameter with a value of zero and it is used inside the Array
					// responsible for saving the books inside the [newBook] method (it is created
					// outside the
					// method so as not to return the value of the parameter to zero)

	public Library() {
	}

	public void newBook(String title, String author, int edition, String publisher, String language) {

		if (Index < book.length) { // The parameter (Index) is increased until it reaches the length of the array
			book[Index] = new Book(title, author, edition, publisher, language);
			Index++;
		} else
			System.out.println(" The library has reached the maximum number of books ");// When trying to store a new
																						// book after the library is
																						// full, a notification sentence
																						// is printed to the user
																						// telling him that it is not
																						// possible to save a new book
	}

	public void borrowBook(String title) {
		int i = 0;
		while (book[i] != null) {// LOOP (if the value of the array related to the book is empty, the process is
									// stopped)

			// book[i].getTitle()==title : A sentence that compares the entered
			// title to the book titles available,
			// borrowAndReturn[i] = (if true--> The book is borrowed, if false --> The book
			// is available)
			if (book[i].getTitle()==title && borrowAndReturn[i] == false) {

				System.out.println("\nThe book: " + book[i].getTitle() + "\n<Borrowed successfully>");
				// If the condition are met, print the name of the book an the sentence
				// <Borrowed successfully>
				borrowAndReturn[i] = true;// Change the value of array (true -> borrowed)
			} else if (book[i].getTitle()==title && borrowAndReturn[i] == true) {
				System.out.println("\nThe book : " + book[i].getTitle() + " is already borrowed ");

			}

			i++;
		}

	}

	public void returnBook(String title) {
		int I = 0;
		while (book[I] != null) {// LOOP (if the value of the array related to the book is empty, the process is
									// stopped)

			// book[i].getTitle()==title: A sentence that compares the entered
			// title to the book titles available,
			// borrowAndReturn[i] = (if true--> The book is borrowed (you can return), if
			// false --> The book is available(you can't make return))

			if (book[I].getTitle() == title && borrowAndReturn[I] == true) {
				System.out.println("\nThe book: " + book[I].getTitle() + "\n<Replay completed successfully>\n");
				borrowAndReturn[I] = false;
			} else if (book[I].getTitle() == title && borrowAndReturn[I] == false) {
				System.out.println("\nThe book : " + book[I].getTitle() + " is already exists");
			}
			I++;
		}
	}

	public void printAvailableBooks() {
		int j = 0;
		while (book[j] != null) {// LOOP (if the value of the ARRI related to the book is empty, the process is
									// stopped)
			if (borrowAndReturn[j] == false) // If the array is false, it means that the book is available so we will
												// print it
				System.out.println(book[j].toString());

			j++;
		}
	}
}