package baitapbuoi9;

public class Calculation2 {

    void sum(int a, int b) {
        System.out.println(a + b);
    }

    void sum(double a, double b) {
        System.out.println(a + b);
    }

    public static void main(String[] args) {
        Calculation2 ca = new Calculation2();
        ca.sum(10.5, 10.5);
        ca.sum(20, 20);
    }
}
