
public class Magazine extends LibraryMaterial {

    private int editionNumber;
    private String publicationMonth;

    //constructor
    public Magazine(String title,String month, int editionNumber, int publicationYear ) {

        super(title, publicationYear);
        this.editionNumber = editionNumber;
        this.publicationMonth = month;
    }

    //getters
    public int getEditionNumber() {
        return editionNumber;
    }

    public String getPublicationMonth() {
        return publicationMonth;
    }

}
