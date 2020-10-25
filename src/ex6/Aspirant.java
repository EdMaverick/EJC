package ex6;

public class Aspirant extends Student {

    private String scientificWork;

    public Aspirant(String firstName, double averageMark, String scientificWork) {
        super(firstName, averageMark);
        this.scientificWork = scientificWork;
    }

    @Override
    public void getScholarship() {
        if (this.averageMark >= 4.5) {
            System.out.println("таки 200 шекелей");
        } else {
            System.out.println("только 180 шекелей однако");
        }
    }
}
