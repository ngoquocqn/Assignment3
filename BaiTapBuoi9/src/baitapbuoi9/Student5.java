package baitapbuoi9;

class Student5 {

    int id;
    String name;

    Student5() {
        System.out.println("Default constructor is invoked");
    }

    Student5(int id, String name) {
        this();
        this.id = id;
        this.name = name;
    }

    void displayInformation() {
        System.out.println(id + " " + name);
    }

    public static void main(String[] args) {
        Student5 s1 = new Student5(1, "Nam");
        Student5 s2 = new Student5(2, "Lan");
        s1.displayInformation();
        s2.displayInformation();
    }
}
