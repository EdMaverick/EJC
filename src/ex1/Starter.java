package ex1;

public class Starter {

    public static void main(String[] args) {
        // б) + extra
        Phone phone1 = new Phone();
        Phone phone2 = new Phone(222, "Nokia");
        Phone phone3 = new Phone(333, "Sony Ericsson", 250.0);

        // в)
        System.out.println("Phone1: " + phone1.getNumber() + "\n" + phone1.getModel() + "\n"
                + phone1.getWeight() + "\n");
        System.out.println("Phone1: " + phone2.getNumber() + "\n" + phone2.getModel() + "\n"
                + phone2.getWeight() + "\n");
        System.out.println("Phone1: " + phone3.getNumber() + "\n" + phone3.getModel() + "\n"
                + phone3.getWeight() + "\n");

        // г)
        phone1.receiveCall("phone1");
        phone1.getNumber();
        phone2.receiveCall("phone2");
        phone2.getNumber();
        phone3.receiveCall("phone3");
        phone3.getNumber();

        // и
        phone1.receiveCall("phone1", 1);
        phone2.receiveCall("phone2", 2);
        phone3.receiveCall("phone3", 3);

        // extra
        phone1.sendMessage(12, 34, 56, 78, 900);
    }
}

