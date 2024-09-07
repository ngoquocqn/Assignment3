package baitapbuoi9;

public class Student4 {

    int id;
    String name;

    Student4(int id, String name) {
        id = id;
        name = name;
    }

    void display() {
        System.out.println(id + " " + name);
    }

    public static void main(String[] args) {
        Student4 s1 = new Student4(1, "Nam");
        Student4 s2 = new Student4(2, "Lan");
        s1.display();
        s2.display();
    }
}
