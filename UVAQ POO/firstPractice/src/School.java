public class School {

    //Attributes
    String rvoe;
    String name;
    int phone;
    String address;
    String level;

    //Constructor
    public School(
        String newRvoe,
        String newName,
        int newPhone,
        String newAddress,
        String newLevel
    ){
        this.rvoe = newRvoe;
        this.name = newName;
        this.phone = newPhone;
        this.address = newAddress;
        this.level = newLevel;
    }

    //Functions and Methods

      public void updateRvoe(String incomeRvoe) {
        this.rvoe = incomeRvoe;
    }

     public void updatePhone(int incomePhone) {
        this.phone = incomePhone;
    }

    @Override
    public String toString() {
        
        String infoSchool =

        "rvoe   = " + this.rvoe     + "\n" + 
        "name   = " + this.name     + "\n" +
        "phone  = " + this.phone    + "\n" +
        "address = " + this.address + "\n" +
        "level  = " + this.level;

        return infoSchool;
    }
    


}
