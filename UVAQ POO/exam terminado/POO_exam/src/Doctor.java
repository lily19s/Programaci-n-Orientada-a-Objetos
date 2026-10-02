
public class Doctor extends Person {

    private String especiality;
    private final String profesionalId;

    //constructor
    public Doctor(String name,String email,  String phone,  String especiality, String profesionalId) {
        super(email, name, phone);
        this.especiality = especiality;
        this.profesionalId = profesionalId;
    }

    //getters
    public String getEspeciality() {
        return especiality;
    }

    public String getProfesionalId() {
        return profesionalId;
    }

}
