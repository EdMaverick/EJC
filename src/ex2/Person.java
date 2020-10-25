package ex2;

public class Person {

    // a)
    private String fullName;
    private int age;

    // в)
    public Person() {}

    public Person(final String fullName, final int age) {
        this.fullName = fullName;
        this.age = age;
    }

    public String getFullName() {
        return fullName;
    }

    public int getAge() {
        return age;
    }

    // б)
    public void talk() {
        System.out.println("Такой-то " + this.fullName + " говорит.");
    }
}
