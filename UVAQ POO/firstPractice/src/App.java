public class App {
    public static void main(String[] args) throws Exception {

        // Create objects in Subjects

        Subjects ObjSubject1 = new Subjects(

                "POO4587",
                "Object Oriented Programming",
                "Alex Solorio",
                "Monday, Tuesday and Friday from 7:00 to 10:00",
                4);

        ObjSubject1.updateTeacher("Alex Carranza");
        ObjSubject1.updateSchedule("Monday, Tuesday and Friday from 9:00 to 10:00");

        Subjects ObjSubject2 = new Subjects(

                "CAL8542",
                "Calculus",
                "Karen Alicia",
                "Monday and Friday from 11:00 to 11:00",
                4);

        School ObjSchool1 = new School(

                "RVOE1234",
                "School of Systems",
                555123456,
                "Building A, Room 11A",
                "University");

        School ObjSchool2 = new School(

                "RVOE87445",
                "School of Mechatronics",
                557584536,
                "Building C, Room 4C",
                "University");

        ObjSubject1.updateTeacher("Alex Carranza");
        ObjSubject1.updateSchedule("Monday, Tuesday and Friday from 9:00 to 10:00");

        ObjSubject2.updateTeacher("Ricardo Román");
        ObjSubject2.updateSchedule("Tuesday and Thursday from 14:00 to 16:00");

        ObjSchool1.updateRvoe("RVOE12125");
        ObjSchool1.updatePhone(354151556);

        System.out.println("Subject 1:");
        System.out.println(ObjSubject1);

        System.out.println("\n\nSubject 2:");
        System.out.println(ObjSubject2);

        System.out.println("\n\nSchool 1:");
        System.out.println(ObjSchool1);

        System.out.println("\n\nSchool 2:");
        System.out.println(ObjSchool2);

    }

}
