class Student {

    String name;
    int age;
}
public class Main {

    public static void main(String[] args) {

        Student s1 = new Student();

        s1.name = "Venkatesh";
        s1.age = 23;

        Student s2 = new Student();

        s2.name = "Venky";
        s2.age = 21;

        System.out.println("Student 1: " + s1.name);
        System.out.println("Student 2: " + s2.name);
    }
}
