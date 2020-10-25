package ex5;

public class Recursion {

    public void showNumbersBetweenAAndB(int a, int b) {
        if (a < b) {
            System.out.print(a + " ");
            a++;
            showNumbersBetweenAAndB(a, b);
        } else if (a > b) {
            System.out.print(a + " ");
            a--;
            showNumbersBetweenAAndB(a, b);
        } else if (a == b) {
            System.out.println(a);
        }
    }

    public void countNumbersBetweenAAndB(int a, int b) {
        if (a < b) {
            for (int i = a; i <= b; i++) {
                System.out.print(i + " ");
            }
        } else {
            countNumbersBetweenAAndB(b, a);
        }
    }
}
