class Student {

    String name;
    int age;
}

public class Main {

    public static void main(String[] args) {

        Student s1 = new Student();

        s1.name = "Venkatesh";
        s1.age = 23;

        System.out.println("Name: " + s1.name);
        System.out.println("Age: " + s1.age);
    }
}
