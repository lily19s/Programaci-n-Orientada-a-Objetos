
public class User {

    private String name;
    private final String email;
    private static int countNumber = 5000;
    private final int userNumber;
    
    public User(String name, String email) {
         
        countNumber++;
        this.userNumber = countNumber;

        this.name = name;
        this.email = email;
      
    }

    // getters

    public String getName(){
        return name;
    }

    public String getEmail(){
        return email;
    }
    
    public int getUserNumber(){
        return userNumber;
    }

}
