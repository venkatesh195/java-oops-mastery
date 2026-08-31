class Student {

    String name;

    void study() {
        System.out.println(name + " is studying");
    }

    void attendClass() {
        System.out.println(name + " is attending class");
    }

    void writeExam() {
        System.out.println(name + " is writing the exam");
    }
}

public class Main {

    public static void main(String[] args) {

        Student s1 = new Student();

        s1.name = "Venkatesh";

        s1.study();
        s1.attendClass();
        s1.writeExam();
    }
}
