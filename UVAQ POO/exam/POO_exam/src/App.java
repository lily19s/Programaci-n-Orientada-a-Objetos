public class App {
    public static void main(String[] args) throws Exception {


        Doctor objDoctor = new Doctor("Alex", "alex44325@gmail.com", "3542010554", "Pediatricion", "223321AASSH");
        Doctor objDoctor2 = new Doctor("Monica", "mon5445@gmail.com", "355645414", "Obstetricion", "87979545ABQ");

        Pacient objPacient = new Pacient("Carlos", "chp@6454@gmail.com", "664645332", 2007, "O+");
        Pacient objPacient2 = new Pacient("Lily", "lid@6454@gmail.com", "464636644", 2007, "O-");
        Consultory objConsultory = new Consultory(5, "infections");


        MedicDates date = new MedicDates(objPacient2, objDoctor2, objConsultory, "September 4");
        MedicDates date2 = new MedicDates(objPacient, objDoctor, objConsultory,  "April 3");
        MedicDates date3 = new MedicDates(objPacient2, objDoctor, objConsultory, "October 8");

        Clinic clinic = new Clinic("Especialities", null);

    }
}
