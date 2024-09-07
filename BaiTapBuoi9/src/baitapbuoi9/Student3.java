package baitapbuoi9;

public class Student3 {

    int ID;
    String name;
    int age;

    Student3(int i, String n) {
        ID = i;
        name = n;
    }

    Student3(int i, String n, int a) {
        ID = i;
        name = n;
        age = a;
    }

    void displayInformation() {
        System.out.println(ID +" "+name+" "+age);
    }

    public static void main(String[] args) {
        Student3 s1 = new Student3(1, "Nam");
        Student3 s2 = new Student3(2, "Lan", 25);
        s1.displayInformation();
        s2.displayInformation();
    }
}
