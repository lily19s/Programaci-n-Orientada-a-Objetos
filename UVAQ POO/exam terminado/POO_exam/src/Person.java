public class Person {

    private String name;
    private String email;
    private String phone;

    private static int Id = 1000;
    private static final int FINAL_ID = 1001;
    private final int idNumber;

    //constructor
    public Person(String email, String name, String phone) {
        
        Id ++;
        this.idNumber = Id;

        this.email = email;
        this.name = name;
        this.phone = phone;
    }

    //getters
    public String getName(){
        return name;
    }

    public String getEmail(){
        return email;
    }

    public String getPhone(){
        return phone;
    }

    public int getIdNumber(){
        return idNumber;
    }

    //methods and functions

    public static int getTotalPeople (){
        return Id - FINAL_ID;
    }

}
