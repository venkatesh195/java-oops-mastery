class Student {

    String name;
    int age;
    String course;
    float marks;

    Student(String name, int age, String course, float marks) {

        this.name = name;
        this.age = age;
        this.course = course;
        this.marks = marks;
    }

    void displayDetails() {

        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Course: " + course);
        System.out.println("Marks: " + marks);
    }
}

public class Main {

    public static void main(String[] args) {

        Student s1 =
                new Student("Venkatesh", 23, "B.Tech", 99.9f);

        Student s2 =
                new Student("Venky", 21, "B.Ed", 59.9f);

        s1.displayDetails();

        System.out.println("----------------");

        s2.displayDetails();
    }
}
