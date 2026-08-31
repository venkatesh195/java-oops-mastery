class Student {

    String name;
    int age;

    Student() {

        System.out.println("No-argument constructor");
    }

    Student(String name) {

        this();

        this.name = name;

        System.out.println("One-argument constructor");
    }

    Student(String name, int age) {

        this(name);

        this.age = age;

        System.out.println("Two-argument constructor");
    }
}

public class Main {

    public static void main(String[] args) {

        Student s1 =
                new Student("Venkatesh", 23);
    }
}
