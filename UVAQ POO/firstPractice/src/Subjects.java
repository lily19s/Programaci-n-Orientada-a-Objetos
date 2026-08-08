public class Subjects {

    // Attributes
    String ID;
    String name;
    String teacher;
    String schedule;
    int numberStudents;

    // Constructor
    public Subjects(
            String newID,
            String newName,
            String newTeacher,
            String newSchedule,
            int newNumberStudents) {
                
        this.ID = newID;
        this.name = newName;
        this.teacher = newTeacher;
        this.schedule = newSchedule;
        this.numberStudents = newNumberStudents;

    }

    // Functions and Methods

    public void updateTeacher(String incomeTeacher) {
        this.teacher = incomeTeacher;
    }

    public void updateSchedule(String incomeSchedule) {
        this.schedule = incomeSchedule;

    }

    @Override
    public String toString() {

        String infoSubjects =

                "ID         = " + this.ID + "\n" +
                        "name       = " + this.name + "\n" +
                        "teacher    = " + this.teacher + "\n" +
                        "schedule   = " + this.schedule + "\n" +
                        "numberStudents = " + this.numberStudents;

        return infoSubjects;
    }

}
