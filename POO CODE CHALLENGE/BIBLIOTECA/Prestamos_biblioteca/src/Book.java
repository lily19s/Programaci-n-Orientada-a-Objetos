
public class Book extends LibraryMaterial {

    private String author;
    private int numberOfPages;

    public Book(String title, int publicationYear, String author, int numberOfPages) {

        super(title, publicationYear);
        this.author = author;

        if (numberOfPages <= 0) {

            System.out.println("The number of pages cannot be under to 0");
            this.numberOfPages = 50;

        } else {

            this.numberOfPages = numberOfPages;
        }

    }
    // getters

    public String getAuthor() {
        return author;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

}
