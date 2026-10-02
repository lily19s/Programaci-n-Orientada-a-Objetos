
public class LibraryMaterial {

    private String title;
    private int publicationYear;

    private static int codeNumber = 1000;
    private static final int FINAL_CODE = 1000;
    private final int code;

    //constructor
    public LibraryMaterial(String title, int publicationYear) {

        codeNumber++;
        this.code = codeNumber;

        this.title = title;

        if (publicationYear > 2026) {

            System.out.println("The year cannot be older than 2026");
            this.publicationYear = 2026;

        } else {
            this.publicationYear = publicationYear;
        }

    }

    //getters
    public String getTitle() {
        return title;
    }

    public int getPublicationYear() {
        return publicationYear;
    }


    public int getCode() {
        return code;
    }

    //metods and functions
    public static int getTotalMaterial() {

        return codeNumber - FINAL_CODE;
    }

}
