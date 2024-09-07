package baitapbuoi9;

public class Calculation1 {
    void sum(int a, int b) {
        System.out.println(a + b);
    }

    void sum(int a, int b, int c) {
        System.out.println(a + b + c);
    }

    public static void main(String[] args) {
        Calculation1 ca = new Calculation1();
        ca.sum(10, 10, 10);
        ca.sum(20, 20);
    }
}
