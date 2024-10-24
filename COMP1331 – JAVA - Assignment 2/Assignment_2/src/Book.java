//Mouath Sami Masalmah,1220179,section: 11,section lab: 6,D. Saadeddin Hroub.
public class Book {
	private String Title, Author, Publisher, Language; // Defining parameters to take a value later (book attributes)
	private int Edition;// Defining parameters to take a value later (book attributes)

	public Book() {
	}// An empty constructor returns the initial value of the parameters

	public Book(String title, String author, int edition, String publisher, String language) { // A constructor
																									// changes the value
																									// of the parameter
																									// to a new value
		this.Title = title;
		this.Author = author;
		this.Publisher = publisher;
		this.Language = language;
		this.Edition = edition;
	}
//The [get ****] method is used to get the value of the parameter
//The [set ****] method is used to change the value of the parameter
	public String getTitle() {
		return Title;
	}

	public void setTitle(String title) {
		Title = title;
	}

	public String getAuthor() {
		return Author;
	}

	public void setAuthor(String author) {
		Author = author;
	}

	public String getPublisher() {
		return Publisher;
	}

	public void setPublisher(String publisher) {
		Publisher = publisher;
	}

	public String getLanguage() {
		return Language;
	}

	public void setLanguage(String language) {
		Language = language;
	}

	public double getEdition() {
		return Edition;
	}

	public void setEdition(int edition) {
		Edition = edition;
	}

	public String toString() { //Method to return all book data (parameter values)
		return "Book [Title=" + Title + ", Author=" + Author + ", Publisher=" + Publisher + ", Language=" + Language
				+ ", Edition=" + Edition + "]";
	}

}