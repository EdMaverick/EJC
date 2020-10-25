package ex6;

public class Starter {
    public static void main(String[] args) {

        // б)
        Student aspirant = new Aspirant("Altair", 5.0, "Master's diploma");
        Student student = new Student("Muhammad", 4.3);

        // г)
        Student[] listOfStudents = new Student[]{aspirant, student};

        for(Student st : listOfStudents) {
            System.out.print(st.getFirstName() + ": ");
            st.getScholarship();
        }
    }
}
