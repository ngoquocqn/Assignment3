package baitapbuoi9;

public class Calculation5 {
    void sum(int a, int b) {
        System.out.println("int arg method invoked");
    }

    void sum(long a, long b) {
        System.out.println("long arg method invoked");
    }

    public static void main(String[] args) {
        Calculation5 ca = new Calculation5();
        ca.sum(20, 20);
    }
}

