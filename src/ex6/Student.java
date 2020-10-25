package ex6;

public class Student {

    // a)
    private String firstName;
    private String lastName;
    private String group;
    protected double averageMark;

    public Student(final String firstName, final double averageMark) {
        this.firstName = firstName;
        this.averageMark = averageMark;
    }

    public String getFirstName() {
        return firstName;
    }

    // в)
    public void getScholarship() {
        if (this.averageMark >= 4.5) {
            System.out.println("таки 100 шекелей");
        } else {
            System.out.println("только 80 шекелей однако");
        }
    }
}

