
import java.util.*;

public class Clinic {

    private static final String CLINIC_NAME = "HealthCare Center";
    private ArrayList<Consultory> consultory;
    private ArrayList<Doctor> medic;

    //constructor
    public Clinic(ArrayList<Consultory> consultory, ArrayList<Doctor> medic) {
        this.consultory = consultory;
        this.medic = medic;
    }

    //getters
    public static String getClinicName() {
        return CLINIC_NAME;
    }

    public ArrayList<Consultory> getConsultory() {
        return consultory;
    }

    public ArrayList<Doctor> getMedic() {
        return medic;
    }

    public void addConsultory(Consultory consultory) {
        this.consultory.add(consultory);
    }

    public void addDoctor(Doctor doctor) {
        this.medic.add(doctor);
    }
    
    //methods and functions

    public void showInformation(){
        System.out.println("Clinic name: " + CLINIC_NAME);
        System.out.println("-------------------------------");
        
    }

}
