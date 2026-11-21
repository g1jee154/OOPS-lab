package Labprograms;
class Student {
    int usn;
    String name;

    void accept(int usn, String name) {
        this.usn = usn;
        this.name = name;
    }

    void display() {
        System.out.println("USN: " + usn);
        System.out.println("Name: " + name);
    }
}

public class StudentDemo {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student();
        Student s3 = new Student();

        s1.accept(100, "Jeevan G A");
        s2.accept(101, "Jeevan M R");
        s3.accept(102, "Jeston");

        System.out.println("-- Student 1 Details --");
        s1.display();

        System.out.println("-- Student 2 Details --");
        s2.display();

        System.out.println("-- Student 3 Details --");
        s3.display();
    }
}
