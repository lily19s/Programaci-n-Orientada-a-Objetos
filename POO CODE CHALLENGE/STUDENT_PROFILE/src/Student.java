
public class Student {

    private String name;
    private int age;
    private double average;

    //constructor
    public Student(String name, int age, double average) {
        this.name = name;
        this.age = age;

        if (average >= 0 && average <= 10) {
            this.average = average;
        } else {
            System.out.println("The average is invalid");
            this.average = 0;
        }

    }

    // getters
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getAverage() {
        return average;
    }

    // methods and functions

    public void getShowInformation(){
        System.out.println("Name: " + getName());
        System.out.println("Age: " + getAge());
        System.out.println("Average: " + getAverage());
    }

}
