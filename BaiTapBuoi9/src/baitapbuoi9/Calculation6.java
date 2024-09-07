package baitapbuoi9;

public class Calculation6 {

    void sum(long a, long b) {
        System.out.println("a method invoked");
    }

    void sum(long a, int b) {
        System.out.println("b method invoked");
    }

    public static void main(String[] args) {
        Calculation6 ca = new Calculation6();
        ca.sum(20, 20);
    }
}
