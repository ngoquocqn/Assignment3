package baitapbuoi9;

public class Calculation4 {

    void sum(int a, long b) {
        System.out.println(a + b);
    }

    void sum(int a, int b, int c) {
        System.out.println(a + b + c);
    }

    public static void main(String[] args) {
        Calculation4 ca = new Calculation4();
        ca.sum(20, 20);
        ca.sum(20, 20, 20);
    }
}
