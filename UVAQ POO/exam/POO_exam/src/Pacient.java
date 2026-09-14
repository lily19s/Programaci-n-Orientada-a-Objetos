
public class Pacient extends Person {

    private int dateOfBird;
    private String bloodType;

    public Pacient(String name, String email, String phone, int dateOfBird, String bloodType) {

        super(email, name, phone);

        if (dateOfBird > 2026) {
            System.out.println("The year cannot be longer than 2026");
            this.dateOfBird = 2026;
        } else {

            this.dateOfBird = dateOfBird;

        }

        this.bloodType = bloodType;
    }

    //getters
    public int getDateOfBird() {
        return dateOfBird;
    }

    public String getBloodType() {
        return bloodType;
    }

}
