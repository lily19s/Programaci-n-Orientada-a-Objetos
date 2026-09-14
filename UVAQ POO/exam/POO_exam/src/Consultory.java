
public class Consultory {

    private int floor;
    private String especiality;
    private static int number = 0;
    private final int consultoryNumber;

    public Consultory(int floor, String especiality, int consultoryNumber) {

        if (consultoryNumber <= 0) {

            System.out.println("The number cannot be equal or less than 0");
            this.consultoryNumber = 1;

        } else {
            number++;
            this.consultoryNumber = number;
        }
        this.floor = floor;
        this.especiality = especiality;
    }

    //getters
    public int getFload() {
        return floor;
    }

    public String getEspeciality() {
        return especiality;
    }

    public int getConsultoryNumber() {
        return consultoryNumber;
    }

    
}
