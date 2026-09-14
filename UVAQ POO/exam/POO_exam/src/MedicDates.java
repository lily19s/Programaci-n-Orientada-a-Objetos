
public class MedicDates {

    private Pacient pacient;
    private DetailConsult detail;
    private Doctor medic;
    private Consultory consult;
    private String date;
    
    private static final int MAXIMUM_DATES= 10;
    private static int number = 5000;
    private final int dateNumber;

    //constructors
    public MedicDates(Pacient pacient, Doctor medic, Consultory consult, String date) {

        number ++;
        this.dateNumber = number;
        this.pacient = pacient;
        this.medic = medic;
        this.consult = consult;
        this.date = date;
    }

    //getters
    public Pacient getPacient() {
        return pacient;
    }

    public Doctor getMedic() {
        return medic;
    }

    public Consultory getConsult() {
        return consult;
    }

    public String getDate() {
        return date;
    }

    public int getDateNumber() {
        return dateNumber;
    }

    //Methods and funcions

    public void addDetail(DetailConsult detail){
        this.detail = detail;

    }
    public void showInformation(){
       
        System.out.println("APPOINTMENT #" + dateNumber);
        System.out.println("Pacient: " + pacient.getName());
        System.out.println("Email: " + pacient.getEmail());
        System.out.println("Doctor: " + medic.getName() + " - " + medic.getEspeciality());
        System.out.println("Consultory number: " + consult.getConsultoryNumber());
        System.out.println("Date: " + date);

       System.out.println("==========================================");
        

    }

    
}
