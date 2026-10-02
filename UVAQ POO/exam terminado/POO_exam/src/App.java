
import java.util.*;

public class App {

    public static void main(String[] args) throws Exception {

        Doctor objDoctor = new Doctor("Alex", "alex44325@gmail.com", "3542010554", "Pediatricion", "223321AASSH");
        Doctor objDoctor2 = new Doctor("Monica", "mon5445@gmail.com", "355645414", "Obstetricion", "87979545ABQ");

        Pacient objPacient = new Pacient("Carlos", "chp@6454@gmail.com", "664645332", 2007, "O+");
        Pacient objPacient2 = new Pacient("Lily", "lid@6454@gmail.com", "464636644", 2007, "O-");

        Consultory objConsultory = new Consultory(101, "Infections", 5);
        Consultory objConsultory2 = new Consultory(102, "Obstetrics", 3);
        Consultory objConsultory3 = new Consultory(205, "Internal Medicine", 8);

        Clinic clinic = new Clinic(new ArrayList<Consultory>(), new ArrayList<Doctor>());
        clinic.addDoctor(objDoctor);
        clinic.addDoctor(objDoctor2);
        clinic.addConsultory(objConsultory);
        clinic.addConsultory(objConsultory2);

        MedicDates date = new MedicDates(objPacient2, objDoctor2, objConsultory2, "September 11");
        date.addDetail(new DetailConsult("Fever", "Flu", 500));

        MedicDates date2 = new MedicDates(objPacient, objDoctor2, objConsultory3, "April 3");
        date2.addDetail(new DetailConsult("Checkup", "Healthy", 300));

        MedicDates date3 = new MedicDates(objPacient, objDoctor, objConsultory, "September 13");
        date3.addDetail(new DetailConsult("Stomachache", "Back pain", 400));

        clinic.showInformation();

        date.showInformation();
        date2.showInformation();
        date3.showInformation();

        System.out.println("Total registered people: " + Person.getTotalPeople());

    }
}
