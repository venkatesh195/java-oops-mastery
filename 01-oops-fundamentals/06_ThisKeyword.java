class Student {

    String name;
    int age;

    Student(String name, int age) {

        this.name = name;
        this.age = age;
    }

    void display() {

        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
    }
}

public class Main {

    public static void main(String[] args) {

        Student s1 = new Student("Venkatesh", 23);

        s1.display();
    }
}
